package app.dominio.services;

public class DiagnosticService {
    private String nameService;
    private String examType;
    
    public DiagnosticService(String nameService, String examType){
        this.nameService = nameService;
        this.examType = examType;
    }
    
    public void showInfo(){
        System.out.println("Servicio Diagnostico: " + nameService);
        System.out.println("Tipo de Examen: " + examType);
    }
}
