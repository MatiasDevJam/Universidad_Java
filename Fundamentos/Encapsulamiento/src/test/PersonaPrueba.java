package test;

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Jose", 5000.00, false);
        System.out.println("persona1 = " + persona1);
        persona1.setNombre("Jose Jose");
//        System.out.println("nombre modificado = " + persona1.getNombre());
//        System.out.println("persona1 sueldo = " + persona1.getSueldo());
//        System.out.println("persona1 eliminado = " + persona1.isEliminado());
        System.out.println("persona1 = " + persona1);
    }
}
