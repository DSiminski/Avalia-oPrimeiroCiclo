package br.com.avaliacaoum.agenciador;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 @WebServlet
 (name = "salvarMotorista",
 urlPatterns = "/salvarMotorista")

public class MotoristaServletSalvar extends HttpServlet {
	
			
			private static final long serialVersionUID = 1L;
			
			
			public void doPost(
					HttpServletRequest httpServletRequest, 
					HttpServletResponse httpServletResponse
			) throws IOException {
				
				Motorista motorista = new Motorista();
				MotoristaDAO motoristaDAO;
				try {
					motoristaDAO = new MotoristaDAO();
					long index = -1;
					
					if (httpServletRequest.getParameter("index") != null) {
						index = Long.valueOf(httpServletRequest.getParameter("index"));
						motorista.setId(index);
					}
					
					motorista.setNome(httpServletRequest.getParameter("nome"));
					//motorista.setDataNascimento(Date.valueOf(httpServletRequest.getParameter("dataNascimento")));
					motorista.setCpf(httpServletRequest.getParameter("cpf"));
					motorista.setContato(httpServletRequest.getParameter("contato"));
					motorista.setEndereco(httpServletRequest.getParameter("endereco"));
					motorista.setObs(httpServletRequest.getParameter("obs"));
					
					if (index >= 0 ) {
						motoristaDAO.editaMotorista(motorista);	
					}
					else {
						motoristaDAO.criaTabelaMotorista();
						motoristaDAO.insereNaTabelaMotorista(motorista);
					}
					
					
					httpServletResponse.sendRedirect("ListaMotorista.jsp");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	
			}
		}
