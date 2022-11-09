package co.edu.unisabana.caf.controller;

import co.edu.unisabana.caf.models.Usuario;
import co.edu.unisabana.caf.repository.UsuariosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {

    UsuariosRepository repository = new UsuariosRepository();

    @RequestMapping(value = "api/reserva", method = RequestMethod.GET)
    public List<Usuario> getUsuario(@PathVariable String correo){
        List<Usuario> usuarios = repository.BD();
        List<Usuario> usuario = new ArrayList<>();
        usuarios.forEach(dato -> {
            if (dato.getCorreo().equals(correo)) {
                usuario.add(dato);
            }
        });
        return usuario;
    }
}
