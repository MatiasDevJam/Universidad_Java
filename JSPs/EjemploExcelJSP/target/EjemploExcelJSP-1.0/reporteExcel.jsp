<%@page errorPage="WEB-INF/manejoErrores.jsp" %>
<%@page import="utileria.Conversiones, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel" %>
<%
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition", "inline;filename=" + nombreArchivo);
%>

<!DOCTYPE html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reporte de Excel</title>
</head>
<body>
    <h1>Reporte de Excel</h1>
    <br>
    <table border="1">
        <tr>
            <th>Curso</th>
            <th>Descripción</th>
            <th>Fecha</th>
        </tr>
        <tr>
            <td>1. Fundamentos de Java</td>
            <td>Aprenderemos la sintaxis básica de Java</td>
            <td><%= Conversiones.format(new Date())%></td>
        </tr>
        <tr>
            <td>2. Programación con Java</td>
            <td>Pondremos en práctica conceptos de la programación orientada a objetos</td>
            <td><%= Conversiones.format(new Date())%></td>
        </tr>
    </table>
</body>
</html>