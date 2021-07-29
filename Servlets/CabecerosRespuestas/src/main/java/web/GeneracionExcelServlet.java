package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet{
    
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        res.setContentType("application/vnd.ms-excel");
        //Permite descargar archivo en formato Excel
        res.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls");
        //Para un uso más profesional de Excel usar poi.apache.org
        
        //Imdicar al navegador no guarde cache
        res.setHeader("Pragma", "no-cache");
        res.setHeader("Cache-Control", "no-store");
        res.setDateHeader("Expires", -1);
        
        //Desplegamos la información al cliente
        PrintWriter out = res.getWriter();
        out.println("\tValores");
        out.println("\t1");
        out.println("\t2");
        out.println("Total\t=SUMA(B2;B3)");
        out.close();
        
    }
}
