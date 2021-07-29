package test;

import beans.HolaMundoEjbRemote;
import javax.naming.*;

public class TestHolaMundoEJB {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde cliente\n");
        try{
            Context jndi = new InitialContext();
            HolaMundoEjbRemote holaMundoEJB = (HolaMundoEjbRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEjbImpl!beans.HolaMundoEjbRemote");
            int resultado = holaMundoEJB.sumar(10, 25);
            System.out.println("Resultado de la suma 10 + 25: " + resultado);
        }
        catch(NamingException e){
            e.printStackTrace(System.out);
        }
    }
}
