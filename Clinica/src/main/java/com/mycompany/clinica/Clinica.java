

package com.mycompany.clinica;


public class Clinica {

    public static void main(String[] args) {
        
        serviceSupport laboratorio = new serviceSupport("Laboratorio Clínico", "Exámenes de sangre y orina");
        ServiceAdministrative facturacion = new ServiceAdministrative("Facturación", "María Pérez");
        HumanResources rrhh = new HumanResources("Recursos Humanos", 15);
        BasicMedicalService consultation = new BasicMedicalService("General Consultation", "Dr. John Smith");
        DiagnosticService radiology = new DiagnosticService("X-Ray", "Chest Radiography");
        TherapeuticService physiotherapy = new TherapeuticService("Physical Rehabilitation", "Post-surgery Physiotherapy");

        laboratorio.showInfo();
        System.out.println("-----------------");
        facturacion.showInfo();
        System.out.println("-----------------");
        rrhh.showInfo();
        consultation.showInfo();
        System.out.println("-----------------");
        radiology.showInfo();
        System.out.println("-----------------");
        physiotherapy.showInfo();
        
    }
}
