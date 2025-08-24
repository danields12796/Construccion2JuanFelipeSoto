

package com.mycompany.clinica;


public class Clinica {

    public static void main(String[] args) {
        
        serviceSupport laboratorio = new serviceSupport("Laboratorio Clínico", "Exámenes de sangre y orina");
        ServiceAdministrative facturacion = new ServiceAdministrative("Facturación", "María Pérez");
        HumanResources rrhh = new HumanResources("Recursos Humanos", 15);

        laboratorio.mostrarInfo();
        System.out.println("-----------------");
        facturacion.mostrarInfo();
        System.out.println("-----------------");
        rrhh.mostrarInfo();
        
    }
}
