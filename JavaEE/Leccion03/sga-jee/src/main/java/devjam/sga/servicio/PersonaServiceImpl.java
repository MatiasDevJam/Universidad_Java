package devjam.sga.servicio;

import devjam.sga.domain.Persona;
import java.util.ArrayList;
import java.util.List;


public class PersonaServiceImpl implements PersonaServiceRemote{

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1,"Adrian", "Garcia", "agarcia@mail.com", "55889954"));
        personas.add(new Persona(2,"Marta", "Suarez", "msuarez@mail.com", "55649954"));
        return personas;
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
    }

    @Override
    public void modificarPersona(Persona persona) {
    }

    @Override
    public void eliminarPersona(Persona persona) {
    }
    
}
