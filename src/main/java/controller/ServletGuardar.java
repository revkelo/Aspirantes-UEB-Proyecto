package controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import model.AspiranteDAO;
import model.AspiranteDTO;
import model.persistance.FileHandler;
import view.Console;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.io.ByteArrayOutputStream;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 1, maxFileSize = 104 * 1024 * 10, maxRequestSize = 1024 * 1024 * 100)
public class ServletGuardar extends HttpServlet {

	private AspiranteDAO d;
	private Console con;
	private FileHandler f;

	public ServletGuardar() {
		d = new AspiranteDAO();
		f = new FileHandler();
		con = new Console();

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter salida = resp.getWriter();

		salida.close();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		try {

		} catch (Exception e) {
			// TODO: handle exception
		}
		ArrayList<AspiranteDTO> lista;
		if (req.getSession().getAttribute("lista") == null) {
			lista = new ArrayList<>();
		} else {
			lista = (ArrayList) req.getSession().getAttribute("lista");
		}

		String nombre = req.getParameter("nombre");
		nombre.toLowerCase();
		String fecha = req.getParameter("fecha");
		con.mostrar(fecha);
		String colegio = req.getParameter("colegio");
		String carrera = req.getParameter("carrera");
		String estrato = req.getParameter("estrato");
		String homologado = req.getParameter("homologado");

		String[] partes = fecha.split("-");
		int anio = Integer.parseInt(partes[0]);
		int mes = Integer.parseInt(partes[1]);
		int dia = Integer.parseInt(partes[2]);

		Period periodo = Period.between(LocalDate.of(anio, mes, dia), LocalDate.now());
		String aux = String.valueOf(periodo.getYears());
		int edad = Integer.parseInt(aux);
		String costo;

		if (carrera.equals("Arquitectura")) {
			costo = "$8.958.000";
		} else if (carrera.equals("Arte Dramatico") || carrera.equals("Artes Plasticas")) {
			costo = "$7.350.000";
		} else if (carrera.equals("Dise�o Industrial") || carrera.equals("Diseno de Comunicacion")) {
			costo = "$8.958.000";
		} else if (carrera.equals("Formacion Musical")) {
			costo = "$8.336.000";
		} else if (carrera.equals("Ciencia Politica y Gobierno")) {
			costo = "$7.215.000";
		} else if (carrera.equals("Derecho")) {
			costo = "$8.125.000";
		} else if (carrera.equals("Filosofia")) {
			costo = "$3.420.000";
		} else if (carrera.equals("Licenciatura en Educacion Infantil")) {
			costo = "$3.810.000";
		} else if (carrera.equals("Psicologia")) {
			costo = "$8.622.000";
		} else if (carrera.equals("Licenciatura en Bilinguismo con enfasis en la Ensenanza del Ingles")) {
			costo = "$4.418.000";
		} else if (carrera.equals("Interprete Profesional de la Lengua de Senas Colombiana - Modalidad Virtual")) {
			costo = "$3.918.000";
		} else if (carrera.equals("Administracion de Empresas")) {
			costo = "$8.319.000";
		} else if (carrera.equals("Bioingenieria")) {
			costo = "$7.494.000";
		} else if (carrera.equals("Ingenieria Ambiental")) {
			costo = "$7.580.000";
		} else if (carrera.equals("Ingenieria Electronica") || carrera.equals("Ingenieria de Sistemas")) {
			costo = "$6.605.000";
		} else if (carrera.equals("Ingenieria Industrial")) {
			costo = "$7.300.000";
		} else if (carrera.equals("Negocios Internacionales")) {
			costo = "$8.763.000";
		} else if (carrera.equals("Matematicas")) {
			costo = "$5.228.000";
		} else if (carrera.equals("Estadistica")) {
			costo = "$5.961.000";
		} else if (carrera.equals("Contaduria Publica - Modalidad Virtual")) {
			costo = "$2.948.000";
		} else if (carrera.equals("Finanzas - Modalidad Virtual")) {
			costo = "$8.763.000";
		} else if (carrera.equals("Marketing y Transformacion Digital - Modalidad Virtual")) {
			costo = "$3.430.000";
		} else if (carrera.equals("Economia - Modalidad Virtual")) {
			costo = "$3.430.000";
		} else if (carrera.equals("Administracion de Negocios Sostenibles - Modalidad Virtual")) {
			costo = "$8.763.000";
		} else if (carrera.equals("Administracion de Produccion y Logistica Internacional - Modalidad Virtual")) {
			costo = "$8.763.000";
		} else if (carrera.equals("Biologia")) {
			costo = "$7.448.000";
		} else if (carrera.equals("Enfermeria")) {
			costo = "$7.759.000";
		} else if (carrera.equals("Instrumentacion Quirurgica")) {
			costo = "$6.627.000";
		} else if (carrera.equals("Medicina")) {
			costo = "$27.195.000";
		} else if (carrera.equals("Odontologia")) {
			costo = "$11.788.000";
		} else if (carrera.equals("Optometria")) {
			costo = "$7.881.000";
		} else if (carrera.equals("Quimica Farmaceutica")) {
			costo = "$7.903.000";
		} else {
			costo = "";
		}
		con.mostrar(costo);

		con.mostrar(nombre);
		con.mostrar(fecha);
		con.mostrar(edad+"");

		if (edad >= 14 && edad <= 200) {

			con.mostrar(colegio);
			con.mostrar(carrera);
			con.mostrar(estrato);
			con.mostrar(homologado);
			con.mostrar(costo);

			Part filePart = req.getPart("foto");
			String fileName = filePart.getSubmittedFileName();

			con.mostrar("fileName: " + fileName);
			String uploadPath = getServletContext().getRealPath("") + File.separator + "uploads";
			File uploadDir = new File(uploadPath);
			if (!uploadDir.exists()) {
				uploadDir.mkdir();
			}

			int i = 0;
			String filePath = uploadDir + File.separator + i + ".jpg";
			File file = new File(filePath);
			while (file.exists()) {
				i++;
				filePath = uploadDir + File.separator + i + ".jpg";
				file = new File(filePath);

			}
			con.mostrar(file.getAbsolutePath());

			try (InputStream input = filePart.getInputStream()) {
				Files.copy(input, file.toPath());

			} catch (Exception e) {
				// TODO: handle exception
			}

			lista.add(new AspiranteDTO(nombre, fecha, edad + "", colegio, carrera, estrato, homologado, costo + "",
					file.getAbsolutePath()));
			String csvfilepath = "Aspirantes.csv";

			File archivoCSV = new File(csvfilepath);

			if (!archivoCSV.exists()) {
				try {
					archivoCSV.createNewFile();
					con.mostrar("Archivo creado exitosamente.");
				} catch (IOException e) {
					con.mostrar("Error al crear archivo.");
					e.printStackTrace();
				}
			} else {
				con.mostrar("El archivo ya existe.");
			}

			for (int j = 0; j < lista.size(); j++) {
				con.mostrar(lista.get(j).getNombre());
			}

			f.escribirCSV(lista, archivoCSV.getAbsolutePath(), lista.size());

			out.println("<html><body onload=\"showLoginError()\">  <h1>Guardado</h1> </body></html>");
			resp.setHeader("Refresh", "0.5; URL=index.jsp");

			req.getSession().setAttribute("lista", lista);

			out.close();

			con.mostrar(lista.size() + "  El tamano del la lista ");
			con.mostrar(lista.toString());

		} else {
			out.println("<html><body onload=\"showLoginError()\">  <h1>ERROR FECHA DE NACIMIENTO</h1> </body></html>");
			resp.setHeader("Refresh", "1; URL=index.jsp");
			out.close();

		}
	}

}
