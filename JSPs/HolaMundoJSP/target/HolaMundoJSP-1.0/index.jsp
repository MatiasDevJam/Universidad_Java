<%-- 
    Document   : index
    Created on : 23 may 2021, 22:10:23
    Author     : 54113
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hola mundo JSPs</title>
</head>
<body>
    <h1>Hola mundo JSPs</h1>
    <ul>
        <li><% out.print("HolaMundo con Scriptlets"); %></li>
        <li>${"HolaMundo con Expression Language(EL)"}</li>
        <li><%= "HolaMundo con Expresiones"%></li>
        <li><c:out value="HolaMundo con JSTL"/></li>
    </ul>
</body>
</html>
