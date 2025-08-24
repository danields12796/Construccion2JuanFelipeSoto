package app.dominio.ports;

import app.dominio.model.Usuario;
import java.util.Optional;
import java.util.List;

public interface UsuarioRepositoryPort {
    Optional<Usuario> findByCedula(String cedula);
    Optional<Usuario> findByUsername(String username);
    Usuario save(Usuario usuario);
    void deleteByCedula(String cedula);
    List<Usuario> findAll();
}

