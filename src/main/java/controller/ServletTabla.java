package controller;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import Model.AspiranteDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ServletTabla extends HttpServlet {



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
		ArrayList<AspiranteDTO> lista = (ArrayList<AspiranteDTO>)req.getSession().getAttribute("lista");
		System.out.println();
		PrintWriter salida = resp.getWriter();
		
		String uploadPath = getServletContext().getRealPath("") + File.separator + "uploads";
        File uploadDir = new File(uploadPath);
    
       String Url = uploadDir.getAbsolutePath();
		
		
		salida.println("<!DOCTYPE html>\r\n" 
		+ "<html>\r\n" + "\r\n" 
				+ "<head>\r\n" 
		+ "<meta charset=\"UTF-8\" />\r\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n"
				+ "<title>Formularios con Bootstrap</title>\r\n" 
				+ "<!-- Agrega los estilos de Bootstrap -->\r\n"
				+ "<link rel=\"stylesheet\"\r\n"
				+ "	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n"
				+ "	integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\r\n"
				+ "	crossorigin=\"anonymous\" />\r\n" 
				+ "</head>\r\n" 
				+ "\r\n" 
				+ "<body>\r\n"
				+ "	<h1 class=\"display-4\">Administrativo</h1>\r\n" 
				+ "	<div class=\"p-2 g-col-6\"></div>\r\n" 
				+ "	<div class=\"p-2 g-col-6\"></div>\r\n"
				+ "	<div class=\"p-2 g-col-6\"></div>\r\n" 
				+ "	<div class=\"p-2 g-col-6\"></div>\r\n" 
				+ "\r\n" 
				+ "\r\n"
				+ "	<table class=\"table table-bordered border-primary\">\r\n" + "		<thead>\r\n"
				+ "			<tr>\r\n"
				+ "				<th>ID</th>\r\n" 
				+ "				<th>Imagen</th>\r\n" 
				+ "				<th>Nombre</th>\r\n" 
				+ "				<th>Fecha</th>\r\n"
				+ "				<th>Edad</th>\r\n" 
				+ "				<th>Colegio</th>\r\n" 
				+ "				<th>Carrera</th>\r\n"
				+ "				<th>Estrato</th>\r\n" 
				+ "				<th>Homologado</th>\r\n"
				+ "				<th>Costo</th>\r\n" 
				+ "			</tr>\r\n" 
				+ "		</thead>\r\n"
				+ "		<tbody>\r\n");

		for (int i = 0; i < lista.size(); i++) {
			salida.println("    <tr>\r\n" 
					+ "      <td>" + i + "</td>\r\n" 
					
					

		+ "      <td>" + lista.get(i).getNombre() + "</td>\r\n" 
		
					+ "      <td>"
					+ lista.get(i).getFecha() + "</td>\r\n" 
							+ "      <td>" + lista.get(i).getEdad() + "</td>\r\n" 

					+ "      <td>" + lista.get(i).getColegio()
					+ "</td>\r\n" 
					+ "      <td>" + lista.get(i).getCarrera() + "</td>\r\n" 
					+ "      <td>"
					+ lista.get(i).getEstrato() + "</td>\r\n" 
					+ "      <td>"
					+ lista.get(i).getHomologado() + "</td>\r\n" 
					+ "      <td>"
					+ lista.get(i).getCosto() 
					+ "</td>\r\n"

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
	ArrayList<AspiranteDTO> lista = (ArrayList<AspiranteDTO>)req.getSession().getAttribute("lista");
	System.out.println(lista.get(0).getNombre());
		salida.println(
				"<html>\r\n" + "<head>\r\n" + "<meta charset=\"UTF-8\">\r\n" + "<title>Insert title here</title>\r\n"
						+ "</head>\r\n" + "<body>\r\n" + "<h1>Eliminado</h1>\r\n" + "</body>\r\n" + "</html>");

		salida.close();
	}

}
