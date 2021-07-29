<!DOCTYPE html>
<%
    String fondo = request.getParameter("colorFondo");
    if(fondo == null || fondo.trim().equals("")){
        fondo = "white";
    }
%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSP cambio de color</title>
</head>
<body bgcolor="<%= fondo %>">
    <h1>JSP cambio de color</h1>
    <br>
    Color de fondo aplicado: <%= fondo%>
    <br>
    <a href="index.html">Regresar al inicio</a>
</body>
</html>