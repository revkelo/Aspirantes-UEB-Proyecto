<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<title>Iniciar sesión - Mi sitio web</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Carga la biblioteca de Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</link>
<script src="login.js"></script>



</head>

<body>


	<div class="container">

		<h2>Iniciar sesión</h2>
		<form onsubmit="validarFormulario(event)">
			<div class="form-group">
				<label for="usuario">Usuario:</label> <input type="text"
					class="form-control" id="usuario" placeholder="Ingresa tu usuario">
			</div>
			<div class="form-group">
				<label for="pwd">Contraseña:</label> <input type="password"
					class="form-control" id="pwd" placeholder="Ingresa tu contraseña">
			</div>
			<button type="submit" class="btn btn-primary">Ingresar</button>
		</form>
</body>

</html>