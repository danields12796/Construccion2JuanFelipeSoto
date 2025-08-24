package app.dominio.ports;

import app.dominio.model.Paciente;
import java.util.Optional;
import java.util.List;

public interface PacienteRepositoryPort {
    Optional<Paciente> findByCedula(String cedula);
    Paciente save(Paciente paciente);
    List<Paciente> findAll();
}