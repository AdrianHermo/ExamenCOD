import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Acceso a datos
 */
public class BD {
    /**
     * Metodo para obtener la conexion
     * @return product name
     */
    public String getConexion() throws SQLException {
        // accedemos a la base MySql con jdbc
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Ex", "root", "root");
        return conexion.getMetaData().getDatabaseProductName();
    }

}
