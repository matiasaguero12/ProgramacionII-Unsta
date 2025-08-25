package Ejercicio3.Class;

import Ejercicio3.AbstractClass.Producto;

import java.time.LocalDate;
import java.util.Scanner;

public class Electronicos extends Producto {
Scanner scanner=new Scanner(System.in);

    private int garantia;

    public Electronicos(String nombre, double precio, int garantia) {
        super(nombre, precio);
        this.garantia = garantia;
    }

    public Electronicos(){
        super(null,0);

    }

    @Override
    public double calcularPrecio() {
        System.out.println("Para calcular el precio del electronico, se le sumara " +
                "el precio de compra sumado al IVA del 21%");
        double iva=0.21;
        System.out.println("Precio de compra del producto: ");
        double precioCompra=scanner.nextDouble();
        double precioVenta=(iva+1)*precioCompra;

        return precioVenta;
    }

    @Override
    public void mostrarDetalles() {
        for (Producto p : detalles) {
            Electronicos a = (Electronicos) p;
            System.out.println(a.Nombre + " - $" + a.Precio + " - Garantia: " + a.garantia+" meses");
        }
    }

    @Override
    public Producto subirProductos() {
        System.out.println("Para subir un producto, rellene los siguientes datos: ");
        System.out.println("Nombre: ");
        String nombre=scanner.nextLine();

        double precio=calcularPrecio();
        scanner.nextLine();
       this.garantia= (int) (Math.random()*10);

        Electronicos electronicos=new Electronicos(nombre,precio,garantia);
        detalles.add(electronicos);
        System.out.println();
        return electronicos;
    }
}
