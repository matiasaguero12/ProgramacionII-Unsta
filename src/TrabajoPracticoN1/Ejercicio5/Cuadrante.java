package Ejercicio5;

import java.util.Scanner;

public class Cuadrante {
    public static void main(String[] args) {
        System.out.println("Ingrese las coordenadas x e y del plano para ver en que cuadrante se encuentran dichas coordenadas...");
        System.out.println("X: ");
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();

        System.out.println("Y: ");
        int y=scanner.nextInt();

        if(x==0 || y==0){
            System.out.println("Los valores tienen que ser distinto de 0");
            return;
        }
        else if(x>0 && y>0){
            System.out.println("Las coordenadas se encuentran en el primer cuadrante");
        }
        else if(x<0 && y>0){
            System.out.println("Las coordenadas se encuentran en el segundo cuadrante");
        }
        else if(x<0 && y<0){
            System.out.println("Las coordenadas se encuentran en el tercer cuadrante");
        }
        else {
            System.out.println("Las coordenadas se encuentran en el cuarto cuadrante");
        }




}
}