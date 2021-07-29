<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSP que lee los valores del JavaBean</title>
</head>
<body>
    <h1>JSP que lee los valores del JavaBean</h1>
    <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session" />
    <br>
    Valor base: <jsp:getProperty name="rectangulo" property="base"/>
    <br>
    Valor altura: <jsp:getProperty name="rectangulo" property="altura"/>
    <br>
    Valor area: <jsp:getProperty name="rectangulo" property="area"/>
    <br>
    <br>
    <a href="index.jsp">Ir al inicio</a>
</body>
</html>