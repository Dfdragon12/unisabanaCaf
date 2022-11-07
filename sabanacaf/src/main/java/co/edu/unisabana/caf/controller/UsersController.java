package co.edu.unisabana.caf.controller;

import co.edu.unisabana.caf.models.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {



    @RequestMapping(value = "api/usuarios/{correo}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable String correo){
        Usuario usuario = new Usuario();
        usuario.setCorreo("mateomopa@unisabana.edu.co");
        usuario.setPassword("1234");
        return usuario;
    }
}
