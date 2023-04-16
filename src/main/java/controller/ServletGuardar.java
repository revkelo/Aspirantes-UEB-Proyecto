package controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import Model.AspiranteDAO;
import Model.AspiranteDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 1, maxFileSize = 104 * 1024 * 10, maxRequestSize = 1024 * 1024 * 100)
public class ServletGuardar extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter salida = resp.getWriter();
		salida.println("<html>\r\n" + "<head>\r\n" + "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Insert title here</title>\r\n" + "</head>\r\n" + "<body>\r\n" + "\r\n" + "<table>\r\n"
				+ "  <thead>\r\n" + "    <tr>\r\n" + "      <th>ID</th>\r\n" + "      <th>Fecha de compra</th>\r\n"
				+ "      <th>Tipo de pasaporte</th>\r\n" + "      <th>Costo unitario</th>\r\n"
				+ "      <th>Cantidad de pasaportes</th>\r\n" + "      <th>Número de atracciones</th>\r\n"
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
		ArrayList<AspiranteDTO> kevin;
		if (req.getSession().getAttribute("kevin") == null) {
			kevin = new ArrayList<>();
		} else {
			kevin = (ArrayList) req.getSession().getAttribute("kevin");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String nombre = req.getParameter("nombre");
		String fecha = req.getParameter("fecha");
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
		} else if (carrera.equals("Dise�o Industrial") || carrera.equals("Diseno de Comunicación")) {
			costo = "$8.958.000";
		} else if (carrera.equals("Formación Musical")) {
			costo = "$8.336.000";
		} else if (carrera.equals("Ciencia Política y Gobierno")) {
			costo = "$7.215.000";
		} else if (carrera.equals("Derecho")) {
			costo = "$8.125.000";
		} else if (carrera.equals("Filosofía")) {
			costo = "$3.420.000";
		} else if (carrera.equals("Licenciatura en Educación Infantil")) {
			costo = "$3.810.000";
		} else if (carrera.equals("Psicología")) {
			costo = "$8.622.000";
		} else if (carrera.equals("Licenciatura en Bilingüismo con Énfasis en la Enseñanza del Inglés")) {
			costo = "$4.418.000";
		} else if (carrera.equals("Intérprete Profesional de la Lengua de Señas Colombiana - Modalidad Virtual")) {
			costo = "$3.918.000";
		} else if (carrera.equals("Administración de Empresas")) {
			costo = "$8.319.000";
		} else if (carrera.equals("Bioingeniería")) {
			costo = "$7.494.000";
		} else if (carrera.equals("Ingeniería Ambiental")) {
			costo = "$7.580.000";
		} else if (carrera.equals("Ingeniería Electrónica") || carrera.equals("Ingeniería de Sistemas")) {
			costo = "$6.605.000";
		} else if (carrera.equals("Ingeniería Industrial")) {
			costo = "$7.300.000";
		} else if (carrera.equals("Negocios Internacionales")) {
			costo = "$8.763.000";
		} else if (carrera.equals("Matemáticas")) {
			costo = "$5.228.000";
		} else if (carrera.equals("Estadística")) {
			costo = "$5.961.000";
		} else if (carrera.equals("Contaduría Pública - Modalidad Virtual")) {
			costo = "$2.948.000";
		} else if (carrera.equals("Finanzas - Modalidad Virtual")) {
			costo = "$8.763.000";
		} else if (carrera.equals("Marketing y Transformación Digital - Modalidad Virtual")) {
			costo = "$3.430.000";
		} else if (carrera.equals("Economía - Modalidad Virtual")) {
			costo = "$3.430.000";
		} else if (carrera.equals("Administración de Negocios Sostenibles - Modalidad Virtual")) {
			costo = "$8.763.000";
		} else if (carrera.equals("Administración de Producción y Logística Internacional - Modalidad Virtual")) {
			costo = "$8.763.000";
		} else if (carrera.equals("Biología")) {
			costo = "$7.448.000";
		} else if (carrera.equals("Enfermería")) {
			costo = "$7.759.000";
		} else if (carrera.equals("Instrumentación Quirúrgica")) {
			costo = "$6.627.000";
		} else if (carrera.equals("Medicina")) {
			costo = "$27.195.000";
		} else if (carrera.equals("Odontología")) {
			costo = "$11.788.000";
		} else if (carrera.equals("Optometría")) {
			costo = "$7.881.000";
		} else if (carrera.equals("Química Farmacéutica")) {
			costo = "$7.903.000";
		} else {
			costo = "";
		}

		kevin.add(new AspiranteDTO(nombre, fecha, edad + "", colegio, carrera, estrato, homologado, costo));

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

		String filePath = uploadDir + File.separator + fileName;
		File file = new File(filePath);
		try (InputStream input = filePart.getInputStream()) {
			Files.copy(input, file.toPath());
		}

		System.out.println("File uploaded successfully" + "El archivo " + fileName
				+ " ha sido subido exitosamente a la siguiente ubicaci�n: " + file.getAbsolutePath());

		out.println("<html><body onload=\"showLoginError()\">  <h1>Guardado</h1> </body></html>");
		resp.setHeader("Refresh", "0.5; URL=index.jsp");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		req.getSession().setAttribute("kevin",kevin);
		
		req.getRequestDispatcher("admin.jsp").forward(req, resp);
		
		
		
		
		
		
		
		
		
		
		
		out.close();

		System.out.println(kevin.size() + "  El tamaño del la lista ");
		System.out.println(kevin.toString());

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

}
