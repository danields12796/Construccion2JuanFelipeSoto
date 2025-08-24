package app.dominio.model;

public class ContactoEmergencia {
    private String nombres;
    private String apellidos;
    private String relacion;
    private String telefono; 

    
}

public class Eps {
    private String Ips;
    private String numeroEps;
    private boolean activa;
    private String fechaFin; 

    
}

public class Paciente {
    private final String cedula;     
    private String nombreCompleto;
    private String fechaNacimiento;  
    private String genero;
    private String direccion;
    private String telefono;        
    private String correo;
    private ContactoEmergencia emergencia; 
    private Poliza poliza;                

    public Paciente(String cedula, String nombreCompleto) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
    }
    public String getCedula(){ return cedula; }
    
}