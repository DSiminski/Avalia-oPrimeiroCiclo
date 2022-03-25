package br.com.avaliacaoum.agenciador;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet
(name = "excluirMotorista",
urlPatterns = "/excluirMotorista")

public class MototristaServletExcluir extends HttpServlet {

	public void doPost(
			HttpServletRequest httpServletRequest, 
			HttpServletResponse httpServletResponse
	) throws IOException {
		long index = Long.valueOf( httpServletRequest.getParameter("index"));
		try {
			MotoristaDAO motoristaDAO = new MotoristaDAO();
			motoristaDAO.removeMotorista(index);
			httpServletResponse.sendRedirect("ListaMotorista.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	}

	

