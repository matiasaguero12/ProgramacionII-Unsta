package Ejercicio1;

public class Contraseña {

    private String contrasena;

    public void NumberValidation(String contrasena) throws NumberException{
        if(contrasena.matches(".*\\d.*")){
            System.out.println("Contraseña segura");
        }else{
            throw new NumberException("La contraseña debe contener almenos 1 numero!!");
        }
    }

    public void Validar(String contrasena) throws NumberException {
     if(contrasena==null){
         throw new NullPointerException("Contreña nula!!");
     }else if(contrasena.isEmpty()){
            throw new IllegalArgumentException("Contraseña vacia!!");
        }else if(contrasena.length()<8){
         throw new IllegalArgumentException("La contraseña debe tener mas de  8 caracteres!!");
     }
     NumberValidation(contrasena);
    }





}
