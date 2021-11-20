<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Cliente</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">	
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
		<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container">
		<form action="/cliente/incluir" method="post">
			<h3>----Cadastro de Cliente----</h3>
			<div class="form-group">
				<label>Nome:</label> <input type="text" class="form-control"
					placeholder="Digite seu nome..." name="nome">
			</div>

			<div class="form-group">
				<label>CPF:</label> <input type="text" class="form-control"
					placeholder="Digite seu cpf..." name="cpf">
			</div>

			<div class="form-group">
				<label>E-mail:</label> <input type="email" class="form-control"
					placeholder="Entre com o seu e-mail..." name="email">
			</div>

			<button type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>