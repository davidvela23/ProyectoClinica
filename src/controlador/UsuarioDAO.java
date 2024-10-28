
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Conexion.CConexion;
import java.sql.ResultSet;
import modelo.Usuario;

public class UsuarioDAO {

    
 
    
    public boolean registrarUsuario(String nombres, String apellidos, String telefono, String dni, String correo, String contrasena) {
        CConexion conexion = new CConexion();
        Connection conn = conexion.establecerConexion();
        boolean registroExitoso = false;

        if (conn != null) {
            String sql = "INSERT INTO Usuarios (Nombres, Apellidos, Telefono, DNI, Correo, Contrasena) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, nombres);
                pstmt.setString(2, apellidos);
                pstmt.setString(3, telefono);
                pstmt.setString(4, dni);
                pstmt.setString(5, correo);
                pstmt.setString(6, contrasena);

                int rowsAffected = pstmt.executeUpdate();
                registroExitoso = rowsAffected > 0;
            } catch (SQLException e) {
                e.printStackTrace(); 
            } finally {
            }
        }
        return registroExitoso;
    }
    
    
    
    // Método para validar el usuario
    public boolean validarUsuario(String dni, String contrasena) {
        
        CConexion conexion = new CConexion();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = conexion.establecerConexion(); // Método para obtener conexión
            String query = "SELECT * FROM usuarios WHERE dni = ? AND contrasena = ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, dni);
            statement.setString(2, contrasena);

            resultSet = statement.executeQuery();

            // Si se encuentra un resultado, el usuario es válido
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            // Cierra los recursos en el bloque finally
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }}
        
        
        public Usuario obtenerDatosUsuario(String dni) {
        CConexion conexion = new CConexion();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Usuario usuario = null;

        try {
            connection = conexion.establecerConexion();
            String query = "SELECT * FROM usuarios WHERE dni = ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, dni);

            resultSet = statement.executeQuery();

            if (resultSet.next()) {
              
                String nombres = resultSet.getString("Nombres");
                String apellidos = resultSet.getString("Apellidos");
                String telefono = resultSet.getString("Telefono");
                String correo = resultSet.getString("Correo");

                usuario = new Usuario(nombres, apellidos, telefono, dni, correo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return usuario;
    }
        
        

    
}




