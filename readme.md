Guía para el ejercicio de GitHub e IntelliJ IDEA

Pasos a seguir

1. Crear el repositorio en GitHub

Ir a GitHub y crear un nuevo repositorio llamado proyecto-final.

Añadir un .gitignore específico para IntelliJ IDEA y Java.

Inicializar el repositorio con un README.md básico.

2. Clonar el repositorio en IntelliJ IDEA

$ git clone <URL_DEL_REPOSITORIO>
$ cd proyecto-final

3. Crear ramas según las instrucciones

$ git checkout -b datos
$ git checkout -b interface
$ git checkout -b readme

4. Desarrollo en la rama datos

Crear una clase de conexión a la base de datos en la carpeta adecuada.

Realizar un commit claro y detallado.

$ git add .
$ git commit -m "feat: agregar clase de conexión a la base de datos"

Crear un issue asociado a esta tarea y cerrarlo desde el commit:

$ git commit -m "feat: agregar clase de conexión a la base de datos. Close #1"

Subir los cambios a GitHub:

$ git push origin datos

5. Desarrollo en la rama interface

Crear la interfaz gráfica según los requisitos.

Comprobar el historial de commits:

$ git log

Identificar el commit correcto y realizar un git reset para descartar el último commit incorrecto:

$ git reset --hard HEAD~1

Hacer un commit limpio con los cambios correctos:

$ git add .
$ git commit -m "feat: agregar interfaz gráfica funcional"

Subir los cambios a GitHub:

$ git push origin interface

6. Crear el README.md en la rama readme

Documentar todos los pasos hasta el momento.

Justificar decisiones técnicas tomadas.

Incluir ejemplos de comandos en Markdown.

### Comandos utilizados
- `git checkout -b <nombre_rama>`: Crear una nueva rama.
- `git reset --hard HEAD~1`: Eliminar el último commit para corregir errores.

Guardar y hacer commit.

$ git add README.md
$ git commit -m "docs: agregar instrucciones y justificación en el README"
$ git push origin readme

7. Realizar el merge final

Cambiar a la rama main:

$ git checkout main

Realizar el merge de las ramas datos y interface:

$ git merge datos
$ git merge interface

8. Etiquetar el último commit con v1.0

$ git tag v1.0
$ git push origin v1.0

9. Crear la release en GitHub

Ir al repositorio en GitHub.

Ir a la sección de Releases.

Hacer clic en Draft a new release.

Seleccionar la etiqueta v1.0 y proporcionar una descripción clara.

Publicar la release.

10. Revisión Final

Confirmar que todas las ramas excepto readme están correctamente fusionadas en main.

Verificar que los issues estén cerrados y documentados.

