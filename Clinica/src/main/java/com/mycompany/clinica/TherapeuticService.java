
package com.mycompany.clinica;


public class TherapeuticService {
    private String nameService;
    private String therapyType;
    
    public TherapeuticService(String nameService, String therapyType){
        this.nameService = nameService;
        this.therapyType = therapyType;
    }
    
    public void showInfo(){
        System.out.println("Servicio terapeutico: " + nameService);
        System.out.println("Tipo de terapia: " + therapyType);
    }
    
}
