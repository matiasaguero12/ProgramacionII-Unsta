package Ejercicio2;

public class Estudiante {

    public void validarCalificacion(String Nombre,int Calificacion){
        if(Calificacion>0 && Calificacion<=10){
            System.out.println("Nota cargada correctamente para el alumno "+Nombre);
        }else{
            throw new IllegalArgumentException("Indique un valor correcto entre 0 y 10!!");
        }
    }
}
