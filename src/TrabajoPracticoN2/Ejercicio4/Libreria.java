package TrabajoPracticoN2.Ejercicio4;

import java.util.Scanner;

public class Libreria {

    private String titulo;
    private String autor;
    private int isbn;
    private String estado;

    public Libreria(String titulo, String autor, int isbn, String estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getISBN() {
        return isbn;
    }

    public String getEstado() {
        return estado;
    }

    public void prestar() {
        if ("Disponible".equals(estado)) {
            System.out.println("El libro: " + titulo + " está disponible, puede llevárselo.");
            estado = "No disponible";
        } else {
            System.out.println("El libro no está disponible. Lo siento...");
        }
    }

    public void devolver() {
        if ("No disponible".equals(estado)) {
            System.out.println("El libro: " + titulo + " fue devuelto con éxito.");
            estado = "Disponible";
        } else {
            System.out.println("El libro: " + titulo + " nunca fue retirado...");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Libro: " + titulo + "\nAutor: " + autor + "\nISBN: " + isbn + "\nEstado: " + estado);
    }

   public void menu(){
        int opcion;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Elija las siguientes opciones...");
            System.out.println("1)Prestar libro...");
            System.out.println("2)Devolver libro...");
            System.out.println("3)Mostrar informacion del libro");
            System.out.println("4)Salir.");
            System.out.println("Opcion: ");
            opcion= scanner.nextInt();
            switch (opcion){
                case 1:
                    prestar();
                    break;
                case 2:
                    devolver();
                    break;
                case 3:
                    mostrarInformacion();
                    break;
                case 4:
                    System.out.println("Saliendo de la libreria...");
                    break;
                default:
                    System.out.println("Numero invalido");

            }


        }while(opcion!=4);
   }

}