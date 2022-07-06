<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Ejemplo formulario Spring MVC</title>
	</head>
	<body>
		<!-- el formulario enviara los datos a la url /procesarFormulario a traves del metodo
		GET de HTTP -->
		<form action="formulario" method="POST">
			<!-- caja de texto donde se escribira el nombre -->
			<input type="text" name="nombre" placeholder="Escribe tu nombre" />
			<!-- boton para enviar la informacion -->
			<input type="submit" />
		</form>
	</body>
</html>