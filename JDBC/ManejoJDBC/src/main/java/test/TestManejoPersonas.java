package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {

        PersonaDAO personaDao = new PersonaDAO();
        //Insertando un nuevo objeto de tipo persona
//        Persona personaNueva = new Persona("Andres", "Balcon", "abalcon@mail.com", "30616488");
//        personaDao.insertar(personaNueva);

        //Modificar un registro de persona existente
//        Persona modificarPersona = new Persona(2, "Adrian", "Sarmiento", "asarmiento@mail.com", "30214578");
//        personaDao.actualizar(modificarPersona);

        //Eliminar un registro de persona existente
        Persona eliminarPersona = new Persona(2);
        personaDao.eliminar(eliminarPersona);
        
        List<Persona> personas = personaDao.seleccionar();

        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }
}
