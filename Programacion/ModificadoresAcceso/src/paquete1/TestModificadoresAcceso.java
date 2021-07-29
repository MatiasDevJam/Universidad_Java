package paquete1;

import paquete1.Clase1;
import paquete1.ClaseHija;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
       Clase1 clase1 = new Clase1("Publico");
       clase1.setAtributoPrivado("Cambio valor del atributo");
        System.out.println("clase1 = " + clase1.getAtributoPrivado());
    }
}
