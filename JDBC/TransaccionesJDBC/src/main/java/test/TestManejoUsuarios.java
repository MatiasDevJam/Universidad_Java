package test;

import datos.*;
import domain.Usuario;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoUsuarios {

    public static void main(String[] args) {
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
            UsuarioJDBC usuarioJdbc = new UsuarioJDBC(conexion);
            
            Usuario cambioUsuario = new Usuario();
            cambioUsuario.setId_usuario(3);
            cambioUsuario.setUsername("Miguel");
            cambioUsuario.setPassword("123");
            usuarioJdbc.actualizar(cambioUsuario);
            
            Usuario nuevoUsuario = new Usuario();
            //nuevoUsuario.setUsername("Miguel11111111111111111111111111111111111111111111111111111111111111");
            nuevoUsuario.setUsername("Rafael");
            nuevoUsuario.setPassword("123");
            usuarioJdbc.insertar(nuevoUsuario);
            
            conexion.commit();
            System.out.println("Se ha hecho commit");
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
        }
            try {
                
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
}
