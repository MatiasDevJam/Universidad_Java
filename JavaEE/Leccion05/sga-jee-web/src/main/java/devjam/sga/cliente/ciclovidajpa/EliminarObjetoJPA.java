package devjam.sga.cliente.ciclovidajpa;

import devjam.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EliminarObjetoJPA {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        
        //Iniciamos la transacción
        //Paso 1. Iniciamos una transacción
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //Paso 2. Ejecutamos eññ SQL de tipo select
        Persona persona1 = em.find(Persona.class, 2);
        
        //Paso 3. Terminamos la transacción 1
        tx.commit();
        
        //Objeto en estado de detached
        log.debug("Objeto modificado:" + persona1);
        
        //Paso 4. Iniciamos transacción 2 
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        
        //Paso 5. Ejecutamos SQL de tipo delete
        em.remove(em.merge(persona1));
        
        //Paso 6. Terminamos la transacción 2
        tx2.commit();
        
        //Objeto en estado de detached ya eliminado
        log.debug("Obejto eliminado:" + persona1);
        
        //Cerramos el entity manager
        em.close();
    }
}
