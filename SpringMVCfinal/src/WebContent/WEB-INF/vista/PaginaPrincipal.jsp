<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- nombre es el valor del atributo name para el campo de texto del formulario
anterior -->
<p style="color:#ff0000;">Hola ${mensaje}, bienvenido a tu primer formulario</p>
<p style="color:#ff0000;">su edad es: ${param.edad}, bienvenido a tu primer formulario</p>

<a href="http://localhost:8080/spring-demo-mcv/">Pagina Principal</a>

</body>
</html>