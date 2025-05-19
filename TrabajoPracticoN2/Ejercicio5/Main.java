package TrabajoPracticoN2.Ejercicio5;

public class Main {
    public static void main(String[] args) {

           Empleados emple1=new Empleados("Matias",10000);
           Empleados emple2=new Empleados("Mateo",15000);

           emple1.mostrarEmpleados(emple1.getNombre(), emple1.getSalario(), emple1.getLegajo());
           emple1.aumentarEmpleado();

           emple2.mostrarEmpleados(emple2.getNombre(), emple2.getSalario(), emple2.getLegajo());

           Empleados.contarEmpleados();
    }
}
