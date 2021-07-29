package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoPersonas {

    public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            PersonaDAO personaDao = new PersonaDAO(conexion);

            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(1);
            cambioPersona.setNombre("Juan");
            cambioPersona.setApellido("Cabral");
            cambioPersona.setEmail("jcabral@mail.com");
            cambioPersona.setTelefono("22558899");
            personaDao.actualizar(cambioPersona);

            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Pity");
            //nuevaPersona.setApellido("Alvarez111111111111111111111111111111111111111111111111111111111");
            nuevaPersona.setApellido("Alvarez");
            personaDao.insertar(nuevaPersona);

            conexion.commit();
            System.out.println("Se ha echo commit de la transaccion");
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}
