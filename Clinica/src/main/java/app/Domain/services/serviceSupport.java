package app.dominio.services;

public class serviceSupport {
    
    private String nameSupport;
    private String description;
    
    public serviceSupport(String nameSupport, String description){
        this.nameSupport = nameSupport;
        this.description = description;
    }
    
    public void mostrarInfo(){
        System.out.println("Servicio de apoyo: " + nameSupport);
        System.out.println("Descripcion: " + description);
    }
    
}