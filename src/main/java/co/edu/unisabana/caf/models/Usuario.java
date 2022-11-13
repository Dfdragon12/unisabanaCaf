package co.edu.unisabana.caf.models;

public class Usuario {

    private String correo;
    private String password;

    public Usuario(String correo, String password) {
        this.correo = correo;
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPassword() {
        return password;
    }

}
