package devjam.sga.cliente.asociaciones;

import devjam.sga.domain.Persona;
import devjam.sga.domain.Usuario;
import java.util.List;
import javax.persistence.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientesAsociacionesJPa {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        List<Persona> personas = em.createNamedQuery("Persona.findAll").getResultList();
        
        //Cerramos la conexión
        em.close();
        
        //Imprimimos los objetos de tipo persona
        for(Persona persona: personas){
            log.debug("Persona:" + persona);
            //Recuperamos los usuarios de cada persona
            for(Usuario usuario: persona.getUsuarioList()){
                log.debug("Usuario:" + usuario);
            }
        }
    }
}
