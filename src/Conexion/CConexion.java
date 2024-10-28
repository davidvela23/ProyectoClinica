package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class CConexion {

    
    private Connection connection = null;
    
    public Connection establecerConexion() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Clinica;encrypt=true;trustServerCertificate=true;";
            String user = "sa"; 
            String password = "Alumno@123"; 
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa con SQL Server");
        } catch (SQLException ex) {
            System.out.println("Error de conexión: " + ex.getMessage());
        }
        return connection;
    }
 
    
}
