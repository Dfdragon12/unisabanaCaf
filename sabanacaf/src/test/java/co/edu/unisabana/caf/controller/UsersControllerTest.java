package co.edu.unisabana.caf.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsersControllerTest {

    private UsersController test = new UsersController();

    @Test
    public void Given_correo_ok_When_getUsuario_then_return_usuario(){
        assertEquals(1, test.getUsuario("juliamcupa@unisabana.edu.co").size());
    }
    @Test
    public void Given_correo_wrong_When_getUsuario_then_return_null(){
        assertEquals(0, test.getUsuario("pepito@gmail.com").size());
    }
}
