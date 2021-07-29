package devjam.sga.cliente.ciclovidajpa;

import devjam.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActualizarObjetoSesionLarga {
     static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        
        //Iniciamos la transacción
        //Paso 1. Iniciamos una transacción
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //Paso 2. Ejecutamos eññ SQL de tipo select
        Persona persona1 = em.find(Persona.class, 1);
        
        log.debug("Objeto encontrado:" + persona1);
        
        //Paso 3. setValue (nuevoValor)
        persona1.setEmail("jjuarez@mail.com");
        
        persona1.setEmail("j.juarez@mail.com");
        
        //Paso 4. Terminamos la transacción
        tx.commit();
        
        //Objeto en estado de detached
        log.debug("Objeto modificado:" + persona1);
        
        //Cerramos el entity manager
        em.close();
    }
}
