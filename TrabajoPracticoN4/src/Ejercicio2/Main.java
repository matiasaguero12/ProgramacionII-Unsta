package Ejercicio2;


import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {

      OrdenamientoDeArreglos array1=new OrdenamientoDeArreglos(5);
      OrdenamientoDeArreglos array2=new OrdenamientoDeArreglos(100);
      OrdenamientoDeArreglos array3=new OrdenamientoDeArreglos(1000);
      OrdenamientoDeArreglos array4=new OrdenamientoDeArreglos(10000);



      //array1.Rellenar();
      //array1.Bubblesort();
      //array1.mostrar();
      //array1.sort();

        //array2.rellenar100();
        //array2.Bubblesort();
        //array2.sort();
        //array2.mostrar();



        //array2.rellenar1000();
        //array2.Bubblesort();
        //array2.sort();
        //array2.mostrar();



        //array3.rellenar10000();
        //array3.Bubblesort();
        //array3.sort();
        //array3.mostrar();

       /*ProductoComparable[] listaProductos={
           new ProductoComparable("Notebook",10,100.99),
            new ProductoComparable("Mesa",12,51.88),
            new ProductoComparable("Mochila",4,12.99),
        };*/

        /*Arrays.sort(listaProductos);
        for(ProductoComparable a : listaProductos){
            System.out.println(a);

        }*/

        ProductoComparator[] listaProductos={
                new ProductoComparator("Notebook",10,100.99),
                new ProductoComparator("Mesa",12,51.88),
                new ProductoComparator("Mochila",4,12.99),
        };

       Arrays.sort(listaProductos,new ProductoComparator.ComparatorporNombre());
        System.out.println("Ordenado por nombre: ");
        System.out.println();
       for(ProductoComparator a: listaProductos){
           System.out.println(a);
       }

        Arrays.sort(listaProductos,Comparator.comparingDouble(ProductoComparator::getPrecio));//paso el nombre de la lista, comparator, el modo comparing, el array y obtener con el get el precio
        System.out.println();
        System.out.println("Ordenado por precio: ");
        System.out.println();
        for(ProductoComparator a : listaProductos){
            System.out.println(a);
        }

        Arrays.sort(listaProductos,Comparator.comparingDouble(ProductoComparator::getStock));
        System.out.println();
        System.out.println("Ordenado por stock: ");
        for(ProductoComparator a : listaProductos){
            System.out.println(a);
        }




    }
}
