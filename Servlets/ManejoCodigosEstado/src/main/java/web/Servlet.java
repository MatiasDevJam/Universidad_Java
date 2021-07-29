
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        //Simulando los valores correctos
        
        String usuarioOk = "Juan";
        String passwordOk = "123";
        
        String usuario = req.getParameter("usuario");
        String password = req.getParameter("password");
        
        PrintWriter out = res.getWriter();
        
        if(usuarioOk.equals(usuario) && passwordOk.equals(password)){
            out.print("<h1>");
            out.print("Datos correctos");
            out.print("<br>Usuario: " + usuario);
            out.print("<br>Password: " + password);
            out.print("</h1>");
        }
        else{
            res.sendError(res.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        }
        out.close();
    }
}
