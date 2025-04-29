package Ejercicio2;

import java.util.Scanner;

public class PromocionAlumno {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int suma=0;
        System.out.println("Ingrese el valor de sus notas...");

        for(int i=1;i<4;i++){
            System.out.println("Nota "+i+": ");
            int nota=scanner.nextInt();
            if(nota<0 || nota>10){
                System.out.println("Ingrese un valor correcto(1-10). Inténtelo nuevamente");
                i--;
            }
            else{
            suma=suma+nota;
            }

        }
        System.out.println("La suma de sus notas es de: "+suma);
        int promedio=suma/3;
        System.out.println("Su promedio es: "+promedio);
        if(promedio>8 && promedio<=10){
            System.out.println("Por lo tanto, el alumno está promocionado de la materia");
        }
        else{
            System.out.println("El alumno no promocionó");
        }

}
}