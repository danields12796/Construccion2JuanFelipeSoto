package app.dominio.ports;

import app.dominio.model.HistoriaClinica;
import java.time.LocalDate;
import java.util.Optional;

public interface HistoriaClinicaPort {
    Optional<HistoriaClinica> findByCedulaPaciente(String cedula);
    HistoriaClinica save(HistoriaClinica historia);
    boolean existsRegistro(String cedulaPaciente, LocalDate fecha);
}

