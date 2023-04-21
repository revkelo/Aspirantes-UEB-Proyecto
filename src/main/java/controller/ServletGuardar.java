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

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import model.AspiranteDAO;
import model.AspiranteDTO;
import model.persistance.FileHandler;

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

	private FileHandler f;

	public ServletGuardar() {
		d = new AspiranteDAO();
		f = new FileHandler();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter salida = resp.getWriter();
		salida.println("<html>\r\n" + "<head>\r\n" + "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Insert title here</title>\r\n" + "</head>\r\n" + "<body>\r\n" + "\r\n" + "<table>\r\n"
				+ "  <thead>\r\n" + "    <tr>\r\n" + "      <th>ID</th>\r\n" + "      <th>Fecha de compra</th>\r\n"
				+ "      <th>Tipo de pasaporte</th>\r\n" + "      <th>Costo unitario</th>\r\n"
				+ "      <th>Cantidad de pasaportes</th>\r\n" + "      <th>Numero de atracciones</th>\r\n"
				+ "    </tr>\r\n" + "  </thead>\r\n" + "  <tbody>\r\n");

//				
//				for (int i = 0; i < dao.getList().size(); i++) {
//					salida.println("    <tr>\r\n"
//							+ "      <td>"+dao.getList().get(i).getId()+"</td>\r\n"
//							+ "      <td>"+dao.getList().get(i).getFecha_compra()+"</td>\r\n"
//							+ "      <td>"+dao.getList().get(i).getTipo_pasaporte()+"</td>\r\n"
//							+ "      <td>"+dao.getList().get(i).getCosto_unitario()+"</td>\r\n"
//							+ "      <td>"+dao.getList().get(i).getCantidad_pasaportes()+"</td>\r\n"
//							+ "      <td>"+dao.getList().get(i).getNumero_atracciones()+"</td>\r\n"
//							+ "    </tr>\r\n"
//							
//							);
//				}

		salida.println("\r\n" + "  </tbody>\r\n" + "</table>\r\n" + "\r\n" + "\r\n" + "</body>\r\n" + "</html>");

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
		String fecha = req.getParameter("fecha");
		System.out.println(fecha);
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
		System.out.println(costo);
		lista.add(new AspiranteDTO(nombre, fecha, edad + "", colegio, carrera, estrato, homologado, costo + ""));
//		writeFile(lista);

		System.out.println(nombre);
		System.out.println(fecha);
		System.out.println(edad);
		System.out.println(colegio);
		System.out.println(carrera);
		System.out.println(estrato);
		System.out.println(homologado);
		System.out.println(costo);

		Part filePart = req.getPart("foto");
		String fileName = filePart.getSubmittedFileName();
		String uploadPath = getServletContext().getRealPath("") + File.separator + "uploads";
		File uploadDir = new File(uploadPath);
		if (!uploadDir.exists()) {
			uploadDir.mkdir();
		}

		int i = 1;
		String file_path = uploadDir + File.separator + i + ".jpg";
		File file = new File(file_path);
		while (file.exists()) {
			i++;
			file_path = uploadDir + File.separator + i + ".jpg";
			file = new File(file_path);

		}

		try (InputStream input = filePart.getInputStream()) {
			Files.copy(input, file.toPath());
			System.out.println("File uploaded successfully. The file " + fileName
					+ " has been uploaded to the following location: " + file.getAbsolutePath());
			System.out.println(uploadPath + "\n" + file_path + "\n" + file.getAbsolutePath());
		} catch (Exception e) {
			// TODO: handle exception
		}

		String csvfilepath = "Aspirantes.csv";

		File archivoCSV = new File(csvfilepath);

		if (!archivoCSV.exists()) {
			try {
				archivoCSV.createNewFile();
				System.out.println("Archivo creado exitosamente.");
			} catch (IOException e) {
				System.out.println("Error al crear archivo.");
				e.printStackTrace();
			}
		} else {
			System.out.println("El archivo ya existe.");
		}

		f.escribirCSV(lista, file_path, archivoCSV.getAbsolutePath());

		out.println("<html><body onload=\"showLoginError()\">  <h1>Guardado</h1> </body></html>");
		resp.setHeader("Refresh", "0.5; URL=index.jsp");

		req.getSession().setAttribute("lista", lista);

		out.close();

		System.out.println(lista.size() + "  El tamano del la lista ");
		System.out.println(lista.toString());

	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter salida = resp.getWriter();
		salida.println(
				"<html>\r\n" + "<head>\r\n" + "<meta charset=\"UTF-8\">\r\n" + "<title>Insert title here</title>\r\n"
						+ "</head>\r\n" + "<body>\r\n" + "<h1>ELIMINAR</h1>\r\n" + "</body>\r\n" + "</html>");
		salida.close();

		super.doDelete(req, resp);
	}

	public String contentBase(ArrayList<AspiranteDTO> list) {
		String res = "";
		for (AspiranteDTO s : list) {
			res += s.toString();
		}
		return res;
	}

	public void convertidor(ArrayList<AspiranteDTO> lista, String aux) {

		String userHomeFolder = System.getProperty("user.home");
		String csvFilePath = userHomeFolder + "/Desktop/Aspirantes.csv";

		try {
			PrintWriter writer = new PrintWriter(new FileWriter(csvFilePath, true));
			writer.println(d.listar(lista) + ";" + aux + "\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
