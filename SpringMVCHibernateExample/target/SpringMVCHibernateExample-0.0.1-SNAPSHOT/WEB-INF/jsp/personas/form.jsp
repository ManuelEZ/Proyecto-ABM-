<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
</head>

<body>
 <spring:url value="/persona/save" var="saveURL" />
 
 <form:form action="${saveURL }" method="POST" modelAttribute="customerForm">
  <form:hidden path="id"/>
  <table>
   <tr>
    <td>Nombre</td>
    <td><form:input path="nombre"/></td>
   </tr>
   <tr>
    <td>Apellido</td>
    <td><form:input path="apellido"/></td>
   </tr>  
   <tr>
    <td>TipoDocumento: </td>
    <td>
     <form:radiobutton path="tipo_documento" value="Dni" /> Dni
     <form:radiobutton path="tipo_documento" value="Pasaporte" /> Pasaporte
     <form:radiobutton path="tipo_documento" value="Cedula" /> Cedula
    </td>
   </tr> 
   <tr>
    <td>NumeroDocumento</td>
    <td><form:input path="numero_documento"/></td>
   </tr>
   <tr>
    <td></td>
    <td><button type="submit">Guardar</button></td>
   </tr>
  </table>
 </form:form>
</body>
</html>