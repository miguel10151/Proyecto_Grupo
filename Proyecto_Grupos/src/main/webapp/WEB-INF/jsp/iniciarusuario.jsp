<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">3 Anuncios</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <c:if test="${registrado ==false}">
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="formulario">Iniciar Sesion <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="formulario2">Registrarse</a>
      </li>
     </ul>
  </div>
  </c:if>
  
  <c:if test="${registrado ==true}">
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="/">Index <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="formulario">Iniciar Sesion</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="formulario3">A�adir anuncio</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="formulario4">Mis anuncios</a>
      </li>
    </ul>
  </div>
  </c:if>
   </nav>
<form  action="/iniciarusuario" align="center">
    <label >Usuario:</label>
    <input type="text"  id="user" placeholder="Usuario" name="user"><br>

    <label >Password: </label>
    <input type="password"  id="exampleDropdownFormPassword2" placeholder="Password" name="password"><br>
  
  	<button type="submit" class="btn btn-primary" name="iniciar">Iniciar Sesion</button>
		<a href="formulario2"><br>
			<b>Registrarse</b></a>	
</form>
<b>${mensaje}</b><br>
</body>
</html>