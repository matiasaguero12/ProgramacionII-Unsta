package TrabajoPracticoN3.Ejercicio1;

import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double consumoInicial;
        double consumoActual;

        System.out.println("Consumo inicial: ");
        consumoInicial=scanner.nextDouble();

        System.out.println("Consumo actual: ");
        consumoActual=scanner.nextDouble();


        double reduccion=consumoInicial-consumoActual;

        if(reduccion<=0){
            System.out.println("No posee consumo");


        }else{
            double ahorroEstimado=Math.sqrt(reduccion)*10;

            System.out.printf("Ahorro energético estimado: %.2f kWh%n", ahorroEstimado);



            String[] Electrodomesticos=new String[100];
            double[] ConsumoElectrodomesticos=new double[100];


            int cantidad = pedirDatosElect(Electrodomesticos, ConsumoElectrodomesticos);
            maximosYminimos(Electrodomesticos, ConsumoElectrodomesticos, cantidad);
        }


    }

    public static int pedirDatosElect(String[] Electrodomesticos, double[] ConsumoElectrodomesticos) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos electrodomésticos tiene?");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // limpiar el salto de línea

        System.out.println("A continuación, ingrese el nombre y el consumo de cada electrodoméstico:");

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nombre del electrodoméstico #" + (i + 1) + ":");
            String nombre = scanner.nextLine(); // ahora sí funcionará bien
            Electrodomesticos[i] = nombre;

            System.out.println("Consumo en kWh:");
            double consumo = scanner.nextDouble();
            ConsumoElectrodomesticos[i] = consumo;
            scanner.nextLine(); // limpiar el salto de línea para la siguiente iteración
        }

        System.out.println("\nResumen de electrodomésticos registrados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.printf("Electrodoméstico %d: %s, Consumo: %.2f kWh%n",
                    i + 1, Electrodomesticos[i], ConsumoElectrodomesticos[i]);
        }
        return cantidad;
    }


    public static void maximosYminimos(String[] Electrodomesticos, double[] ConsumoElectrodomesticos, int cantidad) {
        double max = ConsumoElectrodomesticos[0];
        double min = ConsumoElectrodomesticos[0];
        int idMax = 0;
        int idMin = 0;

        for (int i = 1; i < cantidad; i++) { // comenzamos desde 1 porque 0 ya está asumido
            if (ConsumoElectrodomesticos[i] > max) {
                max = ConsumoElectrodomesticos[i];
                idMax = i;
            }
            if (ConsumoElectrodomesticos[i] < min) {
                min = ConsumoElectrodomesticos[i];
                idMin = i;
            }
        }

        System.out.println("⚡ El electrodoméstico que más consume energía es: " +
                Electrodomesticos[idMax] + " con " + max + " kWh");

        System.out.println(" El que menos consume es: " +
                Electrodomesticos[idMin] + " con " + min + " kWh");
    }
}

