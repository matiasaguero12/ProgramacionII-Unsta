package Ejercicio2;

public class Reloj {

    private int hora;
    private int minuto;
    private int segundo;

    public Reloj() {

    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    public void establecerHora(int hora,int minuto,int segundo){
        boolean valido = true;

        if (hora < 0 || hora > 23) {
            System.out.println("Hora inválida. Debe ser entre 0 y 23.");
            valido = false;
        }
        if (minuto < 0 || minuto > 59) {
            System.out.println("Minuto inválido. Debe ser entre 0 y 59.");
            valido = false;
        }
        if (segundo < 0 || segundo > 59) {
            System.out.println("Segundo inválido. Debe ser entre 0 y 59.");
            valido = false;
        }

        if (valido) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            System.out.println("No se estableció la hora debido a valores inválidos.");
        }
    }

    public void mostrarHora(){
        System.out.printf("Reloj: %02d:%02d:%02d ",getHora(),getMinuto(),getSegundo());
    }
    public void avanzarSegundo(){
        segundo++;
        if(this.segundo==60){
          this.segundo=0;
          this.minuto++;

        }
        if(this.minuto==60){
            this.minuto=0;
            this.hora++;
        }
        if(this.hora==24){
            this.hora=0;
        }
    }


}
