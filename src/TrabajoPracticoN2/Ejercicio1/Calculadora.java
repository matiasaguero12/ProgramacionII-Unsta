package Ejercicio1;



public class Calculadora {






    public double Sumar(double a, double b){
        return a+b;

}
    public double Restar(double a, double b){
       return a-b;
}
    public double Multiplicar(double a, double b){

        return a*b;
    }
    public double Dividir(double a, double b){
        if(b==0){
            System.out.println("No se puede dividir en cero...");
            return 0;
        }else{

            return a/b;
        }
    }


}