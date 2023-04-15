<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Formularios con Bootstrap</title>
<!-- Agrega los estilos de Bootstrap -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous" />
</head>

<body>
	<h1 class="display-4">Administrativo</h1>
	<div class="p-2 g-col-6"></div>
	<div class="p-2 g-col-6"></div>
	<div class="p-2 g-col-6"></div>
	<div class="p-2 g-col-6"></div>

	<div class="container">
		<div class="row">
			<!-- Primer formulario -->

			<div class="col">
				<form class="form" action="/UEB1/tabla" method="post">
					<input type="hidden" name="_method" value="DELETE">
					<div class="form-group">
						<label for="nombre1">Nombre</label> <input type="text"
							class="form-control" id="nombre1"
							placeholder="Introduce tu nombre" />
					</div>
					<button type="submit" class="btn btn-danger">Eliminar</button>
				</form>
			</div>

			<!-- Segundo formulario -->
			<div class="col">
				<form class="form" action="/UEB1/tabla" method="post">
					<input type="hidden" name="_method" value="PUT">

					<div class="form-group">
						<label for="nombre2">Nombre</label> <input type="text"
							class="form-control" id="nombre2"
							placeholder="Introduce tu nombre" />
					</div>
					<div class="form-group">
						<label for="edad">Edad</label> <input type="number"
							class="form-control" id="edad" placeholder="Introduce tu edad" />
					</div>
					<button type="submit" class="btn btn-primary">Actualizar</button>
				</form>
			</div>
		</div>
	</div>


	<div class="p-2 g-col-6"></div>
	<div class="p-2 g-col-6"></div>
	<div class="p-2 g-col-6"></div>
	<div class="p-2 g-col-6"></div>


	<table class="table table-bordered border-primary">
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Fecha</th>
				<th>Colegio</th>
				<th>Carrera</th>
				<th>Estrato</th>
				<th>Homologado</th>
				<th>Costo</th>
			</tr>
		</thead>
		<tbody>
		
			<!-- Agrega más filas según sea necesario -->
		</tbody>
	</table>


</body>

</html>