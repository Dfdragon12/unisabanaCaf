package co.edu.unisabana.caf.repository;

import co.edu.unisabana.caf.models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuariosRepository {

    public List<Usuario> BD(){
        List<Usuario> BD = new ArrayList<>();
        BD.add(new Usuario("mateomopa@unisabana.edu.co","1234"));
        BD.add(new Usuario("juliamcupa@unisabana.edu.co", "4321"));
        BD.add(new Usuario("Dfdragon@unisabana.edu.co", "1111"));
        return BD;
    }
}
