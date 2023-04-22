<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Administrador</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
	crossorigin="anonymous"></script>

<link rel="stylesheet" href="./css/style.css">


</head>
<body>
	<div class="form-register text-center">
		<h1>Administrativo</h1>
	</div>

	<div class="container">
		<div class="row form-register">
			<!-- Formulario de Medicina -->
			<div class="form-register">
				<div class="card">
					<div class="card-header">
						<h3>Listar por carrera</h3>
					</div>
					<div class="card-body">
						<form enctype="multipart/form-data"
							name="Formulario ServeletGuardar" method="get"
							action="/UEB1/listar">
							<div class="controls">
								<label for="selectCarrera">Carrera:</label> <select
									class="form-control" id="selectCarrera" name="carrera">

									<option value="">Selecciona una carrera</option>
									<option value="Arquitectura">Arquitectura</option>
									<option value="Arte Dramatico">Arte Dramatico</option>
									<option value="Artes Plasticas">Artes Plasticas</option>
									<option value="Diseno Industrial">Diseno Industrial</option>
									<option value="Diseno de Comunicacion">Diseno de
										Comunicacion</option>
									<option value="Formacion Musical">Formacion Musical</option>
									<option value="Ciencia Politica y Gobierno">Ciencia
										Politica y Gobierno</option>
									<option value="Derecho">Derecho</option>
									<option value="Filosofia">Filosofia</option>
									<option value="Licenciatura en Educacion Infantil">Licenciatura
										en Educacion Infantil</option>
									<option value="Psicologia">Psicologia</option>
									<option
										value="Licenciatura en Bilinguismo con enfasis en la Ensenanza del Ingles">Licenciatura
										en Bilinguismo con enfasis en la Ensenanza del Ingles</option>
									<option
										value="Interprete Profesional de la Lengua de Senas Colombiana - Modalidad Virtual">Interprete
										Profesional de la Lengua de Senas Colombiana - Modalidad
										Virtual</option>
									<option value="Administracion de Empresas">Administracion
										de Empresas</option>
									<option value="Bioingenieria">Bioingenieria</option>
									<option value="Ingenieria Ambiental">Ingenieria
										Ambiental</option>
									<option value="Ingenieria Electronica">Ingenieria
										Electronica</option>
									<option value="Ingenieria Industrial">Ingenieria
										Industrial</option>
									<option value="Ingenieria de Sistemas">Ingenieria de
										Sistemas</option>
									<option value="Negocios Internacionales">Negocios
										Internacionales</option>
									<option value="Matematicas">Matematicas</option>
									<option value="Estadistica">Estadistica</option>
									<option value="Contaduria Publica - Modalidad Virtual">Contaduria
										Publica - Modalidad Virtual</option>
									<option value="Finanzas - Modalidad Virtual">Finanzas
										- Modalidad Virtual</option>
									<option
										value="Marketing y Transformacion Digital - Modalidad Virtual">Marketing
										y Transformacion Digital - Modalidad Virtual</option>
									<option value="Economia - Modalidad Virtual">Economia
										- Modalidad Virtual</option>
									<option
										value="Administracion de Negocios Sostenibles - Modalidad Virtual">Administracion
										de Negocios Sostenibles - Modalidad Virtual</option>
									<option
										value="Administracion de Produccion y Logistica Internacional - Modalidad Virtual">Administracion
										de Produccion y Logistica Internacional - Modalidad Virtual</option>
									<option value="Biologia">Biologia</option>
									<option value="Enfermeria">Enfermeria</option>
									<option value="Instrumentacion Quirurgica">Instrumentacion
										Quirurgica</option>
									<option value="Medicina">Medicina</option>
									<option value="Odontologia">Odontologia</option>
									<option value="Optometria">Optometria</option>
									<option value="Quimica Farmaceutica">Quimica
										Farmaceutica</option>


								</select>
							</div>
							<button type="submit" class="btn btn-outline-success">Listar</button>
						</form>
					</div>
				</div>
			</div>

			<!-- Formulario de todas las carreras -->
			<div class="form-register">
				<div class="card">
					<div class="card-header">
						<h3>Listar todas las carreras</h3>
					</div>
					<div class="card-body">
						<form enctype="multipart/form-data"
							name="Formulario ServeletGuardar" method="get"
							action="/UEB1/tabla">
							<input type="hidden" name="_method" value="GET">

							<button type="submit" class="btn btn-outline-success">Listar
								todas las carreras</button>
						</form>
					</div>
				</div>
			</div>
		</div>

		<div class="row form-register">
			<div class="">
				<!-- Formulario de Eliminar -->
				<div class="card">
					<div class="card-header">
						<h3>Eliminar</h3>
					</div>
					<div class="card-body">
						<form class="form" action="/UEB1/tabla" method="POST">
							<input type="hidden" name="_method" value="DELETE">
							<div class="controls">
								<label for="inputIdEliminar">Nombre completo:</label> <input
									type="text" class="form-control" id="inputNobreEliminar"
									name="inputNobreEliminar">
							</div>
							<button type="submit" class="btn btn-outline-success">Eliminar</button>
						</form>
					</div>
				</div>
			</div>

			<div class="col-md-6 form-register">
				<!-- Formulario de Actualizar -->
				<div class="card">
					<div class="card-header">
						<h3>Actualizar</h3>
					</div>
					<div class="card-body">
						<form class="form" action="/UEB1/tabla" method="post">
							<input type="hidden" name="_method" value="PUT">
							<div class="controls">
								<label for="inputIdActualizar">ID:</label> <input type="text"
									class="form-control" id="inputIdActualizar" name="id">
							</div>
							<div class="controls">
								<label for="opcactualizar">Selecciona el dato que desea
									actualizar:</label> <select id="opcactualizar" name="opcactualizar"
									required>

									<option value="nombre">Nombre completo</option>
									<option value="fecha nac">Fecha de nacimiento</option>
									<option value="colegio">Colegio donde se graduo</option>
									<option value="carrera">Carrera</option>
									<option value="estrato">Estrato</option>

								</select>

								<div id="inputs">
									<input type="text" class="controls" id="etinombre"
										placeholder="Ingrese el nombre completo"
										style="display: none;" required> <input type="date"
										class="form-control" id="etifecha" name="etifecha"
										placeholder="Ingresa tu fecha de nacimiento" required
										style="display: none;"> <input type="text"
										class="form-control" id="eticolegio" name="eticolegio"
										placeholder="Ingresa el nombre de tu colegio" required
										style="display: none;"> <input type="text" id="input4"
										style="display: none;"> <input type="text" id="input5"
										style="display: none;"> <input type="text" id="input6"
										style="display: none;">
								</div>

							</div>
							<button type="submit" class="btn btn-outline-success">Actualizar</button>
						</form>
					</div>
				</div>
			</div>
		</div>

	</div>
</body>
</html>
