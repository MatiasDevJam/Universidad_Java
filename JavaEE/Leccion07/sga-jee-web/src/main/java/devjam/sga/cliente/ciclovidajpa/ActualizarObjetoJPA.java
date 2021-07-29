package devjam.sga.cliente.ciclovidajpa;

import devjam.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActualizarObjetoJPA {
      static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        
        //Iniciamos la transacción
        
        //Paso 1. Iniciamos una transacción
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //Paso 2. Ejecuta SQL de tipo select
        //EL ID proporcionado debe existir en la DB
        Persona persona1 = em.find(Persona.class, 1);
         
        //Paso 3. Terminamos la transacción 1
        tx.commit();
        
        //Objeto en estado de detached
        log.debug("Obejto recuperado: " + persona1);
        
        //Paso 4. setValue (nuevoValor)
        persona1.setApellido("Juarez");
        
        //Paso 5. Inicia la transacción 2
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        
        //Paso 6. Modificamos el objeto
        em.merge(persona1);
        
        //Paso 7. Terminamos la transacción 2
        tx2.commit();
        
        //Objeto en estado de detached ya modificado
        log.debug("Obejto recuperado" + persona1);
        
        //Cerramos el entity manager
        em.close();
    }
}
