package Ejercicio3;

import Ejercicio3.Class.Alimenticios;
import Ejercicio3.Class.Electronicos;
import Ejercicio3.Class.Ropa;

import java.util.Scanner;

public class SwitchProductos {
Scanner scanner=new Scanner(System.in);
    Alimenticios alimenticios = new Alimenticios();

    Electronicos electronicos=new Electronicos();

    Ropa ropa=new Ropa();

    public void SwitchAlimentos(){
        int opcion;
        do{
            System.out.println("Elija una opcion: ");
            System.out.println("1)Subir un alimento al stock.");
            System.out.println("2)Mostrar detalles de alimentos.");
            System.out.println("3)Ver alimentos proximos a vencer.");
            System.out.println("4)Salir...");
            System.out.println("Opcion: ");
            opcion= scanner.nextInt();
            switch (opcion){
                case 1:alimenticios.subirProductos();
                    break;
                case 2:alimenticios.mostrarDetalles();
                break;
                case 3:alimenticios.proximoVencer();
                case 4:
                    System.out.println("Saliendo del area Alimentos...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while (opcion!=4);
    }

    public void SwitchElectronicos(){
        int opcion;
        do{
            System.out.println("Elija una opcion: ");
            System.out.println("1)Subir un objeto electronico al stock.");
            System.out.println("2)Mostrar detalles del electronico.");
            System.out.println("3)Salir...");
            System.out.println("Opcion: ");
            opcion= scanner.nextInt();
            switch (opcion){
                case 1:electronicos.subirProductos();
                    break;
                case 2:electronicos.mostrarDetalles();
                    break;
                case 3:
                    System.out.println("Saliendo del area Alimentos...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while (opcion!=3);
    }

    public void SwitchRopa() {
        int opcion;
        do{
            System.out.println("Elija una opcion: ");
            System.out.println("1)Subir una prenda al stock.");
            System.out.println("2)Mostrar detalles del stock de prendas.");
            System.out.println("3)Salir...");
            System.out.println("Opcion: ");
            opcion= scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:ropa.subirProductos();
                    break;
                case 2:ropa.mostrarDetalles();
                    break;
                case 3:
                    System.out.println("Saliendo del area Alimentos...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while (opcion!=3);
    }
    }
