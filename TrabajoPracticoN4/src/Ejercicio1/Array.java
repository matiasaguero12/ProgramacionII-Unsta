package Ejercicio1;

import java.util.Arrays;
import java.util.Scanner;


public class Array {
    Scanner sc=new Scanner(System.in);
    private int[] datos;

    public Array(int tamaño){
        datos=new int[tamaño];
    }

    public void ingresarDatos(int posicion,int numero){
        if(posicion>=0 && posicion< datos.length){
            System.out.println("Ingrese el valor en la posicion "+posicion+": ");

            numero=sc.nextInt();
            datos[posicion]=numero;
        }

    }

    @Override
    public String toString(){
        return Arrays.toString(datos);
    }

    public void mostrarDatos(){
        System.out.println("Contenido del array: ");
        for(int n :datos){
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public void calcularSuma(){
        int suma=0;
       for(int i=0;i< datos.length;i++){
           suma=suma+datos[i];

       }
        System.out.println("La suma de los elementos del Array es: "+suma+"");
    }

    public void encontrarValores(){

        int numMaximo=datos[0];
        int numMinimo=datos[0];

        for(int i=0;i<datos.length;i++){

            numMaximo=Math.max(numMaximo,datos[i]);

            numMinimo=Math.min(numMinimo,datos[i]);

        }
        System.out.println("El número mayor del arreglo es: "+numMaximo);
        System.out.println("El número menor del arreglo es: "+numMinimo);



    }

    public void invertirOrden(){

        for(int i=datos.length-1;i>=0;i--){

            System.out.print(datos[i] + " ");

        }
        System.out.println();


    }





}
