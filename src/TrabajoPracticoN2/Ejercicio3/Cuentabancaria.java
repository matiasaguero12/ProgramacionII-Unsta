package TrabajoPracticoN2.Ejercicio3;

import java.util.Scanner;

public class Cuentabancaria {

    private int numCuenta;
    private String nombre;
    private double saldo;

    public Cuentabancaria(int numCuenta, String nombre, double saldo) {
        this.numCuenta = numCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar() {
        System.out.println("¿Cuánto desea depositar?");
        Scanner scanner = new Scanner(System.in);
        double deposito = scanner.nextDouble();
        if (deposito < 0) {
            System.out.println("Ingrese un número válido...");
        } else {
            saldo += deposito;
            System.out.printf("Se han depositado %.2f, su nuevo saldo es %.2f%n", deposito, saldo);
        }
    }

    public void retirar() {
        System.out.println("¿Cuánto desea retirar?");
        Scanner scanner = new Scanner(System.in);
        double retirar = scanner.nextDouble();
        if (retirar > saldo) {
            System.out.println("No puede retirar más dinero del que posee...");
        } else {
            saldo -= retirar;
            System.out.printf("Acción realizada, retiró %.2f, ahora posee %.2f en su cuenta bancaria.%n", retirar, saldo);
        }
    }

    public void consultarSaldo() {
        System.out.printf("Tu saldo es: %.2f%n", saldo);
    }

    public static void cuenta(Cuentabancaria cuenta) {
        Scanner si = new Scanner(System.in);
        boolean acceso;
        do {
            acceso = false;
            System.out.println("Ingrese el nombre de usuario: ");
            String confirmarNombre = si.nextLine();
            System.out.println("Ingrese su número de cuenta: ");
            int confirmarNumCuenta = si.nextInt();
            if (cuenta.getNombre().equalsIgnoreCase(confirmarNombre) && cuenta.getNumCuenta() == confirmarNumCuenta) {
                System.out.println("Bienvenido a su cuenta: " + cuenta.getNombre());
                acceso = true;
            } else {
                System.out.println("Ingreso una cuenta inexistente.");
            }
        } while (!acceso);
    }
}





