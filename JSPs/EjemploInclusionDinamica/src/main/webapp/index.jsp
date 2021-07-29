<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejemplo inclusión Dinamica</title>
</head>
<body>
    <h1>Ejemplo inclusión Dinamica</h1>
    <br>
    <jsp:include page="paginas/recursoPublico.jsp"/>
    <br>
    <jsp:include page="WEB-INF/recursoPrivado.jsp">
        <jsp:param name="colorFondo" value="yellow"/>
        </jsp:include>
</body>
</html>