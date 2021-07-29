package test;

import enumeracion.*;


public class TestEnumeraciones {
    public static void main(String[] args) {
//        System.out.println("Dia 1: " + Dias.LUNES);
//        indicarDiasSemana(Dias.MARTES);

          System.out.println("Continente nro 4: " + Continentes.AMERICA);
          System.out.println("Nro paises en el 4to continente: " + Continentes.AMERICA.getPaises());
          
          System.out.println("Continente nro 3: " + Continentes.ASIA);
          System.out.println("Nro paises en el 3ro continente: " + Continentes.ASIA.getPaises());
    }
    
    public static void indicarDiasSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                        
        }
    }
}
