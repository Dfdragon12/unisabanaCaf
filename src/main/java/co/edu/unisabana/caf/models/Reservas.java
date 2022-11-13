package co.edu.unisabana.caf.models;

public class Reservas {

    private String dia;
    private String hora;
    private String correo;

    public Reservas(String dia, String hora, String correo) {
        this.dia = dia;
        this.hora = hora;
        this.correo = correo;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }
}
