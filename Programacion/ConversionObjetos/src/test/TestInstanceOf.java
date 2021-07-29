package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        //determinarTipo(empleado);

        empleado = new Gerente("Samuel", 9000, "Testing");
        determinarTipo(empleado);
    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }

}
