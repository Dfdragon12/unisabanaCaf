package co.edu.unisabana.caf.dao;

import co.edu.unisabana.caf.models.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository

public class UsuarioDaoImp implements UsuarioDao{

    Boolean resultado = false;

    @Override
    public boolean credenciales (Usuario usuario) {
        List<Usuario> BD = new ArrayList<>();
        BD.add(new Usuario("mateomopa@unisabana.edu.co","1234"));
        BD.add(new Usuario("juliamcupa@unisabana.edu.co", "4321"));
        BD.add(new Usuario("Dfdragon@unisabana.edu.co", "1111"));
        BD.forEach(dato -> {
            if (usuario.getCorreo().equals(dato.getCorreo()) && usuario.getPassword().equals(dato.getPassword())) {
                resultado = true;
            }
        });
        return resultado;
    }
}
