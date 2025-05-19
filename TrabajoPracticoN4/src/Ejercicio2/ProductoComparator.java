package Ejercicio2;

import java.util.Comparator;

public class ProductoComparator {

    private String nombre;
    private int stock;
    private double precio;

    public ProductoComparator(String nombre, int stock, double precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public static class ComparatorporNombre implements Comparator<ProductoComparator>{
        @Override
        public int compare(ProductoComparator p1, ProductoComparator p2) {
            return p1.getNombre().compareTo(p2.getNombre());



        }
    }






    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", stock=" + stock +
                ", precio=" + precio;
    }
}

