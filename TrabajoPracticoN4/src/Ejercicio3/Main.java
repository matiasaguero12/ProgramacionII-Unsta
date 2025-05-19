package Ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántas cadenas desea que tenga el array?: ");
        int n = sc.nextInt();
        sc.nextLine();
        CadenasComparable[] cadena = new CadenasComparable[n];

        CadenasComparable.pedirCadenas(n,cadena);
        //CadenasComparable.subcadena(n,cadena);
        CadenasComparable.binarySearch(cadena);





    }
}
