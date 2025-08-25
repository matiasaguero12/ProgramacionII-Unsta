package Ejercicio2.Class;

import Ejercicio2.AbstractClass.ProyectoColaborativo;
import Ejercicio2.Interfaces.ProduccionAudiovisualInterface;
import Ejercicio2.Registro.Registro;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProduccionAudiovisual extends ProyectoColaborativo implements ProduccionAudiovisualInterface {
    List<Registro> registros=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);
    public ProduccionAudiovisual(LocalDateTime fechaInicio, LocalDateTime fechaFin, String responsable) {
        super(fechaInicio, fechaFin, responsable);
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
    public void comercial() {
        System.out.println("Creando comerciales...");
    }

    @Override
    public void publicidad() {
        System.out.println("Creando publicidad para redes sociales..");
    }
}
