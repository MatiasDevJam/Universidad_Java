package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(5, 6);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(8.0, 9);
        System.out.println("resultado2 = " + resultado2);
        
        var resultado3 = Operaciones.sumar(8, 10L);
        System.out.println("resultado3 = " + resultado3);
    }
}
