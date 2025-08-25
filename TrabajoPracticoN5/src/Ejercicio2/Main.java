package Ejercicio2;

import Ejercicio2.AbstractClass.ProyectoColaborativo;
import Ejercicio2.Class.DiseñoGrafico;
import Ejercicio2.Class.ProduccionAudiovisual;
import Ejercicio2.Class.Ventas;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LocalDateTime inicio=LocalDateTime.of(2025,8,23,12,30);
        LocalDateTime fin=LocalDateTime.of(2025,8,28,12,30);

        DiseñoGrafico diseñoGrafico=new DiseñoGrafico(inicio,fin,"Carlos");
        ProduccionAudiovisual produccionAudiovisual=new ProduccionAudiovisual(inicio,fin,"Sofia");
        Ventas ventas=new Ventas(inicio,fin,"Matias");


        produccionAudiovisual.comercial();
        produccionAudiovisual.registrarTrabajo(inicio,fin);
        produccionAudiovisual.mostrarRegistro();

        ventas.ventas();
        ventas.registrarTrabajo(inicio,fin);
        ventas.mostrarRegistro();


        diseñoGrafico.creacionBocetos();
        diseñoGrafico.registrarTrabajo(inicio,fin);
        diseñoGrafico.mostrarRegistro();
    }
}