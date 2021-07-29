package devjam.sga.cliente;

import devjam.sga.domain.Persona;
import devjam.sga.servicio.PersonaServiceRemote;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.*;

public class ClientePersonaService {
    public static void main(String[] args) {
        System.out.println("Iniciando llamad al EJB desde el cliente\n");
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServiceImpl!devjam.sga.servicio.PersonaServiceRemote");
            
            List<Persona> personas = personaService.listarPersonas();
            
            for(Persona persona: personas){
                System.out.println(persona);
            }
            
            System.out.println("\nFin llamaada al EJB desde el cliente");
            
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
