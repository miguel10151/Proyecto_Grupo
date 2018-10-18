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

<div class="container">
	<h1 >LISTADO ANUNCIOS</h1>
	<table  border="2">
	<c:forEach var="l" items="${lista_ultima_quiniela}">
		
		<tr>
			<td>${l.id_quiniela} ${l.fecha_jornada} ${l.resultado} ${l.partido}  ${l.id_categoria}  ${l.jornada} </td>
		</tr>
	</c:forEach>
	</table>
	</div>
</body>
</html>