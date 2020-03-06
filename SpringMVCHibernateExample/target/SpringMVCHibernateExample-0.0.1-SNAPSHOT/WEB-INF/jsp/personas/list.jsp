<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer</title>
</head>

<body>
 <spring:url value="/persona/add" var="addURL" />
 <a href="${addURL }">Add new Customer</a>
 
 <table width="100%" border="1">
  <tr>

   <td>Nombre</td>
   <td>Apellido</td>
   <td>TipoDocumento</td>
   <td>NumeroDocumento</td>
   <td colspan="2">Acciones</td>
  </tr>  
  <c:forEach items="${list }" var="persona" >
   <tr>

    <td>${persona.nombre }</td>
    <td>${persona.apellido }</td>
    <td>${persona.tipo_documento }</td>
    <td>${persona.numero_documento }</td>
    <td>
     <spring:url value="/persona/update/${persona.id }" var="updateURL" />
     <a href="${updateURL }">Actualizar</a>
    </td>
    <td>
     <spring:url value="/persona/delete/${persona.id }" var="deleteURL" />
     <a href="${deleteURL }">Borrar</a>
    </td>
   </tr>
  </c:forEach>
 </table>
</body>
</html>