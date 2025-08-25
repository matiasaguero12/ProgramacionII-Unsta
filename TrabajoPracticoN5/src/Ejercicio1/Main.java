package Ejercicio1;

import Ejercicio1.ElectronicDeviceClass.Television;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Television tv=new Television(false,null); //empieza sin valores

        int opcion;

        do{
            System.out.println("1)Prender dispositivo.");
            System.out.println("2)Apagar dispositivo");
            System.out.println("3)Obtener estado del dispositivo");
            System.out.println("4)Obtener historial");

            System.out.println("Elija una opcion: ");
            opcion=scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println(tv.Lit());
                    break;

                case 2:
                    System.out.println(tv.Off());
                    break;

                case 3:
                    System.out.println(tv.State());
                    break;

                case 4:
                    tv.History().
                            forEach(television -> {
                                String estado=television.Estado ? "Encendido" : "Apagado";
                                System.out.println("Estado: "+estado+" ,Fecha y Hora: "+television.Horario);
                            });
                    break;

                case 5:
                    System.out.println("Saliendo...");

                default:
                    System.out.println("Opcion incorrecta");
            }


        }while(opcion!=5);





    }
}