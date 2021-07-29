package test;

import domain.Persona;

public class TestForEach {

    public static void main(String[] args) {
        int edades[] = {5, 3, 6, 8, 7};
        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }

        Persona personas[] = {new Persona("Juan"), new Persona("Karla"), new Persona("Andres")};
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }

}
