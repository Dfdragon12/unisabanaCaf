package co.edu.unisabana.caf.dao;

import co.edu.unisabana.caf.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    List <Usuario> getUsuario();

    boolean credenciales(Usuario usuario);


}
