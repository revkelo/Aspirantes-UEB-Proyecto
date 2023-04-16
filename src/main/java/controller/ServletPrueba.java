package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import Model.AspiranteDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletPrueba extends HttpServlet{

	
	protected void process(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		resp.setContentType("text/html");
		
	}
}
