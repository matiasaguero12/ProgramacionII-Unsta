package TrabajoPracticoN2.Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear libros
        Libreria libro1 = new Libreria("La odisea de Mateo el perro", "El gordo Santiago", 1234, "Disponible");
        Libreria libro2 = new Libreria("El orígen de Cuestion de Peso", "Mateo Emmanuel", 14456, "No disponible");

        System.out.println("Bienvenido a la Librería El Gordo Santiago...");


        int opcion;
        do {
            System.out.println("\nLibros disponibles:");
            System.out.println("1) La odisea de Mateo el perro");
            System.out.println("2) El orígen de Cuestion de Peso");
            System.out.println("3) Salir");
            System.out.print("Por favor, elija una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    libro1.menu();
                    break;
                case 2:
                    libro2.menu();
                    break;
                case 3:
                    System.out.println("Saliendo de la librería. ¡Gracias por su visita!");
                    break;
                default:
                    System.out.println("Número inválido. Intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}