package test;

import javax.persistence.*;
import org.apache.logging.log4j.*;
import sga.domain.Persona;

public class ClienteEntidadPersona {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        //Iniciamos la transacción
        tx.begin();
        //No debemos especificar el ID de la DB
        Persona persona1 = new Persona("Maria", "Salinas", "msalinas@mail.com", "32654518");
        log.debug("Objeto a persistir: " + persona1);
        //Persistimos el objeto
        em.persist(persona1);
        //Terminamos la transacción
        tx.commit();
        log.debug("Objeto persistido: " + persona1);
        em.close();
        
    }
}
