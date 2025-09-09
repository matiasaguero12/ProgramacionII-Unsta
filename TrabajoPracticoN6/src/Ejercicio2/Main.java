package Ejercicio2;

import java.util.InputMismatchException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Estudiante estudiante=new Estudiante();

        try{
            estudiante.validarCalificacion("Matias",11);
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }



    }
}