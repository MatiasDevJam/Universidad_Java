package test;

import domain.*;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        //FiguraGeometric figura = new FiguraGeometrica();
        
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
}
