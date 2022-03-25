<%@page import="java.util.List"%>
<%@page import="br.com.avaliacaoum.agenciador.Motorista"%>
<%@page import="br.com.avaliacaoum.agenciador.*"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Agencia</title>
	</head>
	<body>
		
		<div style="height: 100%; justify-content: center; display: flex;">
			<div style="width: 800px;">
				<h1 style="text-align: center; color: #009a84;"> Lista de Motoristas </h1>
		
				<a href="CadastraMotorista.jsp" 
					 style="float: right; 
						 background: #009a84; 
						 font-size: 24px; 
						 color: white; 
						 text-align: center; 
						 padding: 5px 11px 5px 10px; 
						 text-decoration: auto; 
						 border-radius: 100px 100px 100px 100px; 
						 margin-top: -60px;"> 
					 Cadastrar Motoristas
				 </a>
		
				<hr>
				
				<table border="1" style="width: 100%">
					<tr style="background: #009a84; color: white;">
						<th>ID</th>
						<th>Nome</th>
						<th>Data de Nasciemento</th>
						<th>CPF</th>
						<th>Endereco</th>
						<th>Contato</th>
						<th>Observação</th>
						
					</tr>
		
					<% MotoristaDAO motoristaDAO = new MotoristaDAO();
					List<Motorista> motorista = motoristaDAO.listarMotorista();
					%>
					
					<% for (int i = 1; i < motorista.size(); i++) { %>
						
						<tr style="color: #009a84">
							<th> <%= i %> </th>
							<th> <%= motorista.get(i).getNome() %> </th>
							<th> <%= motorista.get(i).getDataNascimento() %> </th>
							<th> <%= motorista.get(i).getCpf() %> </th>
							<th> <%= motorista.get(i).getEndereco() %> </th>
							<th> <%= motorista.get(i).getContato() %> </th>
							<th> <%= motorista.get(i).getObs() %> </th>
							<th style="width: 150px">
						        
								<form action="editarMotorista" method="post" style="width: 50%; float: left;">
									<input type="hidden" name="index" value="<%=  motorista.get(i).getId()  %>">
									<input type="submit" value="Editar" style="background: #9a8400; color: white">
								</form>
						        
								<form action="excluirMotorista" method="post" style="width: 50%; float: right;">
									<input type="hidden" name="index" value="<%= motorista.get(i).getId() %>">
									<input type="submit" value="Excluir" style="background: #9a0016; color: white">
								</form>
						    
							</th>
						</tr>
					
					<% } %>
		
				</table>
				
				<a href="index.jsp" style="
						background: #009a84;
					    font-size: 16px;
					    color: white;
					   	text-align: center;
					    padding: 10px 10px 10px 10px;
					    text-decoration: auto;
					    border-radius: 10px 10px 10px 10px;
					    margin-top: 20px;
					    position: absolute;"> 
					Voltar para o Menu
				</a>
			</div>
		</div>
			
	</body>
</html>