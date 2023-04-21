package controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;

import model.AspiranteDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

public class ServletAdmin extends HttpServlet {
	
	private static final String ADMIN_USERNAME = "admin";
	private static final String ADMIN_PASSWORD = "admin";



	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Obtener los datos del formulario
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		// Verificar las credenciales del administrador
		if (ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password)) {
			resp.sendRedirect("admin.jsp");
		} else {
			// Si las credenciales son incorrectas, mostrar una alerta y redirigir al
			// usuario de vuelta al formulario de inicio de sesión
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<html><body onload=\"showLoginError()\">  <h1>ERROR</h1> </body></html>");
			resp.setHeader("Refresh", "0; URL=login.jsp");
		}

	}

}
