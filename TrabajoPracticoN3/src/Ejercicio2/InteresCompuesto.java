package Ejercicio2;

import java.util.Scanner;

public class InteresCompuesto {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double Capital;
        double tasadeInteres=0.06;
        int Tiempo;

        System.out.println("Ingrese su capital: ");
        Capital=scanner.nextDouble();

        System.out.println("Ingrese el tiempo de su inversión: ");
        Tiempo=scanner.nextInt();

        double formula= Math.pow(1+tasadeInteres,Tiempo)*Capital;

        Redondeo(formula);

    }

    public static void Redondeo(double formula){

        System.out.println("El interes compuesto sin redondear: "+formula);

        formula=Math.round(formula);
        System.out.println("El interes compuesto despues de redondear: "+formula);

    }

}
