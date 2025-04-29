package Ejercicio1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Notas {
    public static void main(String[] args) {

        System.out.println("Ingresar la nota del examen: ");
        Scanner scanner= new Scanner(System.in);
        int nota=scanner.nextInt();
        if(nota>=4 && nota<=10){
            System.out.println("El alumno aprobó la materia");
        }
        else if(nota<0 || nota>10 ){
            System.out.println("Ingrese un valor válido porfavor. El rango es del 1-10");
        }
        else{
            System.out.println("El alumno no aprobó la materia...");
        }


    }
}
