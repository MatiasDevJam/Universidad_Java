package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
//        String elemento = miLista.get(0);
//        System.out.println("elemento = " + elemento);
//        imprimir(miLista);
        
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
//        imprimir(miSet);
        
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Julieta");
        miMapa.put("valor2", "Analia");
        miMapa.put("valor3", "Matias");
        
        String elementoMapa = miMapa.get("valor2");
        System.out.println("elementoMapa = " + elementoMapa);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    
    }
    
    public static void imprimir(Collection<String> coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
