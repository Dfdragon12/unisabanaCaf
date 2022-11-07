package co.edu.unisabana.caf.dao;

import co.edu.unisabana.caf.models.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public class UsuarioDaoImp implements UsuarioDao{


    @Override
    public List<Usuario> getUsuario() {
        return null;
    }



    @Override
    public boolean credenciales (Usuario password) {
        String correo = "mateomopa@unisbana.edu.co";
        if (password.equals("1234") && correo.equals("mateomopa@unisabana.edu.co")) {
            return true;
        }
        return false;
    }
}
