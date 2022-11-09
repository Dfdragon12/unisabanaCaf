package co.edu.unisabana.caf.dao;

import co.edu.unisabana.caf.models.Reservas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ReservaDaoImpTest {

    ReservaDaoImp test = new ReservaDaoImp();

    @Test
    public void Given_day_and_time_ok_When_verificarReserva_Then_return_true(){
        Reservas reserva = new Reservas("Viernes","8am","juliamcupa@unisabana.edu.co");
        assertTrue(test.verificarReserva(reserva));
    }

    @Test
    public void Given_day_wrong_and_time_ok_When_verificarReserva_Then_return_true(){
        Reservas reserva = new Reservas("Lunes","8am","juliamcupa@unisabana.edu.co");
        assertTrue(test.verificarReserva(reserva));
    }

    @Test
    public void Given_day_ok_and_time_wrong_When_verificarReserva_Then_return_true(){
        Reservas reserva = new Reservas("Viernes","7am","juliamcupa@unisabana.edu.co");
        assertTrue(test.verificarReserva(reserva));
    }

    @Test
    public void Given_day_and_time_wrong_When_verificarRserva_Then_return_false(){
        Reservas reserva = new Reservas("Lunes","7am","juliamcupa@unisabana.edu.co");
        assertFalse(test.verificarReserva(reserva));
    }
}
