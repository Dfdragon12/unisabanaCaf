package co.edu.unisabana.caf.controller;

import co.edu.unisabana.caf.dao.UsuarioDao;
import co.edu.unisabana.caf.models.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class AuthControllerTest {

    @Mock
    private UsuarioDao usuarioDao;

    @InjectMocks
    private AuthController test;

    private Usuario user;

    @BeforeEach
    public void settings(){
        MockitoAnnotations.openMocks(this);
        user = new Usuario("juliamcupa@unisabana.edu.co","4321");
    }
    @Test
    public void Given_true_When_login_Then_return_ok(){
        when(usuarioDao.credenciales(user)).thenReturn(true);
        assertEquals("OK",test.login(user));
    }
    @Test
    public void Given_false_When_login_Then_return_fail(){
        when(usuarioDao.credenciales(user)).thenReturn(false);
        assertEquals("Fail",test.login(user));
    }
}
