<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSP con Scriptlets</title>
</head>
<body>
    <h1>JSP con Scriptlets</h1>
    <br>
    <%--Scriplet para enviar información al navegador --%>
    <%
        out.print("Saludos desde un Scriptlet");
    %>
    <%--Scriplet para manipular los objetos implicitos --%>
    <%
        String nombreAplicacion = request.getContextPath();
        out.print("nombre de la aplicacón: " + nombreAplicacion);
    %>
    <br>
    <%--Scriplet con codigo condicionado --%>
    <%
        if(session != null && session.isNew()){
    %>
        la sesion SI es nueva
    <%
        }else if(session != null){
    %>
        la sesion NO es nueva
    <% } %>
    <br>
    <a href="index.html">Regresar al inicio</a>
</body>
</html>