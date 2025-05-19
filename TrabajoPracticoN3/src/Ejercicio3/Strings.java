package Ejercicio3;

public class Strings {

    public static void main(String[] args) {


        String Tweet="@juanchocarancho : nose, cualquier cosa.";






        //Concatenar(Tweet);
        //procesarTweet(Tweet);
        extraerNombre(Tweet);



    }
    public static void procesarTweet(String Tweet){

        int longitud=Tweet.length();

        if(longitud>0 && longitud<280){
            System.out.println("El tweet cumple con el limite de 280 caracteres, tiene: "+longitud);
        }else if(longitud==0){
            System.out.println("El tweet no tiene caracteres...");

        } else{
            System.out.println("el Tweet superó el límite de 280 caracteres");
        }



    }

    public static void Concatenar(String Tweet){

        System.out.println(Tweet+" @");

    }

    public static void extraerNombre(String Tweet){

        if(Tweet.isEmpty()){
            System.out.println("El tweet está vacío");
        }else if(Tweet.indexOf("@")==0){

            String[] palabras=Tweet.split(" ");
            System.out.println("Nombre: "+palabras[0]);




        }else{
            System.out.println("Tweet inválido");
        }


    }

    public static void StringBuilder(){

        StringBuilder sb= new StringBuilder();

        String parte1="cualquier";
        String parte2="cosa";
        String parte3=",";
        String parte4="nose";

        sb.append(parte1);
        sb.append(parte2);
        sb.append(parte3);
        sb.append(parte4);

        System.out.println("Tweet generado: ");
        System.out.println(sb.toString());
    }


}
