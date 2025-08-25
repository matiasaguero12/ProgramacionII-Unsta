package Ejercicio3.Class;

import Ejercicio3.AbstractClass.Producto;
import Ejercicio3.Interfaces.AlimenticiosInterface;

import java.time.LocalDate;

import java.util.*;

public class Alimenticios extends Producto implements AlimenticiosInterface {
    Scanner scanner=new Scanner(System.in);
    private LocalDate fechaVto;

    public Alimenticios(String nombre, double precio, LocalDate fechaVto) {
        super(nombre, precio);
        this.fechaVto = fechaVto;
    }

    public Alimenticios() {
        super("", 0);                // nombre vacío, precio 0
        this.fechaVto = LocalDate.now();  // fecha actual
    }


    @Override
    public double calcularPrecio() {
        System.out.println("Para calcular el precio del alimento, se le sumara " +
                "el precio de compra sumado al IVA con 3%");
        double iva=0.03;
        System.out.println("Precio de compra del producto: ");
        double precioCompra=scanner.nextDouble();
        double precioVenta=(iva+1)*precioCompra;

        return precioVenta;
    }

    @Override
    public void mostrarDetalles() {
        for (Producto p : detalles) {
            Alimenticios a = (Alimenticios) p;
            System.out.println(a.Nombre + " - $" + a.Precio + " - Vto: " + a.fechaVto);
        }

    }

    @Override
    public Producto subirProductos() {
        System.out.println("Para subir un producto, rellene los siguientes datos: ");
        System.out.println("Nombre: ");
        String nombre=scanner.nextLine();

        double precio=calcularPrecio();
        scanner.nextLine();
        int random= (int) (Math.random()*4);

        LocalDate ahora=LocalDate.now();
        LocalDate fechaVto=ahora.plusMonths(random);

        Alimenticios nuevoAlimento=new Alimenticios(nombre,precio,fechaVto);
        detalles.add(nuevoAlimento);
        System.out.println("Alimento:"+nombre+" añadido a la lista...");
        return nuevoAlimento;
    }


    @Override
    public void proximoVencer() {
        LocalDate hoy=LocalDate.now();
        detalles.stream()
                .map(p -> (Alimenticios) p)
                .filter(a -> a.fechaVto.isBefore(LocalDate.now().plusMonths(1))) // vence en menos de 1 mes
                .forEach(a -> System.out.println(a.Nombre + " vence pronto: " + a.fechaVto));

    }
}
