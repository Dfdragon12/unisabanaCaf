package co.edu.unisabana.caf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GymInfoController {

    @GetMapping("")
    public void BringIfo(){
        /*trae la informacion de la BD pa la pagina*/
    }
}
