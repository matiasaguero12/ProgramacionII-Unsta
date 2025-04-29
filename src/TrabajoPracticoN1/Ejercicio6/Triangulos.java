package Ejercicio6;

import java.util.Scanner;




public class Triangulos {

    static int equilatero=0;
    static int isosceles=0;
    static int escaleno=0;
    static int i;

    static void clasificacion(int lado1,int lado2, int lado3){

        if(lado1<=0 || lado2<=0 || lado3<=0){
            System.out.println("Ingrese valores correctos mayor a cero...");
            i--;
        }
        else if(lado1==lado2 && lado2==lado3){
            System.out.println("Es un triangulo equilatero");
            equilatero++;
        }
        else if(lado1!=lado2 && lado2!=lado3){
            System.out.println("Es un triangulo escaleno");
            escaleno++;
        }
        else{
            System.out.println("Es un triangulo isosceles");
            isosceles++;
        }


    }

    public static void main(String[] args) {
        System.out.println("Escriba la cantidad de triangulos: ");
        Scanner scanner= new Scanner(System.in);
        int numTriangulos=scanner.nextInt();
        for(int i=1; i<=numTriangulos;i++){

            System.out.println("Lado 1: ");
            int a=scanner.nextInt();

            System.out.println("Lado 2: ");
            int b=scanner.nextInt();

            System.out.println("Lado 3: ");
            int c=scanner.nextInt();

            clasificacion(a,b,c);


        }
        System.out.println("Cantidad de triángulos\nEscalenos: "+escaleno);
        System.out.println("Isosceles: "+isosceles);
        System.out.println("Equilateros: "+equilatero);

        if(isosceles==escaleno && escaleno==equilatero){
            System.out.println("Hay misma cantidad de triangulos");
        }
        else if(isosceles<escaleno && isosceles<equilatero){
            System.out.println("\nEl tipo de triangulo que posee menor cantidad es el isosceles... ");
        }
        else if(equilatero<escaleno && equilatero<isosceles){
            System.out.println("\nEl tipo de triangulo que posee menor cantidad es el equilatero... ");
        }
        else if (escaleno<isosceles && escaleno<equilatero){
            System.out.println("\nEl tipo de triangulo que posee menor cantidad es el escaleno... ");
        }

    }


}
