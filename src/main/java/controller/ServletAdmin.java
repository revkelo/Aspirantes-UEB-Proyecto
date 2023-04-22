package controller;


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Esta clase representa un Servlet que implementa un mecanismo de autenticación para un usuario administrador.
 */
public class ServletAdmin extends HttpServlet {
	
	// Constantes que representan el nombre de usuario y la contraseña del usuario administrador
	private static final String ADMIN_USERNAME = "admin";
	private static final String ADMIN_PASSWORD = "admin";

	/**
	 * Método que maneja las solicitudes GET al Servlet.
	 * No se realiza ninguna acción en este método.
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	/**
	 * Método que maneja las solicitudes POST al Servlet.
	 * Verifica las credenciales del usuario y redirige al usuario a la página de administrador si son correctas,
	 * o muestra un mensaje de error si son incorrectas y redirige al usuario de vuelta al formulario de inicio de sesión.
	 */
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