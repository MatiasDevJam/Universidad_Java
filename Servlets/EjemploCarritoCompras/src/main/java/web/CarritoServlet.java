package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html;charset=UTF-8");

        //Creamos o recuperamos el objeto http session
        HttpSession sesion = req.getSession();

        //Recuperamos la lista de articulos entregados previamente si existen
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        //Verificamos la lista de articulos existe
        if (articulos == null) {
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }

        //Procesamos el nuevo artículo
        String articulaNuevo = req.getParameter("articulo");

        //Revisamos y agremos el articulo nuevo
        if (articulaNuevo != null && !articulaNuevo.trim().equals("")) {
            articulos.add(articulaNuevo);
        }

        try ( //Imprimimos la lista de articulos
                PrintWriter out = res.getWriter()) {
            out.print("<h1>Lista de Articulos</h1>");
            out.print("<br>");
            //iteramos todos los articulos
            for (String articulo : articulos) {
                out.print("<li>" + articulo + "</li>");
            }
            //agregamos un link para regresar al inicio
            out.print("<br>");
            out.print("<a href='/EjemploCarritoCompras'>Regresar al inicio</a>");
        }
    }
}
