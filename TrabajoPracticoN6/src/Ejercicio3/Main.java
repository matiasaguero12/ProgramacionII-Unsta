package Ejercicio3;

import Ejercicio1.NumberException;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



    /*
    Establezco como "10" la máxima capacidad de asientos en la sala
     */
    SaladeCine saladeCine=new SaladeCine(10);

    try {
        saladeCine.addAsiento(1, true);
        saladeCine.addAsiento(2, true);
        saladeCine.addAsiento(3, true);
        saladeCine.addAsiento(4, true);
        saladeCine.addAsiento(5, true);
        saladeCine.addAsiento(6, true);
        saladeCine.addAsiento(7, true);
        saladeCine.addAsiento(8, true);
        saladeCine.addAsiento(9, true);
        saladeCine.addAsiento(10, true);
        saladeCine.mostrarAsientos();
        saladeCine.venderAsiento(2);
        saladeCine.mostrarAsientos();
    }catch (NumberException e){
        System.out.println("ERROR: "+e.getMessage());
    }





    }
}