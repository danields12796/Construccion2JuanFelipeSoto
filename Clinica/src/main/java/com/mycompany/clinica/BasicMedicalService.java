
package com.mycompany.clinica;


public class BasicMedicalService {
    private String nameService;
    private String responsibleDoctor;
    
    public BasicMedicalService(String nameService, String responsibleDoctor){
        this.nameService = nameService;
        this.responsibleDoctor = responsibleDoctor;
    }
    
    public void showInfo(){
        System.out.println("Servicio Medico Basico: " + nameService);
        System.out.println("Medico responsable: " + responsibleDoctor);
    }
    
}
