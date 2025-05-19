package TrabajoPracticoN2.Ejercicio5;

import java.util.Scanner;

public class Empleados {
    private static int contadorEmpleados = 0;
    private static int siguienteLegajo = 1;

    private int Legajo;
    private double Salario;
    private String Nombre;

    public Empleados(String Nombre,double Salario){
        this.Nombre=Nombre;
        this.Salario=Salario;
        this.Legajo=siguienteLegajo++;
        contadorEmpleados++;

    }

    public double getSalario() {
        return Salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getLegajo() {
        return Legajo;
    }

    public int getContadorEmpleados() {
        return contadorEmpleados;
    }

    public void mostrarEmpleados(String getNombre, double getSalario, int getLegajo){
        System.out.println("Nombre : "+getNombre+"\nLegajo: "+getLegajo+"\nSalario: "+getSalario);
    }


    public void aumentarEmpleado() {
        Scanner scanner = new Scanner(System.in);
        double aumento;
        String motivo;
        int opcion;

        do {
            System.out.println("¿Quiere aumentar por porcentaje o aumento fijo?");
            System.out.println("1) Porcentaje");
            System.out.println("2) Aumento fijo");
            System.out.println("3) Salir");
            System.out.println("Le recuerdo que debe registrar el motivo del aumento...");
            System.out.println("Opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Indique el porcentaje que quiera aumentar: %");
                    double porcentaje = scanner.nextDouble();
                    scanner.nextLine();
                    aumento = this.Salario * (porcentaje / 100);
                    this.Salario += aumento;
                    System.out.print("Indique el motivo del aumento al empleado " + this.Nombre + " por favor: ");
                    motivo = scanner.nextLine();
                    System.out.println("\nAumento realizado con éxito!!");
                    break;

                case 2:
                    System.out.print("Indique el monto fijo que quiera aumentar: $");
                    aumento = scanner.nextDouble();
                    scanner.nextLine();
                    this.Salario += aumento;
                    System.out.print("Indique el motivo del aumento al empleado " + this.Nombre + " por favor: ");
                    motivo = scanner.nextLine();
                    System.out.println("\nAumento realizado con éxito!!");
                    break;

                case 3:
                    System.out.println("Saliendo del menú de aumentos.");
                    break;

                default:
                    System.out.println("Escriba un número correcto");
            }
        } while (opcion != 3);
    }

    public static void contarEmpleados() {
        System.out.println("Cantidad de empleados actualmente: " + contadorEmpleados);
    }



}
