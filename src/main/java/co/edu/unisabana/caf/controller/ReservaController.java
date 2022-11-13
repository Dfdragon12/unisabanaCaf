package co.edu.unisabana.caf.controller;

import co.edu.unisabana.caf.dao.ReservaDaoImp;
import co.edu.unisabana.caf.models.Reservas;
import co.edu.unisabana.caf.models.Usuario;
import co.edu.unisabana.caf.repository.UsuariosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReservaController {

    ReservaDaoImp reservaDaoImp = new ReservaDaoImp();

    @RequestMapping(value = "api/reserva", method = RequestMethod.POST)
    public String getsReserva(@PathVariable Reservas reserva){
        if(reservaDaoImp.verificarReserva(reserva)){
            return "OK";
        }return "Fail";
    }
}
