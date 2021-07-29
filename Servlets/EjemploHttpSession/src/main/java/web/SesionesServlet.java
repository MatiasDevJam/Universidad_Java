package web;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        res.setContentType("text/html;charset=UTF-8");
        
        //Objeto session
        HttpSession sesion = req.getSession();
        
        //Pedir el atributo contadorVisitas
        String titulo = null;
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        //Si es nulo es la primera verz que accedemos a la aplicación
        if(contadorVisitas == null){
            contadorVisitas = 1;
            titulo = "Bienvenido por primera vez";
        }
        else{
            contadorVisitas++;
            titulo = "Bienvenido nuevamente";
        }
        
        //Agregamos el nuevo valor a la sesión se almacena con un map (clave/valor)
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        //Mandamos la respuesta al cliente
        PrintWriter out = res.getWriter();
        out.print(titulo);
        out.print("<br/>");
        out.print("Nro. accesos al recurso:" + contadorVisitas);
        out.print("<br/>");
        out.print("ID de la sesión:" + sesion.getId());
        out.close();
    }
}
