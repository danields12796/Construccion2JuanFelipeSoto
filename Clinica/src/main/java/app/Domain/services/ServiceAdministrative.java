package app.dominio.services;

public class ServiceAdministrative {
    
    private String nameService;
    private String manager;
    
    public ServiceAdministrative(String nameService, String manager){
        this.nameService = nameService;
        this.manager = manager;
    }
    
    public void mostrarInfo(){
        System.out.println("Servicio Administrativo: " + nameService);
        System.out.println("Encargado: " + manager);
    }
}
