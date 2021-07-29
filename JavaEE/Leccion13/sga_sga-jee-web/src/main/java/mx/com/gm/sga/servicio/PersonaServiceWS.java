package mx.com.gm.sga.servicio;

import java.util.List;
import javax.jws.*;
import mx.com.gm.sga.domain.Persona;

@WebService
public interface PersonaServiceWS {
    
    @WebMethod
    public List<Persona> listarPersonas();
}
