<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Autenticación de administrador</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous"></link>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
	crossorigin="anonymous"></script>
</head>
<body>

	<section>
		<div class="container mt-5">
			<div class="row justify-content-center">
				<div class="col-md-6">
					<h2 class="text-center mb-4">Iniciar Sesión</h2>
					<form method="post" action="/UEB1/admin">
						<div class="form-group">
							<label for="username">Usuario:</label> <input type="text"
								class="form-control" id="username" name="username"
								placeholder="Ingrese su usuario">
						</div>
						<div class="form-group">
							<label for="contraseña">Contraseña:</label> <input
								type="password" class="form-control" id="password"
								name="password" placeholder="Ingrese su contraseña">
						</div>
						<br>
						<button type="submit" class="btn btn-primary btn-block">Iniciar
							Sesión</button>
					</form>
				</div>
			</div>
		</div>
	</section>
</body>
</html>
