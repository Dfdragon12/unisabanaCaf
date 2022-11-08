package co.edu.unisabana.caf.dao;

import co.edu.unisabana.caf.models.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class UsuarioDaoImpTest {

    private UsuarioDaoImp test ;

    public UsuarioDaoImpTest(UsuarioDaoImp test) {
        this.test = test;
    }

    @Test
    public void Given_user_and_password_ok_When_credenciales_Then_return_true(){
        Usuario user = new Usuario("juliamcupa@unisabana.edu.co", "4321");
        boolean result = test.credenciales(user);
        assertTrue(result);
    }

    @Test
    public void Given_user_ok_and_password_wrong_When_credenciales_Then_return_false(){
        Usuario user = new Usuario("juliamcupa@unisabana.edu.co", "1234");
        boolean result = test.credenciales(user);
        assertFalse(result);
    }
    @Test
    public void Given_user_wrong_and_password_ok_When_credenciales_Then_return_false(){
        Usuario user = new Usuario("pepito@gmail.com","4321");
        boolean result = test.credenciales(user);
        assertFalse(result);
    }
    @Test
    public void Given_user_and_password_wrong_When_credenciales_Then_return_false(){
        Usuario user = new Usuario("antonio@gmail.com","contra_erronea");
        boolean result = test.credenciales(user);
        assertFalse(result);
    }

}
