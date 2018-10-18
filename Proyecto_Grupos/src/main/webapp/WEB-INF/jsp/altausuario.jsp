<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Menu</a>
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
<<<<<<< HEAD
        <a class="nav-link" href="formulario3">Añadir Anuncio</a>
=======
<<<<<<< HEAD
        <a class="nav-link" href="formulario3">Añadir</a>
=======
        <a class="nav-link" href="formulario3">Añadir anuncio</a>
>>>>>>> branch 'master' of https://github.com/miguel10151/Proyecto_Grupo.git
>>>>>>> efa258db6a836dbd1207e88ad748a4d0c9b20582
      </li>
      <li class="nav-item">
        <a class="nav-link" href="formulario4">Mis anuncios</a>
      </li>
    </ul>
  </div>
  </c:if>
  </nav>
	<form action="/altausuario" align="center">

	  
		    <label for="exampleDropdownFormEmail2">Email:         </label>
		    <input type="email"  id="email" placeholder="email@example.com" name="email" size="40"><br>

		    <label for="exampleDropdownFormUser2">Nick:     </label>
		    <input type="text"  id="user" placeholder="Yaku" name="user" size="40"><br>

		    <label for="exampleDropdownFormPassword2">Password:</label>
		    <input type="password"  id="password" name="password" size="40"><br>

	  		<button type="submit" class="btn btn-primary" name="registrarse">Registrarse</button><br>
	  		
	  		<span id="mensaje"></span><br>

	</form>
	
	<script
	  src="https://code.jquery.com/jquery-3.3.1.js"
	  integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
	  crossorigin="anonymous"></script>
  
	<script src="js/main.js"></script> 
	
</body>
</html>