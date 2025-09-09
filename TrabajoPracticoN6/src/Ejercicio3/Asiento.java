package Ejercicio3;

public class Asiento {

   private int numAsiento;
    private boolean Estado;

    public Asiento(int numAsiento, boolean estado) {
        this.numAsiento = numAsiento;
        Estado = estado;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }
}
