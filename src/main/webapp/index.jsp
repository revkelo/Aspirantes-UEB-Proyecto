<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>
<title>Formulario de Registro - Mi sitio web</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Carga la biblioteca de Bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
	crossorigin="anonymous"></script>

<script src="script.js"></script>

<link rel="stylesheet" href="style.css">

</head>

<body>

	<section class="form-register">

		<div class="container">

			<h2>Formulario de Registro</h2>

			<form enctype="multipart/form-data" name="Formulario ServeletGuardar"
				method="POST" action="http://localhost:8080/UEB1/guardado">

				<div class="form-group">
					<label for="nombre">Nombre completo:</label> <input type="text"
						class="form-control" id="nombre" name="nombre"
						placeholder="Ingresa tu nombre completo" required>
				</div>

				<div class="form-group">
					<label for="fecha">Fecha de nacimiento:</label> <input type="date"
						class="controls" id="fecha" name="fecha"
						placeholder="Ingresa tu fecha de nacimiento" required>
				</div>

				<div class="form-group">
					<label for="colegio">Colegio donde se graduó:</label> <input
						type="text" class="form-control" id="colegio" name="colegio"
						placeholder="Ingresa el nombre de tu colegio" required>
				</div>

				<div class="form-group">
					<label for="carrera">Selecciona tu carrera:</label> <select
						id="carrera" name="carrera" required>

						<option value="">Selecciona una carrera</option>
						<option value="Arquitectura">Arquitectura</option>
						<option value="Arte Dramático">Arte Dramático</option>
						<option value="Artes Plásticas">Artes Plásticas</option>
						<option value="Diseño Industrial">Diseño Industrial</option>
						<option value="Diseño de Comunicación">Diseño de
							Comunicación</option>
						<option value="Formación Musical">Formación Musical</option>
						<option value="Ciencia Política y Gobierno">Ciencia
							Política y Gobierno</option>
						<option value="Derecho">Derecho</option>
						<option value="Filosofía">Filosofía</option>
						<option value="Licenciatura en Educación Infantil">Licenciatura
							en Educación Infantil</option>
						<option value="Psicología">Psicología</option>
						<option
							value="Licenciatura en Bilingüismo con Énfasis en la Enseñanza del Inglés">Licenciatura
							en Bilingüismo con Énfasis en la Enseñanza del Inglés</option>
						<option
							value="Intérprete Profesional de la Lengua de Señas Colombiana - Modalidad Virtual">Intérprete
							Profesional de la Lengua de Señas Colombiana - Modalidad Virtual</option>
						<option value="Administración de Empresas">Administración
							de Empresas</option>
						<option value="Bioingeniería">Bioingeniería</option>
						<option value="Ingeniería Ambiental">Ingeniería Ambiental</option>
						<option value="Ingeniería Electrónica">Ingeniería
							Electrónica</option>
						<option value="Ingeniería Industrial">Ingeniería
							Industrial</option>
						<option value="Ingeniería de Sistemas">Ingeniería de
							Sistemas</option>
						<option value="Negocios Internacionales">Negocios
							Internacionales</option>
						<option value="Matemáticas">Matemáticas</option>
						<option value="Estadística">Estadística</option>
						<option value="Contaduría Pública - Modalidad Virtual">Contaduría
							Pública - Modalidad Virtual</option>
						<option value="Finanzas - Modalidad Virtual">Finanzas -
							Modalidad Virtual</option>
						<option
							value="Marketing y Transformación Digital - Modalidad Virtual">Marketing
							y Transformación Digital - Modalidad Virtual</option>
						<option value="Economía - Modalidad Virtual">Economía -
							Modalidad Virtual</option>
						<option
							value="Administración de Negocios Sostenibles - Modalidad Virtual">Administración
							de Negocios Sostenibles - Modalidad Virtual</option>
						<option
							value="Administración de Producción y Logística Internacional - Modalidad Virtual">Administración
							de Producción y Logística Internacional - Modalidad Virtual</option>
						<option value="Biología">Biología</option>
						<option value="Enfermería">Enfermería</option>
						<option value="Instrumentación Quirúrgica">Instrumentación
							Quirúrgica</option>
						<option value="Medicina">Medicina</option>
						<option value="Odontología">Odontología</option>
						<option value="Optometría">Optometría</option>
						<option value="Química Farmacéutica">Química Farmacéutica</option>

					</select>
					<p>
						El costo de tu carrera es: <span id="costo"></span>
					</p>

				</div>

				<div class="form-group">

					<label for="estrato">Estrato:</label> <select class="form-control"
						id="estrato" name="estrato" required>
						<option value="">Selecciona una carrera</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
					</select>
				</div>
				<div class="form-group">
					<label for="homologado">Homologado:</label>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="homologado"
							id="homologadoSi" value="si" required> <label
							class="form-check-label" for="homologadoSi"> Sí </label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="homologado"
							id="homologadoNo" value="no" required> <label
							class="form-check-label" for="homologadoNo"> No </label>
					</div>
				</div>

				<div class="form-group">
					<label for="foto">Subir foto:</label> <input type="file"
						class="form-control-file" accept=".jpg" name="foto" id="foto"
						accept="image/png,image/jpeg,image/bmp,image/gif,image/jpg,image/tif,image/tiff"
						required>
				</div>

				<div class="container">
					<button type="submit" class="btn btn-primary">Enviar</button>
				</div>

			</form>
		</div>

	</section>

	<div class="container">

		<div class="row justify-content-center">
			<div class="col-4">
				<form action="login.jsp" method="POST">
					<input type="submit" class="btn btn-primary" value="Administrador">

				</form>
			</div>
		</div>

	</div>

</body>

</html>