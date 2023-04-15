package controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletGuardar extends HttpServlet {

//	private ParqueDAO dao;

	public ServletGuardar() {
//		dao = new ParqueDAO();
	}
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter salida = resp.getWriter();
		salida.println("<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "<table>\r\n"
				+ "  <thead>\r\n"
				+ "    <tr>\r\n"
				+ "      <th>ID</th>\r\n"
				+ "      <th>Fecha de compra</th>\r\n"
				+ "      <th>Tipo de pasaporte</th>\r\n"
				+ "      <th>Costo unitario</th>\r\n"
				+ "      <th>Cantidad de pasaportes</th>\r\n"
				+ "      <th>Número de atracciones</th>\r\n"
				+ "    </tr>\r\n"
				+ "  </thead>\r\n"
				+ "  <tbody>\r\n");
				
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
				
				salida.println(
						        "\r\n"
								+ "  </tbody>\r\n"
								+ "</table>\r\n"
								+ "\r\n"
								+ "\r\n"
								+ "</body>\r\n"
								+ "</html>");
				

		salida.close();
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
			resp.setContentType("text/html");
			PrintWriter salida = resp.getWriter();
			salida.println("<html>\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"UTF-8\">\r\n"
					+ "<title>Insert title here</title>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "<h1>Error digistaste algo mal</h1>\r\n"
					+ "</body>\r\n"
					+ "</html>");


	salida.close();
		
		
	
	}

}
