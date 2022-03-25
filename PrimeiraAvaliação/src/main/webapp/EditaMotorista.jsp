<%@page import="br.com.avaliacaoum.agenciador.MotoristaDAO"%>
<%@page import="br.com.avaliacaoum.agenciador.Motorista"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Editar Motorista</title>
	</head>
	<body>
	
		<div style="height: 100%; justify-content: center; display: flex;">
		
			<form action="salvarMotorista" method="post" 
					style="width: 300px; 
						border: 1px solid #009a84;
						padding: 15px;
						border-radius: 10px 10px 10px 10px;">
						
				<h1 style="text-align: center; color: #009a84;">Editar Motorista</h1>
				
				<hr> <br />
				
				<% MotoristaDAO motoristaDAO = new MotoristaDAO();
				Motorista motorista = motoristaDAO.getMotoristaById(MotoristaDAO.index);
				%>
				
				<label style="color: #009a84">Nome </label><br />
				<input type="text" value = "<%= motorista.getNome() %>" name="nome" style="width: 100%">
				
				<br /><br />
				
				<label style="color: #009a84">Data de Nascimento </label> <br />
				<input type="date" value = "<%= motorista.getDataNascimento() %>" name="dataNasciemnto" style="width: 100%">
							
				<br /><br /><br />
				
				<label style="color: #009a84">Cpf</label> <br />
				<input type="text" value = "<%= motorista.getCpf() %>" name="cpf" style="width: 100%">
							
				<br /><br /><br />
							
				<label style="color: #009a84">Endereço</label> <br />
				<input type="text" value = "<%= motorista.getEndereco() %>" name="endereco" style="width: 100%">
							
				<br /><br /><br />
				
				<label style="color: #009a84">Contato</label> <br />
				<input type="text" value = "<%= motorista.getContato() %>"name="contato" style="width: 100%">
							
				<br /><br /><br />
				
				<label style="color: #009a84">Observações</label> <br />
				<input type="text" value = "<%= motorista.getObs() %>" name="obs" style="width: 100%">
							
				<br /><br /><br />
			
				<input type = "hidden" name = "index" value = "<%= motorista.getId() %>">
				<div style="width: 50%; float: right;">
						<input type="submit" value="Editar"
							style="
							    background: #009a84;
							    font-size: 16px;
							    color: white;
							    width: 100%;
							    text-align: center;
							    padding: 8px 10px 8px 10px;
							    text-decoration: auto;
							    border-radius: 10px 10px 10px 10px;
							    margin-top: -10px;">
					</div>	
			</form>
		</div>
	
	</body>
</html>