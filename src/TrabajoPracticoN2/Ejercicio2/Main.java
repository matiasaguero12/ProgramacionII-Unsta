package Ejercicio2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int eleccion;
        Reloj reloj= new Reloj();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Introduce la hora (0-23):");
        int hora = scanner.nextInt();
        System.out.println("Introduce el minuto (0-59):");
        int minuto = scanner.nextInt();
        System.out.println("Introduce el segundo (0-59):");
        int segundo = scanner.nextInt();
        reloj.establecerHora(hora, minuto,segundo);
        reloj.mostrarHora();
        do{
            System.out.println("\nElija la opción: ");
            System.out.println("1)Mostrar hora...");
            System.out.println("2)Avanzar un segundo...");
            System.out.println("3)Salir...");
            eleccion=scanner.nextInt();
            if(eleccion==1){
                reloj.mostrarHora();
            }
            if(eleccion==2){
                reloj.avanzarSegundo();
            }
        }while(eleccion!=3);








    }
}
