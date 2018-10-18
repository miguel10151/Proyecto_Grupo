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
#partido{
text-align: center;
padding-right: 27%;

}

#text{
	width: 40%;
    padding-left: 50%;
    margin: 100px;    
    padding-top: -50%;
}

ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a, .dropbtn {
    display: inline-block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
    background-color: red;
}

li.dropdown {
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
    display: block;
}


/* Change color of dropdown links on hover */
.dropdown-content a:hover {background-color: #ddd}

/* Show the dropdown menu (use JS to add this class to the .dropdown-content container when the user clicks on the dropdown button) */
.show {display:block;}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Menu</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <c:if test="${empty usuario}">
  <div class="collapse navbar-collapse" id="navbarNav">
  &nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp<h1 style="color:white;">¿Desea entrar a la pagina?</h1>&nbsp;&nbsp&nbsp;&nbsp
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a href="formulario"><button type="button" class="btn btn-light">Entrar</button>&nbsp;&nbsp&nbsp;&nbsp</a>
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
  
  <c:if test="${not empty usuario}">
  <div class="dropdown show">
  <a class="btn btn-secondary dropdown-toggle" href="#" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Dropdown link
  </a>

  <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
    <a class="dropdown-item" href="#">Action</a>
    <a class="dropdown-item" href="#">Another action</a>
    <a class="dropdown-item" href="#">Something else here</a>
  </div>
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
	      <th id="resultado" scope="col" >Resultado</th>
	     
	      <th scope="col">Tu pronostico</th>
	    </tr>
	  </thead>
	  <tbody>
	  <c:forEach var="c" items="${lista_ultima_quiniela}">
	    <tr>
	    
	      <th scope="row">1</th>
	      <td id="partido">${c.partido }</td>
	     
	      <td>
	      	<label>${c.resultado }</label>
  			</td>
	    </tr>
	    </c:forEach>
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