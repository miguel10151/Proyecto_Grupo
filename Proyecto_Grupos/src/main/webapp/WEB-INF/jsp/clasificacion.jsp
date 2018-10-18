<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
   <tr>
   <th>Usuario</th>
   <th>Puntos</th>
   <th>Prefecto</th>
   <th>Ganado</th>
   <th>Deporte</th>
   <th>Jornada</th>
   <c:forEach var="u" items="${lista}">
  		<tr>
  		<td>${u.nick}</td>
  		<td>${u.puntos}</td>
  		<td>${u.perfecto}</td>
  		<td>${u.ganado}</td>
  		<td>${u.id_categoria}</td>
  		<td>${u.jornada}</td>
  		</tr>
   	</c:forEach>	
   </table>	
</body>
</html>