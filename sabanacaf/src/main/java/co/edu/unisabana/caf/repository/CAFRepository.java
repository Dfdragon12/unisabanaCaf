package co.edu.unisabana.caf.repository;

import co.edu.unisabana.caf.models.Reservas;

import java.util.ArrayList;
import java.util.List;

public class CAFRepository {

    List<Reservas> BDReservas = new ArrayList<>();
    public List<Reservas> BD(){
        BDReservas.add(new Reservas("Lunes","7am","juliamcupa@unisabana.edu.co"));
        BDReservas.add(new Reservas("Lunes","10am","juliamcupa@unisabana.edu.co"));
        BDReservas.add(new Reservas("Martes","7am","juliamcupa@unisabana.edu.co"));
        return BDReservas;
    }

    public void crearReserva(Reservas reserva){
        BDReservas.add(reserva);
    }

}
