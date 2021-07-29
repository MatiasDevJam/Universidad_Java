package devjam.sga.cliente.cascada;

import devjam.sga.domain.Persona;
import devjam.sga.domain.Usuario;
import javax.persistence.*;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PersistenciaCascadaJPA {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //Paso 1.
        //Objeto en estado transitivo
        Persona persona1 = new Persona("Adriana", "Perez", "padriana@mail.com", "65451852");
        
        //Paso 2.
        //Creamos elobjeto usuario (tiene dependencia con el objeto persona)
        Usuario usuario1 = new Usuario("padriana@mail", "123", persona1);
        
        //Paso 3. Persistimos el objeto usuario unicamente
        em.persist(usuario1);
        
        //Paso 4. commit transacción
        tx.commit();
        
        //Objetos en estado detached
        log.debug("Obejto persistido persona: " + persona1);
        log.debug("Obejto persistido usuario: " + usuario1);
        
        em.close();
    }
}
