package Ejercicio3;

import Ejercicio1.NumberException;

import java.util.ArrayList;
import java.util.List;

public class SaladeCine {

    private int Capacidad;
    private List<Asiento> asientos;

    public SaladeCine(int capacidad) {
        Capacidad = capacidad;
        this.asientos = new ArrayList<>();
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

    /*
        Muestra los asientos en la lista "asientos", su estado se define con un "true" para saber si
        está disponible, y un "false" para saber si está ocupado
         */
    public void mostrarAsientos() {
        for (Asiento asiento : asientos) {
            System.out.println("Número de asiento: " + asiento.getNumAsiento() +
                    " -- Estado: " + (asiento.isEstado() ? "Disponible" : "Ocupado"));
        }
    }


    /*
    @NumberException que utilizo desde otra carpeta indica que el numero de asiento ingresado no es
    valido, se verifica que el asiento está disponible o no.
    Si se encuentra el asiento, cambia su estado a "false".
     */
    public void venderAsiento(int num) throws NumberException {
        boolean encontrado = false;
        for (Asiento asiento : asientos) {
            if (asiento.getNumAsiento() == num) {
                encontrado = true;

                if (asiento.isEstado()) {
                    System.out.println("Asiento número " + asiento.getNumAsiento() + " disponible, ya es suyo.");
                    asiento.setEstado(false);
                } else {
                    System.out.println("Asiento número " + asiento.getNumAsiento() + " NO disponible.");
                }
                break;
            }

        }
        if (!encontrado) {
            throw new NumberException("Número de asiento inválido!!");
        }
    }

    public void addAsiento(int num,boolean estado) throws NumberException{
        if(asientos.size()>=Capacidad){
            throw new NumberException("Máxima capacidad de asientos alcanzada");
        }else{
            Asiento asiento=new Asiento(num,estado);
            asientos.add(asiento);
        }

    }









}