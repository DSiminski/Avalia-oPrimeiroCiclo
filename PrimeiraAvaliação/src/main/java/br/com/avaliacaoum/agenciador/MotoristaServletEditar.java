package br.com.avaliacaoum.agenciador;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet
(name = "editarMotorista",
urlPatterns = "/editarMotorista")

public class MotoristaServletEditar extends HttpServlet {

	public void doPost(
			HttpServletRequest httpServletRequest, 
			HttpServletResponse httpServletResponse
	) throws IOException {
		
		MotoristaDAO.index = Integer.valueOf(httpServletRequest.getParameter("index"));
		
		httpServletResponse.sendRedirect("EditaMotorista.jsp");
	}
	
}
