<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejemplo MVC 2</title>
</head>
<body>
    <h1>Ejemplo MVC 2</h1>
    <br>
    <div style="color: red">${mensaje}</div>
    <br>
    <a href="${pageContext.request.contextPath}/ServletControlador">
        Link al servlet controlador SIN parametros
    </a>
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=agregarVariables">
        Link al servlet controlador para agregar variables
        </a>
         <br>
        <br>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarVariables">
        Link al servlet controlador para listar variables
        </a>
</body>
</html>