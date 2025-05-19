package Ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OrdenamientoDeArreglos {
    public ArrayList<Object> ListaObjetos;
    Scanner sc=new Scanner(System.in);

    private int[] datos;

    public OrdenamientoDeArreglos(int tamaño){
        datos=new int[tamaño];

    }


    public void Bubblesort(){
        int n = datos.length;
        boolean swapped;


        for (int i = 0; i < n - 1; i++) {
            swapped = false;


            for (int j = 0; j < n - i - 1; j++) {
                if (datos[j] > datos[j + 1]) {

                    int temp = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = temp;
                    swapped = true;
                }
            }


            if (!swapped) break;
        }



    }

    public void mostrar(){
        for(int n:datos){
            System.out.println(n + " ");
        }

    }

    public void Rellenar(){
        int numero;
        for(int i=0;i<datos.length;i++){
            System.out.println("Ingrese el valor para la posicion "+i+": ");
            numero=sc.nextInt();
            datos[i]=numero;
        }
    }

    public void sort(){
        Arrays.sort(datos);
    }

    public void rellenar100(){
        for(int i=0;i<datos.length;i++){
            datos[i]=(int)(Math.random()*100);
        }
        System.out.println("El arreglo fue rellenado con 100 valores");

    }

    public void rellenar1000(){
        for(int i=0;i<datos.length;i++){
            datos[i]=(int)(Math.random()*1000);
        }
        System.out.println("El arreglo fue rellenado con 1000 valores");

    }

    public void rellenar10000(){
        for(int i=0;i<datos.length;i++){
            datos[i]=(int)(Math.random()*10000);
        }
        System.out.println("El arreglo fue rellenado con 10000 valores");

    }


}
