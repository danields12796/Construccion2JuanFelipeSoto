package app.dominio.model;

public enum Rol { RRHH, ADMINISTRATIVO, ENFERMERA, MEDICO, SOPORTE }

public class Usuario {
    private final String cedula;      
    private String nombreCompleto;
    private String correo;
    private String telefono;
    private String fechaNacimiento;   
    private String direccion;
    private Rol rol;
    private String username;         
    private String password;          

    public Usuario(String cedula, String nombreCompleto, Rol rol, String username, String password) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.rol = rol;
        this.username = username;
        this.password = password;
    }

    public String getCedula(){ return cedula; }
    public Rol getRol(){ return rol; }
    public String getUsername(){ return username; }
    
}




