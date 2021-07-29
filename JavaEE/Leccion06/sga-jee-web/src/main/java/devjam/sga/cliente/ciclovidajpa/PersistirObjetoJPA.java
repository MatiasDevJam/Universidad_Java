package devjam.sga.cliente.ciclovidajpa;

import devjam.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PersistirObjetoJPA {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        //Iniciamos la transacción
        
        //Paso 1. Creamos un nuevo objeto
        //Obejto en estado transitivo
        Persona persona1 = new Persona("Pedro", "Luna", "pluna@mail.com", "11326598");
        
        //Paso 2. Iniciamos la transacción
        tx.begin();
        
        //Paso 3. Ejecutamos SQL
        em.persist(persona1);
        
        log.debug("Objeto persistido - aún sin commit" + persona1);
        
        //Paso 4. commit/rollback
        tx.commit();
        
        //Objeto en estado detached
        log.debug("Objeto persistido - estado detached" + persona1);
         
        //Cerramos el entity manager
        em.close();
    }
}
