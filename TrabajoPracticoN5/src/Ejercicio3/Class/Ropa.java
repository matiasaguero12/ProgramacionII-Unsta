package Ejercicio3.Class;

import Ejercicio3.AbstractClass.Producto;

import java.util.List;
import java.util.Scanner;

public class Ropa extends Producto {

    private String talle;
    Scanner scanner=new Scanner(System.in);
    public Ropa(String nombre, double precio, String talle) {
        super(nombre, precio);
        this.talle = talle;
    }

    public Ropa(){
        super(null,0);

    }








    @Override
    public double calcularPrecio() {
        System.out.println("Para calcular el precio de la prenda, se le sumara " +
                "el precio de compra sumado al IVA con 18%");
        double iva=0.18;
        System.out.println("Precio de compra del producto: ");
        double precioCompra=scanner.nextDouble();
        double precioVenta=(iva+1)*precioCompra;

        return precioVenta;
    }

    @Override
    public void mostrarDetalles() {
        for (Producto p : detalles) {
            Ropa a = (Ropa) p;
            System.out.println(a.Nombre + " - $" + a.Precio + " - Talle: " + a.talle);
        }
    }

    @Override
    public Producto subirProductos() {
        System.out.println("Para subir un producto, rellene los siguientes datos: ");
        System.out.println("Nombre: ");
        String nombre=scanner.nextLine();

        double precio=calcularPrecio();
        scanner.nextLine();
        System.out.println("Talle: ");
        talle=scanner.nextLine();

       Ropa ropa=new Ropa(nombre,precio,talle);
        detalles.add(ropa);
        System.out.println();
        return ropa;
    }
}
