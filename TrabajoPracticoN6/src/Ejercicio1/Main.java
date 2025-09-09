package Ejercicio1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NumberException {
        Contraseña contraseña=new Contraseña();


        try {
            contraseña.Validar("someoneone");
        }catch (NullPointerException | IllegalArgumentException | NumberException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}