package co.edu.unisabana.caf.dao;

import co.edu.unisabana.caf.models.Usuario;
import co.edu.unisabana.caf.repository.UsuariosRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository

public class UsuarioDaoImp implements UsuarioDao{

    Boolean resultado = false;
    UsuariosRepository repository = new UsuariosRepository();

    @Override
    public boolean credenciales (Usuario usuario) {
        List<Usuario> BD = repository.BD();
        BD.forEach(dato -> {
            if (usuario.getCorreo().equals(dato.getCorreo()) && usuario.getPassword().equals(dato.getPassword())) {
                resultado = true;
            }
        });
        return resultado;
    }
}
