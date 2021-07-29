package devjam.sga.cliente.ciclovidajpa;

import devjam.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class EncontrarObjetoJPA {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        
        //Iniciamos la transacción
        
        //Paso 1. Iniciamos una transacción
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //Paso 2. Ejecuta SQL de tipo select
        Persona persona1 = em.find(Persona.class, 1);
         
        //Paso 3. Terminamos la transacción
        tx.commit();
        
        //Objeto en estado de detached
        log.debug("Obejto recuperado: " + persona1);
        
        //Cerramos el entity manager
        em.close();
    }
}
