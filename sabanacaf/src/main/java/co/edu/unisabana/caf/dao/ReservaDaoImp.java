package co.edu.unisabana.caf.dao;

import co.edu.unisabana.caf.models.Reservas;
import co.edu.unisabana.caf.repository.CAFRepository;

import java.util.List;

public class ReservaDaoImp implements ReservasDao{

    CAFRepository repository = new CAFRepository();
    boolean resultado = true;
    @Override
    public boolean verificarReserva(Reservas reservas) {
    List<Reservas> existentes = repository.BD();
        existentes.forEach(dato -> {
            if (dato.getDia().equals(reservas.getDia()) && dato.getHora().equals(reservas.getHora())) {
                resultado = false;
            }
        });
        return resultado;
    }
}
