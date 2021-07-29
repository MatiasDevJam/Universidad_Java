package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //1. Procesamos parametros
        String accion = req.getParameter("accion");

        //2. Creamos los JavaBeans
        Rectangulo recRequest = new Rectangulo(1, 2);
        Rectangulo recSesion = new Rectangulo(5, 10);
        Rectangulo recAplicacion = new Rectangulo(20, 60);

        //3. Agregamos el JavaBean a algun alcance
        
        //revisamos la accion proporcionada
        if("agregarVariables".equals(accion)){
            //Alcance request
            req.setAttribute("rectanguloRequest", recRequest);
            
            //Alcance session
            HttpSession sesion = req.getSession();
            sesion.setAttribute("rectanguloSesion", recSesion);
            
            //Alcance application
            ServletContext app = this.getServletContext();
            app.setAttribute("rectanguloAplicacion", recAplicacion);
            
            //Agregamos un mensaje
            req.setAttribute("mensaje", "Las variables fueron agregadas");
            
            //4. Redireccionamos al JSP index
            req.getRequestDispatcher("index.jsp").forward(req, res);
        }
        else if("listarVariables".equals(accion)){
            //4. Redireccionamos al JSP que despliega las variables
            req.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(req, res);
        }
        else{
            //4. Redireccionamos a la página de inicio
            req.setAttribute("mensaje", "Acción no proporcionada o desconocida");
            req.getRequestDispatcher("index.jsp").forward(req, res);
            
            //Esta linea no agregaria informacion al JSP, 
            //ya que no propaga los objetos request y response
            //res.sendRedirect("index.jsp");
        }
    }
}
