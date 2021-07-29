package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuarios {

    public static void main(String[] args) {
        UsuarioJDBC usuarioJdbc = new UsuarioJDBC();

        //Ejecutando el listado de usuarios
//        List<Usuario> usuarios = usuarioJdbc.seleccionar();
//        usuarios.forEach(usuario ->{
//            System.out.println("usuario = " + usuario);
//        });

        //Insertando un nuevo usuario
//        Usuario usuarioNuevo = new Usuario("Carla.durazno", "1234");
//        usuarioJdbc.insertar(usuarioNuevo);

        //Modificar un usuario existente
//        Usuario usuarioMod = new Usuario(2, "maria.lezcano", "1234");
//        usuarioJdbc.actualizar(usuarioMod);

        //Eliminar un usuario
        usuarioJdbc.eliminar(new Usuario(2));
    }
}
