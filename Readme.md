#  Release v1.0 - ExamenCOD

##  Descripción del proyecto

Este proyecto consiste en la preparación de una versión estable (v1.0) a partir de diferentes ramas de desarrollo, aplicando buenas prácticas de control de versiones con Git y GitHub.

El objetivo principal es integrar correctamente las funcionalidades de las distintas ramas, asegurando la estabilidad del código final.

---

##  Estructura de ramas

El repositorio está organizado en las siguientes ramas:

- **main** → Rama principal donde se genera la versión final estable (release).
- **datos** → Contiene la lógica de conexión a la base de datos.
- **interface** → Contiene la interfaz gráfica de la aplicación.
- **readme** → Rama utilizada exclusivamente para la documentación del proceso.

---

##  Metodología de trabajo

Se ha seguido un flujo de trabajo basado en Git Flow simplificado:

1. Fork del repositorio original.
2. Clonado del repositorio en entorno local (PyCharm).
3. Creación de rama `readme` para documentar el proceso.
4. Análisis de cada rama funcional (`datos` e `interface`).
5. Integración progresiva en `main`.
6. Creación de release final v1.0.

---

##  Explicación de los merges realizados

Durante el desarrollo del proyecto se han realizado varios merges entre ramas con el objetivo de integrar funcionalidades de forma controlada en la rama principal (`main`).

---

###  Merge de la rama datos

La rama `datos` contiene la lógica de conexión a la base de datos.

Se realiza un merge directo hacia `main` porque:

- El código es funcional
- No presenta errores
- Es compatible con el resto del proyecto

```
main ← datos
```

✔ Resultado: la funcionalidad de base de datos queda integrada en la versión final.

---

###  Problema en la rama interface

Durante la revisión de la rama `interface` se detecta un problema:

- El **último commit** introduce un diálogo de error incorrecto
- Este cambio no es válido para la versión final

####  Commit problemático:
```
1155ffac20e1e24700634b6668019aa634b43da9
añadido dialogo con mensaje de error
```

####  Commit correcto anterior:
```
7ee1151232803eecc3c70082b4d177a94cb00d4d
añadido dialogo con mensaje
```

---

###  Decisión tomada

En lugar de incluir toda la rama `interface`, se decide:

✔ NO incluir el último commit  
✔ Utilizar el commit anterior válido  
✔ Crear una rama limpia desde ese punto (`interface_clean`)

Esto se hace para:

- Evitar introducir errores en producción
- Mantener estabilidad del sistema
- Cumplir los requisitos de la release

---

###  Merge de interface_clean

Una vez creada la rama limpia, se realiza el merge:

```
main ← interface_clean
```

✔ Solo se integra código correcto  
✔ Se excluye el commit defectuoso  

---

##  Gestión de Issues

Durante el desarrollo se crean y cierran los siguientes issues:

- Issue #1 → Integración de datos
- Issue #2 → Corrección de rama interface (commit defectuoso)
- Issue #3 → Preparación de release v1.0

Cada issue se cierra mediante commits o pull requests usando referencias `Closes #X`.

---

##  Pull Requests

Se utilizan Pull Requests para asegurar una integración controlada:

- PR 1 → Integración de `datos`
- PR 2 → Integración de `interface_clean`
- PR 3 → Preparación de release v1.0

Cada PR incluye:

- Descripción del cambio
- Justificación técnica
- Referencia a issues

---

##  Release v1.0

Una vez finalizada la integración, se crea la versión estable:

- 🔖 Tag: `v1.0`
- 🚀 Release publicada en GitHub

### Contenido de la release

- Código funcional integrado
- Sin commits defectuosos
- Proyecto estable y listo para uso

---

## ⚙ Comandos utilizados

```
git checkout main
git merge datos
git checkout interface
git log
git checkout main
git merge interface_clean
git tag v1.0
git push origin main --tags
```

---

##  Conclusión

Se ha conseguido una integración correcta de todas las ramas del proyecto, asegurando:

✔ Código estable  
✔ Eliminación de errores detectados  
✔ Buen uso de Git (ramas, commits, tags, PRs)  
✔ Trazabilidad mediante issues  

El resultado final es la versión **v1.0 del proyecto ExamenCOD** lista para producción.