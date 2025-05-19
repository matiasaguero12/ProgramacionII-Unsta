package Ejercicio2;

public class ProductoComparable implements Comparable<ProductoComparable>{

    private String nombre;
    private int stock;
    private double precio;

    public ProductoComparable(String nombre, int stock, double precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    //@Override
    //public int compareTo(ProductoComparable otro) {

      //  return Double.compare(otro.precio, this.precio);
    //}

    @Override
    public String toString() {
        return nombre + " " + stock + " "+precio;
    }

    @Override
    public int compareTo(ProductoComparable otro) {

        return this.nombre.compareToIgnoreCase(otro.nombre);
    }



}
