package Ejercicio1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Array array1=new Array(10);

       for(int i=0;i<10;i++){
           array1.ingresarDatos(i,i);
       }

       array1.mostrarDatos();

       //array1.calcularSuma();

       //array1.encontrarValores();

       array1.invertirOrden();




    }
}