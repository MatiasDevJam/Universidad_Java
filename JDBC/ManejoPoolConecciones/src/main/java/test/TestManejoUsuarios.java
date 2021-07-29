package test;

import datos.*;
import domain.UsuarioDTO;
import java.sql.*;
import java.util.List;

public class TestManejoUsuarios {

    public static void main(String[] args) {
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
            UsuarioDAO usuarioDao = new UsuarioDaoJDBC(conexion);
          
            List<UsuarioDTO> usuarios = usuarioDao.select();
            
            usuarios.forEach(usuario -> {
                System.out.println("Usuario: " + usuario);
            });
            
            
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
