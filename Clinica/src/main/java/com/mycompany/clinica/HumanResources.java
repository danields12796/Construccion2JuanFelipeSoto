
package com.mycompany.clinica;


public class HumanResources {
    
    private String nameService;
    private int numberEmployees;
    
    public HumanResources(String nameService, int numberEmployees){
        this.nameService = nameService;
        this.numberEmployees = numberEmployees;
    }
    
    public void mostrarInfo(){
        System.out.println("Servicio de soporte y recursos Humanos: " + nameService);
        System.out.println("Cantidad de empleados: " + numberEmployees);
    }
    
}
