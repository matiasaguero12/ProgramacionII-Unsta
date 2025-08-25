package Ejercicio2.Class;

import Ejercicio2.AbstractClass.ProyectoColaborativo;
import Ejercicio2.Interfaces.DisenoGraficoInterface;
import Ejercicio2.Registro.Registro;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiseñoGrafico extends ProyectoColaborativo implements DisenoGraficoInterface {

    Scanner scanner=new Scanner(System.in);
    List<Registro> registros=new ArrayList<>();

    public DiseñoGrafico(LocalDateTime fechaInicio, LocalDateTime fechaFin, String responsable) {
        super(fechaInicio, fechaFin, responsable);

    }
    public DiseñoGrafico(){
        super(null,null,null);

    }


    @Override
    public void registrarTrabajo(LocalDateTime inicio, LocalDateTime fin) {
        Duration duracion = Duration.between(inicio, fin);
        int horas = (int) duracion.toHours();

        System.out.println("Escriba el informe: ");
        String informe=scanner.nextLine();
        registros.add(new Registro(horas,informe));
    }

    @Override
    public void mostrarRegistro() {
        registros.stream().forEach(registro -> System.out.println("Horas invertidas en el trabajo: "+registro.getHoraInvertida()+", " +
                "Informe de progreso: "+registro.getInforme()));
    }


    @Override
    public void creacionBocetos() {
        System.out.println(this.Responsable +" está diseñando bocetos para mejor relacion con los clientes...");
    }

    @Override
    public void publicidad() {
        System.out.println("Creando publicidad para crear atencion por parte del cliente..");
    }
}



