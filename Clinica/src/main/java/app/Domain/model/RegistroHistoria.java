package app.dominio.model;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class RegistroHistoria {
    private LocalDate fecha;              
    private String cedulaMedico;         
    private String motivo;
    private String sintomatologia;
    private String diagnostico;

    
    private String nroOrdenMed;           
    private String idMedicamento;
    private String dosis;
    private String duracion;
    private Double costoMed;

   
    private String nroOrdenProc;          
    private String idProcedimiento;
    private Integer cantidadVeces;
    private String frecuencia;
    private Boolean requiereEspecialista;
    private String idTipoEspecialista;
    private Double costoProc;

    
    private String nroOrdenDx;            
    private String idAyudaDx;
    private Integer cantidadDx;
    private Boolean requiereEspDx;
    private String idTipoEspDx;
    private Double costoDx;

    
}

public class HistoriaClinica {
    private final String cedulaPaciente; 
    private final Map<LocalDate, RegistroHistoria> registros = new LinkedHashMap<>();

    public HistoriaClinica(String cedulaPaciente){ this.cedulaPaciente = cedulaPaciente; }
    public Map<LocalDate, RegistroHistoria> getRegistros(){ return registros; }
}