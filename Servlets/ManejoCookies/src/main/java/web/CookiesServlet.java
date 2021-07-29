package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet{
    
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        //Suponemos que el usuario visita por primera vez nuestro sitio
        boolean nuevoUsuario = true;
        
        //Obtenemos el arreglo de cookies
        Cookie[] cookies = req.getCookies();
        
        //Buscamos si ya existe una cookie creada con anterioridad
        //llamada visitanteRecurrente
        if(cookies != null){
            for(Cookie c: cookies){
                if(c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")){
                    //si ya existe la cookie es un usuario recurrente
                    nuevoUsuario = false;
                    break;
                }
            }
        }
        String mensaje = null;
        if(nuevoUsuario){
            //El nuevo objeto Cookie es un map que devuelve clave y valor
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
            res.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio por primera vez";
        }
        else{
            mensaje = "Gracias por visitar nuevamente nuestro sitio";
        }
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.print("Mensaje:" + mensaje);
        out.close();
    }
}
