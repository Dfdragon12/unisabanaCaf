package co.edu.unisabana.caf.controller;

import co.edu.unisabana.caf.dao.ReservaDaoImp;
import co.edu.unisabana.caf.models.Reservas;
import co.edu.unisabana.caf.models.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class ReservaControllerTest {

    @Mock
    private ReservaDaoImp ReservaDaoImp;

    @InjectMocks
    private ReservaController test;

    private Reservas reserva;

    @BeforeEach
    public void settings(){
        MockitoAnnotations.openMocks(this);
        reserva = new Reservas("Lunes","7:00 am", "juliamcupa@unisabana.edu.co");
    }

    @Test
    public void Given_true_When_getsReserva_then_return_OK(){
        when(ReservaDaoImp.verificarReserva(reserva)).thenReturn(true);
        assertEquals("OK", test.getsReserva(reserva));
    }
    @Test
    public void Given_false_When_getsReserva_then_return_Fail(){
        when(ReservaDaoImp.verificarReserva(reserva)).thenReturn(false);
        assertEquals("Fail", test.getsReserva(reserva));
    }
}
