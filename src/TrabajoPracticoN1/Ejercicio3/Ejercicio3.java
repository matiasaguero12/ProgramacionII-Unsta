package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        System.out.println("Ingrese el númmero para saber si tiene uno o dos dígitos: ");
        Scanner scanner=new Scanner(System.in);
        int digito =scanner.nextInt();
        if (digito>0 && digito<10){
            System.out.println("El número tiene 1 dígito...");
        }
        else if(digito<0 || digito>=100){
            System.out.println("Ingrese un valor válido");
        }
        else{
            System.out.println("El numero tiene 2 digitos...");
        }






    }
}
