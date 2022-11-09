package co.edu.unisabana.caf.repository;

import co.edu.unisabana.caf.models.Reservas;
import co.edu.unisabana.caf.models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ReservaRepository {
    public List<Reservas> BD(){
        List<Reservas> BD = new ArrayList<>();
        BD.add(new Reservas("Lunes","7am","juliamcupa@unisabana.edu.co"));
        BD.add(new Reservas("Lunes","10am","juliamcupa@unisabana.edu.co"));
        BD.add(new Reservas("Martes","7am","juliamcupa@unisabana.edu.co"));
        return BD;
    }
}
