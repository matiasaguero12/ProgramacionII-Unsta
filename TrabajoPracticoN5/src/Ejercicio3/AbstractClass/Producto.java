package Ejercicio3.AbstractClass;

import Ejercicio3.Class.Alimenticios;

import java.util.ArrayList;
import java.util.List;

public abstract class Producto {

    protected String Nombre;
    protected double Precio;
    protected List<Producto> detalles;

    public abstract double calcularPrecio();
    public abstract void mostrarDetalles();
    public abstract Producto subirProductos();


    public Producto(String nombre, double precio) {
        Nombre = nombre;
        Precio = precio;
        this.detalles=new ArrayList<>();
    }

    List<Producto> getDetalle(){
        return detalles;
    }


}
