package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        //Declaramos la variable contador
        int contador = 0;
        
        //Revisamos si ya existe la cookie contadorVisitas
        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            for(Cookie c: cookies){
                if(c.getName().equals("contadorVisitas")){
                    contador = Integer.parseInt(c.getValue());
                }
            }
        }
        
        //Incrementar el contador en uno ++
        contador++;
        //Agregamos la respuesta al navegador
        Cookie c = new Cookie("contadorVisitas", Integer.toString(contador));
        //La cookie se almacenará en el cliente durante 1 hora (3600 seg)
        c.setMaxAge(3600);
        res.addCookie(c);
        
        //Mandamos el mensaje al navegador
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.print("Contador de visitas de cada cliente: " + contador);
        
    }
}
