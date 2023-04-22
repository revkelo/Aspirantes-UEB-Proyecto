package controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;

import model.AspiranteDAO;
import model.AspiranteDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

/**
 * 
 * Esta clase implementa un servlet que se utiliza para listar en un tabla por carrera los
 * Aspirantes
 */

public class ServletListar extends HttpServlet {

	
	/**

	Método que maneja la petición GET y muestra la información de los aspirantes en una tabla HTML por carrera.

	@param req objeto HttpServletRequest que contiene la información de la solicitud del cliente.

	@param resp objeto HttpServletResponse que contiene la información de la respuesta del servidor.

	@throws ServletException si ocurre un error en el servlet.

	@throws IOException si ocurre un error de entrada/salida al manejar la petición.
	*/
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int cant = 0;
		resp.setContentType("text/html");
		ArrayList<AspiranteDTO> lista = (ArrayList<AspiranteDTO>) req.getSession().getAttribute("lista");
		PrintWriter salida = resp.getWriter();

		String uploadPath = getServletContext().getRealPath("") + File.separator + "uploads";
		File uploadDir = new File(uploadPath);

		String url = uploadDir.getAbsolutePath();
		String carrera = req.getParameter("carrera");
		for (int i = 0; i < lista.size(); i++) {
			if (carrera.equals(lista.get(i).getCarrera())) {
				cant++;
			}

		}

		if (cant == 0) {
			salida.println(
					"<html><body onload=\"showLoginError()\">  <h1>No hay carreras Guardadas</h1> </body></html>");
			resp.setHeader("Refresh", "1; URL=admin.jsp");
			salida.close();
		} else {

			salida.println("<!DOCTYPE html>\r\n" + "<html>\r\n" + "\r\n" + "<head>\r\n"
					+ "<meta charset=\"UTF-8\" />\r\n"
					+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n"
					+ "<title>Formularios con Bootstrap</title>\r\n" + "<!-- Agrega los estilos de Bootstrap -->\r\n"
					+ "<link rel=\"stylesheet\"\r\n"
					+ "	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n"
					+ "	integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\r\n"
					+ "	crossorigin=\"anonymous\" />\r\n" + "</head>\r\n" + "\r\n" + "<body>\r\n"
					+ "	<h1 class=\"display-4\">Administrativo</h1>\r\n" + "	<div class=\"p-2 g-col-6\"></div>\r\n"
					+ "	<div class=\"p-2 g-col-6\"></div>\r\n" + "	<div class=\"p-2 g-col-6\"></div>\r\n"
					+ "	<div class=\"p-2 g-col-6\"></div>\r\n" + "\r\n" + "\r\n"
					+ "	<table class=\"table table-bordered border-primary\">\r\n" + "		<thead>\r\n"
					+ "			<tr>\r\n" + "				<th>ID</th>\r\n" + "				<th>Imagen</th>\r\n"
					+ "				<th>Nombre</th>\r\n" + "				<th>Fecha</th>\r\n"
					+ "				<th>Edad</th>\r\n" + "				<th>Colegio</th>\r\n"
					+ "				<th>Carrera</th>\r\n" + "				<th>Estrato</th>\r\n"
					+ "				<th>Homologado</th>\r\n" + "				<th>Costo</th>\r\n"
					+ "			</tr>\r\n" + "		</thead>\r\n" + "		<tbody>\r\n");

			for (int i = 0; i < lista.size(); i++) {

				if (carrera.equals(lista.get(i).getCarrera())) {

					salida.println("    <tr>\r\n" + "      <td>" + i + "</td>\r\n");

					salida.println("  <td><img src=" + "'" + url + i + ".jpg" + "'" + "></td>");
					salida.println("      <td>" + lista.get(i).getNombre() + "</td>\r\n"

							+ "      <td>" + lista.get(i).getFecha() + "</td>\r\n" + "      <td>"
							+ lista.get(i).getEdad() + "</td>\r\n"

							+ "      <td>" + lista.get(i).getColegio() + "</td>\r\n" + "      <td>"
							+ lista.get(i).getCarrera() + "</td>\r\n" + "      <td>" + lista.get(i).getEstrato()
							+ "</td>\r\n" + "      <td>" + lista.get(i).getHomologado() + "</td>\r\n" + "      <td>"
							+ lista.get(i).getCosto() + "</td>\r\n"

							+ "    </tr>\r\n"

					);
				}

			}
			salida.println(
					"    </tbody>\r\n" + "  </table>\r\n" + "\r\n" + "\r\n" + "</body>\r\n" + "\r\n" + "</html>");

			salida.close();
		}
	}

	/**
	 * 
	 * Método que se ejecuta al enviar el formulario con método POST.
	 * 
	 * Recibe un objeto HttpServletRequest con la información de la solicitud HTTP
	 * 
	 * y un objeto HttpServletResponse con la información de la respuesta HTTP.
	 * 
	 * @param req  objeto HttpServletRequest con la información de la solicitud
	 *             HTTP.
	 * 
	 * @param resp objeto HttpServletResponse con la información de la respuesta
	 *             HTTP.
	 * 
	 * @throws ServletException si ocurre un error en la ejecución del servlet.
	 * 
	 * @throws IOException      si ocurre un error en la entrada o salida de datos.
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
