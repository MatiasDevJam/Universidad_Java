package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet {
   
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        String metodoHttp = req.getMethod();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers HTTP</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Headers HTTP</h1>");
        out.print("<br>");
        out.print("Método Http: " + metodoHttp);
        
        String uri = req.getRequestURI();
        out.print("<br>");
        out.print("Uri solicitada: " + uri);
        
        //Imprimimos todos los cabeceros disponibles
        out.print("<br>");
        out.print("<br>");
        Enumeration cabeceros = req.getHeaderNames();
        while(cabeceros.hasMoreElements()){
            String nombreCabecero = (String) cabeceros.nextElement();
            out.print("<b>" + nombreCabecero + "</b>:");
            out.print(req.getHeader(nombreCabecero));
            out.print("<br>");
        }
        
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
