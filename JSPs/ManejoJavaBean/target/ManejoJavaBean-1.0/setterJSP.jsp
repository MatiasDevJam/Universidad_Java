<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSP que modifica a un JavaBean</title>
</head>
<body>
    <h1>JSP que modifica a un JavaBean</h1>
    <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"/>
    Modificamos los atributos;
    <br>
    <br>
    <%
        int baseValor = 5;
        int alturaValor = 10;
    %>
    <jsp:setProperty name="rectangulo" property="base" value="<%=baseValor%>" />
    <jsp:setProperty name="rectangulo" property="altura" value="<%=alturaValor%>" />
    <br>
    Nuevo valor base: <%=baseValor%>
    <br>
    Nuevo valor altura: <%=alturaValor%>
    <br>
    <br>
    <a href="index.jsp">Ir al inicio</a>
</body>
</html>