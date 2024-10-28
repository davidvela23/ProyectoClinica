
package modelo;


public class Usuario {
    
    private String nombres;
    private String apellidos;
    private String telefono;
    private String dni;
    private String correo;

    public Usuario(String nombres, String apellidos, String telefono, String dni, String correo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.dni = dni;
        this.correo = correo;
    }

    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public String getTelefono() { return telefono; }
    public String getDni() { return dni; }
    public String getCorreo() { return correo; }
    
}
