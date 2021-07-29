<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>JSTL Core (JSP Standard Tag Library)</h1>
        <!<!-- Manipulacion de variables -->
        <!<!-- Definimos la variable -->
        <c:set var="nombre" value="Ernesto"/>
        <!<!-- Desplegamos el valor de la variable -->
        Variable nombre: <c:out value="${nombre}"/>
        <br>
        <br>
        Variable con codigo HTML:
        <c:out value="<h4>Hola</h4>" escapeXml="false"/>
        <br>
        <br>
        <!-- Codigo condicionado, uso de if -->
        <c:set var="bandera" value="true"/>

        <c:if test="${bandera}">
            La bandera es verdadera
        </c:if>

        <!-- Codigo condicionado, uso de switch -->
        <c:if test="${param.opcion == null}">
            <c:choose>
                <c:when test="${param.opcion == 1}">
                    <br>
                    Opcion 1 seleccionada
                </c:when>
                <c:when test="${param.opcion == 2}">
                    <br>
                    Opcion 2 seleccionada
                </c:when>
                <c:otherwise>
                    <br>
                    Opcion desconocida: ${param.value}
                </c:otherwise>
            </c:choose>
        </c:if>
        <!<!-- Iteracion de un array -->
        <%
            String nombres[] = {"Claudia", "Maria", "Sofia"};
            request.setAttribute("nombres", nombres);
        %>
        <br>
        Lista de nombres:
        <br>
        <ul>
            <c:forEach var="persona" items="${nombres}">
                <li>${persona}</li>
            </c:forEach>
        </ul>
        <br>
        <a href="index.jsp">Ir al inicio</a>
    </body>
</html>