package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import Model.AspiranteDAO;
import Model.AspiranteDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletTabla extends HttpServlet {

	private AspiranteDAO dao;

	public ServletTabla() {
		dao = new AspiranteDAO();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if ("DELETE".equals(request.getParameter("_method"))) {
			// Manejar la solicitud DELETE
			doDelete(request, response);
		} else if ("PUT".equals(request.getParameter("_method"))) {
			// Manejar la solicitud PUT
			doPut(request, response);
		} else {
			// Manejar la solicitud POST
			doPost(request, response);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();
		PrintWriter salida = resp.getWriter();
		
		
		salida.println("<!DOCTYPE html>\r\n" + "<html>\r\n" + "\r\n" + "<head>\r\n" + "<meta charset=\"UTF-8\" />\r\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n"
				+ "<title>Formularios con Bootstrap</title>\r\n" + "<!-- Agrega los estilos de Bootstrap -->\r\n"
				+ "<link rel=\"stylesheet\"\r\n"
				+ "	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n"
				+ "	integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\r\n"
				+ "	crossorigin=\"anonymous\" />\r\n" + "</head>\r\n" + "\r\n" + "<body>\r\n"
				+ "	<h1 class=\"display-4\">Administrativo</h1>\r\n" + "	<div class=\"p-2 g-col-6\"></div>\r\n"
				+ "	<div class=\"p-2 g-col-6\"></div>\r\n" + "	<div class=\"p-2 g-col-6\"></div>\r\n"
				+ "	<div class=\"p-2 g-col-6\"></div>\r\n" + "\r\n" + "	<div class=\"container\">\r\n"
				+ "		<div class=\"row\">\r\n" + "			<!-- Primer formulario -->\r\n" + "\r\n"
				+ "			<div class=\"col\">\r\n"
				+ "				<form class=\"form\" action=\"/UEB1/tabla\" method=\"post\">\r\n"
				+ "					<input type=\"hidden\" name=\"_method\" value=\"DELETE\">\r\n"
				+ "					<div class=\"form-group\">\r\n"
				+ "						<label for=\"nombre1\">Nombre</label> <input type=\"text\"\r\n"
				+ "							class=\"form-control\" id=\"nombre1\"\r\n"
				+ "							placeholder=\"Introduce tu nombre\" />\r\n" + "					</div>\r\n"
				+ "					<button type=\"submit\" class=\"btn btn-danger\">Eliminar</button>\r\n"
				+ "				</form>\r\n" + "			</div>\r\n" + "\r\n"
				+ "			<!-- Segundo formulario -->\r\n" + "			<div class=\"col\">\r\n"
				+ "				<form class=\"form\" action=\"/UEB1/tabla\" method=\"post\">\r\n"
				+ "					<input type=\"hidden\" name=\"_method\" value=\"PUT\">\r\n" + "\r\n"
				+ "					<div class=\"form-group\">\r\n"
				+ "						<label for=\"nombre2\">Nombre</label> <input type=\"text\"\r\n"
				+ "							class=\"form-control\" id=\"nombre2\"\r\n"
				+ "							placeholder=\"Introduce tu nombre\" />\r\n" + "					</div>\r\n"
				+ "					<div class=\"form-group\">\r\n"
				+ "						<label for=\"edad\">Edad</label> <input type=\"number\"\r\n"
				+ "							class=\"form-control\" id=\"edad\" placeholder=\"Introduce tu edad\" />\r\n"
				+ "					</div>\r\n"
				+ "					<button type=\"submit\" class=\"btn btn-primary\">Actualizar</button>\r\n"
				+ "				</form>\r\n" + "			</div>\r\n" + "		</div>\r\n" + "	</div>\r\n" + "\r\n"
				+ "\r\n" + "	<div class=\"p-2 g-col-6\"></div>\r\n" + "	<div class=\"p-2 g-col-6\"></div>\r\n"
				+ "	<div class=\"p-2 g-col-6\"></div>\r\n" + "	<div class=\"p-2 g-col-6\"></div>\r\n" + "\r\n" + "\r\n"
				+ "	<table class=\"table table-bordered border-primary\">\r\n" + "		<thead>\r\n"
				+ "			<tr>\r\n" + "				<th>Nombre</th>\r\n" + "				<th>Fecha</th>\r\n"
				+ "				<th>Colegio</th>\r\n" + "				<th>Carrera</th>\r\n"
				+ "				<th>Estrato</th>\r\n" + "				<th>Homologado</th>\r\n"
				+ "				<th>Costo</th>\r\n" + "			</tr>\r\n" + "		</thead>\r\n"
				+ "		<tbody>\r\n");

		for (int i = 0; i < dao.getList().size(); i++) {
			salida.println("    <tr>\r\n" + "      <td>" + dao.getList().get(i).getNombre() + "</td>\r\n" + "      <td>"
					+ dao.getList().get(i).getFecha() + "</td>\r\n" + "      <td>" + dao.getList().get(i).getColegio()
					+ "</td>\r\n" + "      <td>" + dao.getList().get(i).getCarrera() + "</td>\r\n" + "      <td>"
					+ dao.getList().get(i).getEstrato() + "</td>\r\n" + "      <td>"
					+ dao.getList().get(i).getHomologado() + "</td>\r\n" + "      <td>"
					+ dao.getList().get(i).getCosto() + "</td>\r\n"

					+ "    </tr>\r\n"

			);
		}
		salida.println("    </tbody>\r\n" + "  </table>\r\n" + "\r\n" + "\r\n" + "</body>\r\n" + "\r\n" + "</html>");

		salida.close();

	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter salida = resp.getWriter();
		salida.println(
				"<html>\r\n" + "<head>\r\n" + "<meta charset=\"UTF-8\">\r\n" + "<title>Insert title here</title>\r\n"
						+ "</head>\r\n" + "<body>\r\n" + "<h1>actualizar</h1>\r\n" + "</body>\r\n" + "</html>");

		salida.close();
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter salida = resp.getWriter();
	ArrayList<AspiranteDTO> kevin = (ArrayList<AspiranteDTO>)req.getSession().getAttribute("kevin");
	System.out.println(kevin.get(0).getNombre());
		salida.println(
				"<html>\r\n" + "<head>\r\n" + "<meta charset=\"UTF-8\">\r\n" + "<title>Insert title here</title>\r\n"
						+ "</head>\r\n" + "<body>\r\n" + "<h1>Eliminado</h1>\r\n" + "</body>\r\n" + "</html>");

		salida.close();
	}

}
