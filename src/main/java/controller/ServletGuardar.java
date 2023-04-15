package controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.Period;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 1, maxFileSize = 104 * 1024 * 10, maxRequestSize = 1024 * 1024 * 100)
public class ServletGuardar extends HttpServlet {

//	private ParqueDAO dao;

	public ServletGuardar() {
//		dao = new ParqueDAO();
	}

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
		PrintWriter salida = resp.getWriter();
		
		
		String nombre = req.getParameter("nombre");
		String fecha = req.getParameter("fecha");

		
	System.out.println(nombre);

	String[] partes = fecha.split("-");
	int anio = Integer.parseInt(partes[0]);
	int mes = Integer.parseInt(partes[1]);
	int dia = Integer.parseInt(partes[2]);


		
		Period periodo = Period.between(LocalDate.of(anio, mes, dia), LocalDate.now());
		String aux = String.valueOf(periodo.getYears());
		int edad = Integer.parseInt(aux);
		System.out.println(edad);
		
		
		
		
		
		
//		salida.println("<html>\r\n" + "<head>\r\n" + "<meta charset=\"UTF-8\">\r\n"
//				+ "<title>Insert title here</title>\r\n" + "</head>\r\n" + "<body>\r\n"
//				+ "<h1>Error digistaste algo mal</h1>\r\n" + "</body>\r\n" + "</html>");
//
//		Part filePart = req.getPart("foto");
//		String fileName = filePart.getSubmittedFileName();
//		String uploadPath = getServletContext().getRealPath("") + File.separator + "uploads";
//		File uploadDir = new File(uploadPath);
//		if (!uploadDir.exists()) {
//			uploadDir.mkdir();
//		}
//
//		String filePath = uploadDir + File.separator + fileName;
//		File file = new File(filePath);
//		try (InputStream input = filePart.getInputStream()) {
//			Files.copy(input, file.toPath());
//		}
//
//		System.out.println("File uploaded successfully");
//		resp.getWriter().print("El archivo " + fileName + " ha sido subido exitosamente a la siguiente ubicaci�n: "
//				+ file.getAbsolutePath());

		salida.close();

	}
	@Override
		protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter salida = resp.getWriter();
		salida.println("<html>\r\n" + "<head>\r\n" + "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Insert title here</title>\r\n" + "</head>\r\n" + "<body>\r\n"
				+ "<h1>ELIMINAR</h1>\r\n" + "</body>\r\n" + "</html>");
		salida.close();

			super.doDelete(req, resp);
		}

}
