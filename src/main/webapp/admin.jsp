<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Formularios con Bootstrap</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>

</head>
<body>
	<div class="container text-center">
		<h1>Administrativo</h1>
	  </div>

  <div class="container">
    <div class="row">
      <!-- Formulario de Medicina -->
      <div class="col">
        <div class="card">
          <div class="card-header">
            <h3>Listar por carrera</h3>
          </div>
          <div class="card-body">
            <form>
              <div class="form-group">
                <label for="selectCarrera">Carrera:</label>
                <select class="form-control" id="selectCarrera" name="carrera">
              
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
              </div>
              <button type="submit" class="btn btn-primary">Listar</button>
            </form>
          </div>
        </div>
      </div>

      <!-- Formulario de todas las carreras -->
      <div class="col">
        <div class="card">
          <div class="card-header">
            <h3>Listar todas las carreras</h3>
          </div>
          <div class="card-body">
            <form>
              <button type="submit" class="btn btn-primary">Listar todas las carreras</button>
            </form>
          </div>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="col-md-6">
        <!-- Formulario de Eliminar -->
        <div class="card">
          <div class="card-header">
            <h3>Eliminar</h3>
          </div>
          <div class="card-body">
           <form class="form" action="/UEB1/tabla" method="post">
					<input type="hidden" name="_method" value="DELETE">
              <div class="form-group">
                <label for="inputIdEliminar">ID:</label>
                <input type="text" class="form-control" id="inputIdEliminar" name="id">
              </div>
              <button type="submit" class="btn btn-danger">Eliminar</button>
            </form>
          </div>
        </div>
      </div>

      <div class="col-md-6">
        <!-- Formulario de Actualizar -->
        <div class="card">
          <div class="card-header">
            <h3>Actualizar</h3>
          </div>
          <div class="card-body">
           <form class="form" action="/UEB1/tabla" method="post">
					<input type="hidden" name="_method" value="PUT">
              <div class="form-group">
                <label for="inputIdActualizar">ID:</label>
                <input type="text" class="form-control" id="inputIdActualizar" name="id">
              </div>
              <div class="form-group">
                <label for="inputNombreActualizar">Nombre:</label>
                <input type="text" class="form-control" id="inputNombreActualizar" name="nombre">
              </div>
              <button type="submit" class="btn btn-primary">Actualizar</button>
            </form>
          </div>
        </div>
      </div>
    </div>

  </div>
</body>
</html>
