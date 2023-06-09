<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>
<title>Formulario de Registro</title>
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

<script src="./js/script.js"></script>

<link rel="stylesheet" href="./css/style.css">

</head>

<body>


	<div class="container">

		<section class="form-register">

			<div class="row justify-content-center">
				<div class="col-3">
					<form action="login.jsp" method="POST">
						<input type="submit" class="btn btn-outline-success"
							value="Administrador">

					</form>
				</div>
			</div>
		</section>
	</div>

	<section class="form-register">

		<div class="container">

			<h1>Formulario de Registro</h1>

			<form enctype="multipart/form-data" name="Formulario ServeletGuardar"
				method="POST" action="http://localhost:8080/UEB1/guardado">

				<div class="controls">
					<label for="nombre">Nombre completo:</label> <input type="text"
						class="controls" id="nombre" name="nombre"
						placeholder="Ingresa tu nombre completo" required>
				</div>

				<div class="controls">
					<label for="fecha">Fecha de nacimiento:</label> <input type="date"
						class="controls" id="fecha" name="fecha"
						placeholder="Ingresa tu fecha de nacimiento" required>
				</div>

				<div class="controls">
					<label for="colegio">Colegio donde se graduó:</label> <input
						type="text" class="controls" id="colegio" name="colegio"
						placeholder="Ingresa el nombre de tu colegio" required>
				</div>

				<div class="controls">
					<label for="carrera">Selecciona tu carrera:</label> <select
						class="controls" id="carrera" name="carrera" required>

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
							Profesional de la Lengua de Senas Colombiana - Modalidad Virtual</option>
						<option value="Administracion de Empresas">Administracion
							de Empresas</option>
						<option value="Bioingenieria">Bioingenieria</option>
						<option value="Ingenieria Ambiental">Ingenieria Ambiental</option>
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
						<option value="Finanzas - Modalidad Virtual">Finanzas -
							Modalidad Virtual</option>
						<option
							value="Marketing y Transformacion Digital - Modalidad Virtual">Marketing
							y Transformacion Digital - Modalidad Virtual</option>
						<option value="Economia - Modalidad Virtual">Economia -
							Modalidad Virtual</option>
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
						<option value="Quimica Farmaceutica">Quimica Farmaceutica</option>

					</select>
					<p>
						El costo de su carrera es: <span id="costo"></span>
					</p>

				</div>

				<div class="controls">

					<label for="estrato">Estrato:</label> <select class="controls"
						id="estrato" name="estrato" required>
						<option value="">Seleccione su estrato</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
					</select>
				</div>
				<div class="controls">
					<label for="homologado">Homologado:</label>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="homologado"
							id="homologadoSi" value="si" required> <label
							class="form-check-label" for="homologadoSi"> Si </label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="homologado"
							id="homologadoNo" value="no" required> <label
							class="form-check-label" for="homologadoNo"> No </label>
					</div>
				</div>

				<div class="controls">
					<label for="foto">Subir foto:</label> <input type="file"
						class="form-control-file" accept=".jpg" name="foto" id="foto"
						accept="image/png,image/jpeg,image/bmp,image/gif,image/jpg,image/tif,image/tiff"
						required>



				</div>

				<div class="row justify-content-center">
					<button type="submit" class="btn btn-outline-success">Enviar</button>
				</div>

			</form>



		</div>

	</section>
<footer class="bg-dark text-white">
   <div class="container text-center">
      <div class="row">
         <div class="col-md-6">
            <p class="m-0">&copy; 2023 Universidad El Bosque. Todos los derechos reservados.</p>
         </div>
         <div class="col-md-6">
            <a href="https://www.unbosque.edu.co/" target="_blank" class="text-white float-md-end">Universidad El Bosque</a>
         </div>
      </div>
   </div>
</footer>
</body>

</html>