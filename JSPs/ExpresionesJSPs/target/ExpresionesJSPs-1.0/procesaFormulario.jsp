<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Procesa Formularios</title>
</head>
<body>
    <h1>Resultado de Procesar el Formulario</h1>
    Usuario: <%= request.getParameter("usuario")%>
    <br>
    Password: <%= request.getParameter("password")%>
    <br>
    <br>
    <a href="index.html">Regresar al inicio</a>
</body>
</html>