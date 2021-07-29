package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        
        personas[0] = new Persona("Analia");
        personas[1] = new Persona("Julieta");
        
        System.out.println("persona 0 = " + personas[0]);
        System.out.println("persona 1 = " + personas[1]);
        
        for(int i=0; i < personas.length; i++){
            System.out.println("Personas " + i + " = " + personas[i]);
        }
        
        String frutas[] = {"Banana", "Manzana", "Pera"};
        
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Frutas = " + frutas[i]);
        }
    }
}
