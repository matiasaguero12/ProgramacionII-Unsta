package Ejercicio4;

import java.util.Scanner;

public class MesdelAño {
    public static void main(String[] args) {

        System.out.println("Ingrese la fecha...");
        System.out.println("Día: ");
        Scanner scanner=new Scanner(System.in);
        int dia=scanner.nextInt();
        System.out.println("Mes: ");
        int mes=scanner.nextInt();
        System.out.println("Año: ");
        int año=scanner.nextInt();
        if(año<0 || año>2025){
            System.out.println("Escriba un año válido");
            return;
        }
        if(mes>0 && mes<=3){
            System.out.println("La fecha corresponde al primer trimestre del año...");

        }
        else if(mes>3 && mes<=6){
            System.out.println("La fecha corresponde al segundo trimestre del año...");
        }
        else if(mes>6 && mes<=9){
            System.out.println("La fecha corresponde al tercer trimestre del año...");
        }
        else if (mes>9 && mes<=12){
            System.out.println("La fecha corresponde al tercer trimestre del año");

        }
        else if(mes>12){
            System.out.println("El año solo tiene 12 meses...");
            
        }
}
}