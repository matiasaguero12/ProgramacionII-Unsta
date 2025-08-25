package Ejercicio2.Registro;

public class Registro {

    private int horaInvertida;
    private String informe;

    public Registro(int horaInvertida, String informe) {
        this.horaInvertida = horaInvertida;
        this.informe = informe;
    }

    public int getHoraInvertida() {
        return horaInvertida;
    }

    public void setHoraInvertida(int horaInvertida) {
        this.horaInvertida = horaInvertida;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }
}
