<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSP con Expresiones</title>
</head>
<body>
    <h1>JSP con Expresiones</h1>
    Concatenación: <%= "Saludos" + " " + "JSP"%>
    <br>
    Operación Matematica: <%= 2 * 5 / 2%>
    <br>
    Session id: <%= session.getId()%>
    <br>
    <br>
    <a href="index.html">Regresar al inicio</a>
</body>
</html>