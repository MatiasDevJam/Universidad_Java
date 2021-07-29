
package test;

import genericos.ClaseGenerica;

public class TestGenericos {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("Julieta");
        objetoString.obtenerTipo();
    }
}
