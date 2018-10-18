<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="micss.css">
<head>
<style>
#tabla {
	width: 40%;
    padding: 20px;
    margin: 100px;    
}
#yeye{
text-align: center;
padding-right: 27%;

}

#text{
	width: 40%;
    padding-left: 50%;
    margin: 100px;    
    padding-top: -50%;
}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<<<<<<< HEAD

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Menu</a>
=======
<<<<<<< HEAD
	<h1>hola</h1>
	
=======
<h1>hola</h1>
>>>>>>> branch 'master' of https://github.com/miguel10151/Proyecto_Grupo.git
prueba
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">3 Anuncios</a>
>>>>>>> efa258db6a836dbd1207e88ad748a4d0c9b20582
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <c:if test="${registrado ==false}">
  <div class="collapse navbar-collapse" id="navbarNav">
  &nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp<h1 style="color:white;">¿Desea entrar a la pagina?</h1>&nbsp;&nbsp&nbsp;&nbsp
    <ul class="navbar-nav">
      <li class="nav-item active">
        <button type="button" class="btn btn-light">Entrar</button>&nbsp;&nbsp&nbsp;&nbsp
      </li>
      </ul>
    &nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp<h1 style="color:white;">¿Aun no tienes cuenta??</h1>&nbsp;&nbsp&nbsp;&nbsp
      <ul class="navbar-nav">
      <li class="nav-item">
        <button type="button" class="btn btn-light">Registrar</button>
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
        <a class="nav-link" href="formulario3">Añadir anuncio</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="formulario4">Mis anuncios</a>
      </li>
    </ul>
  </div>
  </c:if>
  
</nav>
<div id="tabla">
	<table class="table">
	
	    
	  <thead class="thead-dark">
	    <tr>
	    <tr>
	      <th></th>
	      <td></td>
	      <td>Jornada</td>
	    </tr>
	      <th scope="col">#</th>
	      <th id="yeye" scope="col" >Resultado</th>
	     
	      <th scope="col">Tu pronostico</th>
	    </tr>
	  </thead>
	  <tbody>
	    <tr>
	      <th scope="row">1</th>
	      <td id="yeye">Equipo1&nbsp; &nbsp;-&nbsp; &nbsp;Equipo2</td>
	     
	      <td>
	      	<input type="radio" name="gender" value="other"> 1
 			 <input type="radio" name="gender" value="other"> X
  			<input type="radio" name="gender" value="other"> 2
  			</td>
	    </tr>
	    <tr>
	      <th scope="row">2</th>
	      <td id="yeye">Equipo3&nbsp; &nbsp;-&nbsp; &nbsp;Equipo4</td>
	    
	        <td>
	      	<input type="radio" name="gender" value="other"> 1
 			 <input type="radio" name="gender" value="other"> X
  			<input type="radio" name="gender" value="other"> 2
  			</td>
	    </tr>
	    <tr>
	      <th scope="row">3</th>
	      <td id="yeye">Equipo5&nbsp; &nbsp;-&nbsp; &nbsp;Equipo6</td>
	 
	        <td>
	      	<input type="radio" name="gender" value="other"> 1
 			 <input type="radio" name="gender" value="other"> X
  			<input type="radio" name="gender" value="other"> 2
  			</td>
	    </tr>
	    <tr>
	      <th scope="row">1</th>
	      <td id="yeye">Equipo1&nbsp; &nbsp;-&nbsp; &nbsp;Equipo2</td>
	     
	       <td>
	      	<input type="radio" name="gender" value="other"> 1
 			 <input type="radio" name="gender" value="other"> X
  			<input type="radio" name="gender" value="other"> 2
  			</td>
	    </tr>
	    <tr>
	      <th scope="row">1</th>
	      <td id="yeye">Equipo1&nbsp; &nbsp;-&nbsp; &nbsp;Equipo2</td>
	     
	       <td>
	      	<input type="radio" name="gender" value="other"> 1
 			 <input type="radio" name="gender" value="other"> X
  			<input type="radio" name="gender" value="other"> 2
  			</td>
	    </tr>
	  </tbody>
	</table>
</div>
<div id="text">
<h1>Como se juega</h1>
<textarea rows="4" cols="50">
At w3schools.com you will learn how to make a website. We offer free tutorials in all web development technologies.
</textarea>
</div>
</body>
</html>