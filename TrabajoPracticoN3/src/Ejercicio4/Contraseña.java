package Ejercicio4;
import java.util.Random;

import java.util.Arrays;
import java.util.Scanner;

public class Contraseña {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String Contrasena;
        String[] Numeros={"1","2","3","4","5","6","7","8","9"};
        String[] Caracteres={"!","@","#","$","%","^","&","*"};
        String Nombre;

        //System.out.println("Ingrese la contraseña a verificar: ");
        //Contrasena=scanner.nextLine();
        //verificarCantidad(Contrasena);
        //verificarNumeros(Contrasena,Numeros);
        //verificarCaracteres(Contrasena,Caracteres);

        System.out.println("Para generar una contraseña aleatoria, usaremos su nombre y contraseña anterior");
        System.out.println("Nombre: ");
        Nombre=scanner.nextLine();

        System.out.println("Ingrese la contraseña a verificar: ");
        Contrasena=scanner.nextLine();
        generarContraseña(Contrasena,Nombre);






    }

    public static void verificarCantidad(String Contrasena){

        if(Contrasena.length()>8){
            System.out.println("La contraseña posee mas de 8 caracteres, por ende se verifica");

        }else if(Contrasena.length()==0){
            System.out.println("Contraseña vacía");
        }else{
            System.out.println("Contraseña inválida");
        }

    }

    public static void verificarNumeros(String Contrasena,String[] Numeros){

        for (String numero : Numeros) {

            if (Contrasena.contains(numero)) {
                System.out.println("La contraseña si posee datos numéricos");
                return;


       }else{
                System.out.println("La contraseña no posee datos numéricos");
                return;
            }

    }

}

public static void verificarCaracteres(String Contrasena,String[] Caracteres){

        for(String caracter : Caracteres){

            if(Contrasena.contains(caracter)){
                System.out.println("Hay caracteres especiales en la contraseña");
                return;

                }else{
                System.out.println("No hay caracteres especiales");
                return;
            }

        }
        }

    public static void generarContraseña(String contrasena, String nombre) {
        Scanner scanner = new Scanner(System.in);
        int longitud = 8; // Puedes definir el largo de la nueva contraseña

        StringBuilder nuevaContraseña = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            if (Math.random() < 0.5 && nombre.length() > 0) {
                // Tomar letra aleatoria del nombre
                char letra = nombre.charAt((int)(Math.random() * nombre.length()));
                nuevaContraseña.append(letra);
            } else if (contrasena.length() > 0) {
                // Tomar letra aleatoria de la contraseña original
                char letra = contrasena.charAt((int)(Math.random() * contrasena.length()));
                nuevaContraseña.append(letra);
            }
        }

        System.out.println("Nueva contraseña generada: " + nuevaContraseña.toString());
    }





    }


















