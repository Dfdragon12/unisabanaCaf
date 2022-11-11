package co.edu.unisabana.caf.repository;

import co.edu.unisabana.caf.models.Reservas;

import java.util.ArrayList;
import java.util.List;

public class CAFRepository {

    List<Reservas> BD = new ArrayList<>();
    public List<Reservas> BD(){
        BD.add(new Reservas("Lunes","7am","juliamcupa@unisabana.edu.co"));
        BD.add(new Reservas("Lunes","10am","juliamcupa@unisabana.edu.co"));
        BD.add(new Reservas("Martes","7am","juliamcupa@unisabana.edu.co"));
        return BD;
    }
}
