
package controlador;

import Conexion.CConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdministradorDAO {
     private Connection connection;

    public AdministradorDAO() {
        CConexion conexion = new CConexion();
        this.connection = conexion.establecerConexion();
    }
    public boolean validarAdministrador(String correo, String contraseña) {
        CConexion conexion = new CConexion();
        Connection con = conexion.establecerConexion();
        
        String sql = "SELECT * FROM Administrador WHERE correo = ? AND contraseña = ?";
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, correo);
            stmt.setString(2, contraseña);
            
            ResultSet rs = stmt.executeQuery();
            return rs.next(); 
        } catch (Exception e) {
            System.out.println("Error al validar el administrador: " + e.getMessage());
            return false;
        }
    }
    
    
    
    public boolean guardarAdministrador(String nombres, String apellidos, String correo, String dni, String rol, String contraseña) {
        String query = "INSERT INTO Administrador (nombre, apellido, correo, dni, rol, contraseña) VALUES (?, ?, ?, ?, ?, ?)";
        CConexion conexion = new CConexion();
    Connection connection = conexion.establecerConexion();
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, nombres);
            stmt.setString(2, apellidos);
            stmt.setString(3, correo);
            stmt.setString(4, dni);
            stmt.setString(5, rol);
            stmt.setString(6, contraseña);
            return stmt.executeUpdate() > 0; 
        } catch (SQLException e) {
            e.printStackTrace(); 
            return false;
        }
    }
    
    
    
}
