package Ejercicio3;

import Ejercicio3.AbstractClass.Producto;
import Ejercicio3.Class.Alimenticios;
import Ejercicio3.Class.Electronicos;
import Ejercicio3.Class.Ropa;

import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        SwitchProductos switchProductos=new SwitchProductos();
        int opcion;
        do{
            System.out.println("Elija una opcion...");
            System.out.println("1)Alimentos.");
            System.out.println("2)Artefactos electronicos.");
            System.out.println("3)Ropa.");
            System.out.println("4)Salir...");
            System.out.println("Opcion: ");
            opcion= scanner.nextInt();
            switch(opcion){
                case 1:switchProductos.SwitchAlimentos();
                break;
                case 2:switchProductos.SwitchElectronicos();
                break;
                case 3:switchProductos.SwitchRopa();
                break;
                case 4:
                    System.out.println("Saliendo...");
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while(opcion!=4);


    }
}