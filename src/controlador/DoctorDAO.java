package controlador;

import Conexion.CConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;


public class DoctorDAO {
    
     private Connection con;

    public DoctorDAO() {
        CConexion conexion = new CConexion();
        this.con = conexion.establecerConexion();
    }
    
    

    public ArrayList<String[]> obtenerDoctoresFiltrados(String especialidad, String departamento, String distrito, java.sql.Date fecha) {
        ArrayList<String[]> doctoresDisponibles = new ArrayList<>();
        CConexion conexion = new CConexion();
        Connection con = conexion.establecerConexion();

     
    String sql = "SELECT d.nombre, d.apellido, d.correo, d.direccion " +
                 "FROM Doctores d " +
                 "LEFT JOIN Citas c ON d.dni = c.paciente_dni AND c.fecha = ? " +
                 "WHERE d.especialidad = ? AND d.departamento = ? AND d.distrito = ? " +
                 "AND c.paciente_dni IS NULL";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setDate(1, fecha);
            stmt.setString(2, especialidad);
            stmt.setString(3, departamento);
            stmt.setString(4, distrito);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String app = rs.getString("apellido");
                String cor = rs.getString("correo");
                String dir = rs.getString("direccion");
                doctoresDisponibles.add(new String[]{nombre, app, cor, dir});
            }

        } catch (Exception e) {
            System.out.println("Error al obtener doctores: " + e.getMessage());
        }

        return doctoresDisponibles;
    }
    
    public boolean crearDoctor(String nombre, String apellido, String dni, String direccion, String correo, String telefono, String especialidad, String departamento, String distrito) {
    String sql = "INSERT INTO Doctores (nombre, apellido, dni, direccion, correo, telefono, especialidad, departamento, distrito) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    try (PreparedStatement stmt = con.prepareStatement(sql)) {
        stmt.setString(1, nombre);
        stmt.setString(2, apellido);
        stmt.setString(3, dni);
        stmt.setString(4, direccion);
        stmt.setString(5, correo);
        stmt.setString(6, telefono);
        stmt.setString(7, especialidad);
        stmt.setString(8, departamento);
        stmt.setString(9, distrito);
        return stmt.executeUpdate() > 0; // Retorna verdadero si se insertó correctamente
    } catch (Exception e) {
        System.out.println("Error al crear doctor: " + e.getMessage());
        return false;
    }
}

public boolean actualizarDoctor(String nombre, String apellido, String dni, String direccion, String correo, String telefono, String especialidad, String departamento, String distrito) {
    String sql = "UPDATE Doctores SET nombre=?, apellido=?, direccion=?, correo=?, telefono=?, especialidad=?, departamento=?, distrito=? WHERE dni=?";
    
    try (PreparedStatement stmt = con.prepareStatement(sql)) {
        stmt.setString(1, nombre);
        stmt.setString(2, apellido);
        stmt.setString(3, direccion);
        stmt.setString(4, correo);
        stmt.setString(5, telefono);
        stmt.setString(6, especialidad);
        stmt.setString(7, departamento);
        stmt.setString(8, distrito);
        stmt.setString(9, dni);
        return stmt.executeUpdate() > 0; // Retorna verdadero si se actualizó correctamente
    } catch (Exception e) {
        System.out.println("Error al actualizar doctor: " + e.getMessage());
        return false;
    }
}

public boolean eliminarDoctor(String dni) {
    String sql = "DELETE FROM Doctores WHERE dni=?";
    
    try (PreparedStatement stmt = con.prepareStatement(sql)) {
        stmt.setString(1, dni);
        return stmt.executeUpdate() > 0; // Retorna verdadero si se eliminó correctamente
    } catch (Exception e) {
        System.out.println("Error al eliminar doctor: " + e.getMessage());
        return false;
    }
}

    
  public String[] obtenerDoctorPorDNI(String dni) {
    String sql = "SELECT nombre, apellido, direccion, correo, telefono, especialidad, departamento, distrito FROM Doctores WHERE dni = ?";
    String[] doctorData = null;

    try (Connection con = new CConexion().establecerConexion();
         PreparedStatement stmt = con.prepareStatement(sql)) {
        stmt.setString(1, dni);
        ResultSet rs = stmt.executeQuery();
        
        if (rs.next()) {
            doctorData = new String[] {
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("direccion"),
                rs.getString("correo"),
                rs.getString("telefono"),
                rs.getString("especialidad"),
                rs.getString("departamento"),
                rs.getString("distrito")
            };
        }
    } catch (SQLException e) {
        System.out.println("Error al obtener doctor por DNI: " + e.getMessage());
    }
    return doctorData;
}

    
    
}
