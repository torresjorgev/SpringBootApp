<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pagina Principal</title>
</head>
<body>
	<h1>Lista de Películas</h1>
	<ol>
		<c:forEach items="${ peliculas }" var="pelicula">
			<li>${ pelicula }</li>
		</c:forEach>
	</ol>
	Tabla de Películas
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Título</th>
				<th>Duración</th>
				<th>Clasificación</th>
				<th>Género</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ peliculas }" var="pelicula">
				<tr>
					<td>${pelicula.id}</td>
					<td>${pelicula.titulo}</td>
					<td>${pelicula.duracion} min.</td>
					<td>${pelicula.clasification}</td>
					<td>${pelicula.genero}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>