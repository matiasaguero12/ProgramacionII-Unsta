package TrabajoPracticoN2.Ejercicio1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora=new Calculadora();

         Scanner scanner= new Scanner(System.in);
        System.out.println("Valor de a: ");
         int a=scanner.nextInt();
        System.out.println("Valor de b: ");
        int b=scanner.nextInt();

        double resultadoSuma=calculadora.Sumar(a,b);
        System.out.println("El resultado de la suma es: "+resultadoSuma);

        double resultadoResta=calculadora.Restar(a,b);
        System.out.println("El resultado de la resta es :"+resultadoResta);
        double resultadoMultiplicar=calculadora.Multiplicar(a,b);
        System.out.println("El resultado de la multiplicacion es :"+resultadoMultiplicar);
        double resultadoDividir=calculadora.Dividir(a,b);
        System.out.println("El resultado de la division es :"+resultadoDividir);
        }



    }





