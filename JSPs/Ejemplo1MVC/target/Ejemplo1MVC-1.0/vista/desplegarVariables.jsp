<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Despliegue de Variables</title>
</head>
<body>
    <h1>Despliegue de Variables</h1>
    Variable en alcance request: ${mensaje}
    <br>
    Rectangulo:
    Base: ${rectangulo.base}
    Altura: ${rectangulo.altura}
    Area: ${rectangulo.area}
    <br>
    <a href="{pageContext.request.contextPath}/index.jsp">Ir al inicio</a>
</body>
</html>