package Ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class CadenasComparable implements Comparable<CadenasComparable> {

    private String contenido;


    public CadenasComparable(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public int compareTo(CadenasComparable o) {
        return this.contenido.compareToIgnoreCase(o.contenido);
    }

    @Override
    public String toString() {
        return "Contenido: " + contenido;
    }

    public static void pedirCadenas(int n,CadenasComparable[] cadena) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la cadena #" + (i + 1) + ": ");
            String texto = sc.nextLine();
            cadena[i] = new CadenasComparable(texto);
        }

        Arrays.sort(cadena);

        System.out.println("\nCadenas ordenadas alfabéticamente:");
        for (CadenasComparable a : cadena) {
            System.out.println(a);
        }


    }

    public static void subcadena(int n,CadenasComparable[] cadena){
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba la subcadena que quiere ver si la contiene: ");
        String subcadena=sc.nextLine();
        boolean encontrado=false;
        for(int i=0;i<n;i++){
            if(cadena[i].getContenido().toLowerCase().contains(subcadena.toLowerCase())){
                System.out.println("Subcadena encontrada en el objeto: "+cadena[i].getContenido());
                encontrado=true;

            }
        }
        if(!encontrado){
            System.out.println("Subcadena no encontrada");
        }


    }

    public static void binarySearch(CadenasComparable[] cadena){
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba la subcadena que quiera buscar usando BinarySearch: ");
        String subcadena=sc.nextLine();

        Arrays.sort(cadena);

        CadenasComparable Subcadena=new CadenasComparable(subcadena);

        int posicion=Arrays.binarySearch(cadena,Subcadena);
        if(posicion>=0){
            System.out.println("Subcadena "+subcadena+" encontrada en "+posicion+" del array");
        }else{
            System.out.println("Subcadena "+subcadena+" no encontrada en el array");
        }



    }

}
