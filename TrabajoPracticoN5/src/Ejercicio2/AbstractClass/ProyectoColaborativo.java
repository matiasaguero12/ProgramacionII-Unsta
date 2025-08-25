package Ejercicio2.AbstractClass;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public abstract class ProyectoColaborativo {

    protected LocalDateTime fechaInicio;
    protected LocalDateTime fechaFin;
    protected String Responsable;
    Scanner scanner= new Scanner(System.in);

    public ProyectoColaborativo(LocalDateTime fechaInicio, LocalDateTime fechaFin, String responsable) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        Responsable = responsable;

    }

    public abstract void registrarTrabajo(LocalDateTime inicio, LocalDateTime fin);

    public abstract void mostrarRegistro();




}
