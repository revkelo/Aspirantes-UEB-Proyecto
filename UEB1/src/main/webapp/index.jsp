<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<title>Formulario de Registro - Mi sitio web</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Carga la biblioteca de Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	  <script src="script.js"></script>
	
</head>

<body>
	<div class="container">
		<div class="row justify-content-end">
			<div class="col-4 text-right">
				<form action="login.jsp" method="post">
					<input type="submit" class="btn btn-primary" value="Administrador">

				</form>
			</div>
		</div>
	</div>
	<div class="container">
		<h2>Formulario de Registro</h2>
		<form>
			<div class="form-group">
				<label for="nombre">Nombre completo:</label> <input type="text"
					class="form-control" id="nombre"
					placeholder="Ingresa tu nombre completo">
			</div>
			<div class="form-group">
				<label for="fecha">Fecha de nacimiento:</label> <input type="date"
					class="form-control" id="fecha"
					placeholder="Ingresa tu fecha de nacimiento">
			</div>
			<div class="form-group">
				<label for="colegio">Colegio donde se graduó:</label> <input
					type="text" class="form-control" id="colegio"
					placeholder="Ingresa el nombre de tu colegio">
			</div>
			<div class="form-group">



				<label for="carrera">Selecciona tu carrera:</label> <select
					id="carrera">
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
					id="estrato">
					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
					<option>6</option>
				</select>
			</div>
			<div class="form-group">
				<label for="homologado">Homologado:</label>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="homologado"
						id="homologadoSi" value="si"> <label
						class="form-check-label" for="homologadoSi"> Sí </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="homologado"
						id="homologadoNo" value="no"> <label
						class="form-check-label" for="homologadoNo"> No </label>
				</div>
			</div>
			<div class="form-group">
				<label for="foto">Subir foto:</label> <input type="file"
					class="form-control-file" id="foto">
			</div>
			<button type="submit" class="btn btn-primary">Enviar</button>
		</form>
	</div>
	<!-- Carga la biblioteca de jQuery -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<!-- Carga la biblioteca de Popper.js -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<!-- Carga la biblioteca de Bootstrap -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

	<table>
		<tr>
			<td><strong>Curso</strong></td>
			<td><strong>Horas</strong></td>
			<td><strong>Horario</strong></td>
		</tr>

		<tr>
			<td>CSS</td>
			<td>20</td>
			<td>16:00 - 20:00</td>
		</tr>
</body>

</html>