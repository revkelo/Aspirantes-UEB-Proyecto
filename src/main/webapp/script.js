 document.addEventListener('DOMContentLoaded', function() {
	const carrera = document.getElementById('carrera');
	const costo = document.getElementById('costo');

	carrera.addEventListener('change', function() {

		if (carrera.value === 'Arquitectura') {
			costo.textContent = '$8.958.000';
		} else if (carrera.value === 'Arte Dramático' || carrera.value === 'Artes Plásticas') {
			costo.textContent = '$7.350.000';
		} else if (carrera.value === 'Diseño Industrial' || carrera.value === 'Diseño de Comunicación') {
			costo.textContent = '$8.958.000';
		} else if (carrera.value === 'Formación Musical') {
			costo.textContent = '$8.336.000';
		} else if (carrera.value === 'Ciencia Política y Gobierno') {
			costo.textContent = '$7.215.000';
		} else if (carrera.value === 'Derecho') {
			costo.textContent = '$8.125.000';
		} else if (carrera.value === 'Filosofía') {
			costo.textContent = '$3.420.000';
		} else if (carrera.value === 'Licenciatura en Educación Infantil') {
			costo.textContent = '$3.810.000';
		} else if (carrera.value === 'Psicología') {
			costo.textContent = '$8.622.000';
		} else if (carrera.value === 'Licenciatura en Bilingüismo con Énfasis en la Enseñanza del Inglés') {
			costo.textContent = '$4.418.000';
		} else if (carrera.value === 'Intérprete Profesional de la Lengua de Señas Colombiana - Modalidad Virtual') {
			costo.textContent = '$3.918.000';
		} else if (carrera.value === 'Administración de Empresas') {
			costo.textContent = '$8.319.000';
		} else if (carrera.value === 'Bioingeniería') {
			costo.textContent = '$7.494.000';
		} else if (carrera.value === 'Ingeniería Ambiental') {
			costo.textContent = '$7.580.000';
		} else if (carrera.value === 'Ingeniería Electrónica' || carrera.value === 'Ingeniería de Sistemas') {
			costo.textContent = '$6.605.000';
		} else if (carrera.value === 'Ingeniería Industrial') {
			costo.textContent = '$7.300.000';
		} else if (carrera.value === 'Negocios Internacionales') {
			costo.textContent = '$8.763.000';
		} else if (carrera.value === 'Matemáticas') {
			costo.textContent = '$5.228.000';
		} else if (carrera.value === 'Estadística') {
			costo.textContent = '$5.961.000';
		} else if (carrera.value === 'Contaduría Pública - Modalidad Virtual') {
			costo.textContent = '$2.948.000';
		} else if (carrera.value === 'Finanzas - Modalidad Virtual') {
			costo.textContent = '$8.763.000';
		} else if (carrera.value === 'Marketing y Transformación Digital - Modalidad Virtual') {
			costo.textContent = '$3.430.000';
		} else if (carrera.value === 'Economía - Modalidad Virtual') {
			costo.textContent = '$3.430.000';
		} else if (carrera.value === 'Administración de Negocios Sostenibles - Modalidad Virtual') {
			costo.textContent = '$8.763.000';
		} else if (carrera.value === 'Administración de Producción y Logística Internacional - Modalidad Virtual') {
			costo.textContent = '$8.763.000';
		} else if (carrera.value === 'Biología') {
			costo.textContent = '$7.448.000';
		} else if (carrera.value === 'Enfermería') {
			costo.textContent = '$7.759.000';
		} else if (carrera.value === 'Instrumentación Quirúrgica') {
			costo.textContent = '$6.627.000';
		} else if (carrera.value === 'Medicina') {
			costo.textContent = '$27.195.000';
		} else if (carrera.value === 'Odontología') {
			costo.textContent = '$11.788.000';
		} else if (carrera.value === 'Optometría') {
			costo.textContent = '$7.881.000';
		} else if (carrera.value === 'Química Farmacéutica') {
			costo.textContent = '$7.903.000';
		} else {
			costo.textContent = '';
		}
	});

	function ocultar() {
		var aux = document.getElementById('opcactualizar');
		aux.style.display = 'none';
	}

	function mostrarInput() {
		var opcactualizar = document.getElementById('opcactualizar');
		var seleccion = opcactualizar.value;
		var inputs = document.getElementById('inputs').getElementsByTagName('input');
		for (var i = 0; i < inputs.length; i++) {
			inputs[i].style.display = 'none';
		}
		var input = document.getElementById('input' + seleccion.substring(seleccion.length - 1));
		input.style.display = 'block';
	}

	const opcactualizar = document.getElementById('opcactualizar');

	if (opcactualizar.value === 'Nombre completo') {
		mostrarInput(etinombre);
	} else if (opcactualizar.value === 'Fecha de nacimiento') {
		mostrarInput(etifecha);
	} else {
		ocultar();
	}
});

