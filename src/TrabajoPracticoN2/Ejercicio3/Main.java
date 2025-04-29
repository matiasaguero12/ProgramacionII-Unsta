package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Cuentabancaria cuenta = new Cuentabancaria(12345, "Elgordo", 1000);
        Cuentabancaria.cuenta(cuenta);
        System.out.println("\nBienvenido al menú, elija las opciones que se mencionan a continuación...\n");

        Scanner eleccion = new Scanner(System.in);
        int decision;

        do {
            System.out.println("\nElija la opción: \n");
            System.out.println("2) Retirar saldo.");
            System.out.println("3) Consultar saldo.");
            System.out.println("4) Salir.");
            decision = eleccion.nextInt();

            switch (decision) {
                case 2:
                    System.out.println("Retirar saldo seleccionado.");
                    cuenta.retirar();
                    break;
                case 3:
                    System.out.println("Consultar saldo seleccionado.");
                    // Logic for checking balance (implement as needed)
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (decision != 4);

        eleccion.close();
    }
}
