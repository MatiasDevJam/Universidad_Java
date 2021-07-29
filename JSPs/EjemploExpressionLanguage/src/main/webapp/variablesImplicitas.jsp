<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>EL y variables implicitas</title>
</head>
<body>
    <h1>EL y variables implicitas</h1>
    <br>
    <ul>
        <li>Nombre de la aplicación: ${pageContext.request.contextPath}</li>
        <li>Navegador del Cliente: ${header["User-Agent"]}</li>
        <li>Id Sesión: ${cookie.JSESSIONID.value}</li>
        <li>Web Server: ${pageContext.servletContext.serverInfo}</li>
        <li>Valor parametro: ${param.usuario}</li>
    </ul>
    <br>
    <br>
    <a href="index.jsp">Ir al inicio</a>
</body>
</html>