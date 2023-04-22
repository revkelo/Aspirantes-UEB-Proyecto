document.addEventListener('DOMContentLoaded', function () {
  const carrera = document.getElementById('carrera');
  const costo = document.getElementById('costo');

  carrera.addEventListener('change', function () {

    if (carrera.value === 'Arquitectura') {
      costo.textContent = '$8.958.000';
    } else if (carrera.value === 'Arte Dramatico' || carrera.value === 'Artes Plasticas') {
      costo.textContent = '$7.350.000';
    } else if (carrera.value === 'Diseno Industrial' || carrera.value === 'Diseno de Comunicacion') {
      costo.textContent = '$8.958.000';
    } else if (carrera.value === 'Formacion Musical') {
      costo.textContent = '$8.336.000';
    } else if (carrera.value === 'Ciencia Politica y Gobierno') {
      costo.textContent = '$7.215.000';
    } else if (carrera.value === 'Derecho') {
      costo.textContent = '$8.125.000';
    } else if (carrera.value === 'Filosofia') {
      costo.textContent = '$3.420.000';
    } else if (carrera.value === 'Licenciatura en Educacion Infantil') {
      costo.textContent = '$3.810.000';
    } else if (carrera.value === 'Psicologia') {
      costo.textContent = '$8.622.000';
    } else if (carrera.value === 'Licenciatura en Bilinguismo con enfasis en la Ensenanza del Ingles') {
      costo.textContent = '$4.418.000';
    } else if (carrera.value === 'Interprete Profesional de la Lengua de Senas Colombiana - Modalidad Virtual') {
      costo.textContent = '$3.918.000';
    } else if (carrera.value === 'Administracion de Empresas') {
      costo.textContent = '$8.319.000';
    } else if (carrera.value === 'Bioingenieria') {
      costo.textContent = '$7.494.000';
    } else if (carrera.value === 'Ingenieria Ambiental') {
      costo.textContent = '$7.580.000';
    } else if (carrera.value === 'Ingenieria Electronica' || carrera.value === 'Ingenieria de Sistemas') {
      costo.textContent = '$6.605.000';
    } else if (carrera.value === 'Ingenieria Industrial') {
      costo.textContent = '$7.300.000';
    } else if (carrera.value === 'Negocios Internacionales') {
      costo.textContent = '$8.763.000';
    } else if (carrera.value === 'Matematicas') {
      costo.textContent = '$5.228.000';
    } else if (carrera.value === 'Estadistica') {
      costo.textContent = '$5.961.000';
    } else if (carrera.value === 'Contaduria Publica - Modalidad Virtual') {
      costo.textContent = '$2.948.000';
    } else if (carrera.value === 'Finanzas - Modalidad Virtual') {
      costo.textContent = '$8.763.000';
    } else if (carrera.value === 'Marketing y Transformacion Digital - Modalidad Virtual') {
      costo.textContent = '$3.430.000';
    } else if (carrera.value === 'Economia - Modalidad Virtual') {
      costo.textContent = '$3.430.000';
    } else if (carrera.value === 'Administracion de Negocios Sostenibles - Modalidad Virtual') {
      costo.textContent = '$8.763.000';
    } else if (carrera.value === 'Administracion de Produccion y Logistica Internacional - Modalidad Virtual') {
      costo.textContent = '$8.763.000';
    } else if (carrera.value === 'Biologia') {
      costo.textContent = '$7.448.000';
    } else if (carrera.value === 'Enfermeria') {
      costo.textContent = '$7.759.000';
    } else if (carrera.value === 'Instrumentacion Quirurgica') {
      costo.textContent = '$6.627.000';
    } else if (carrera.value === 'Medicina') {
      costo.textContent = '$27.195.000';
    }else if (carrera.value === 'Odontologia') {
      costo.textContent = '$11.788.000';
    }else if (carrera.value === 'Optometria') {
      costo.textContent = '$7.881.000';
    }else if (carrera.value === 'Quimica Farmaceutica') {
      costo.textContent = '$7.903.000';
    }else {
      costo.textContent = '';
    }
  });
});




