<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Locação</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">	
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
		<c:import url="/WEB-INF/jsp/menu.jsp"/>
		<c:set var="botao" value=""/>
	<div class="container">
		<form action="/locacao/incluir" method="post">
		
			<div class="form-group">
				<label>Descrição:</label> <input type="text" class="form-control"
					placeholder="Digite a descrição..." name="descricao" value="Minha locação">
			</div>

			<div class="form-group">
			<c:if test="${not empty veiculos}">
			<label>Veículos</label>
			<c:forEach var="v" items="${veiculos}">
			<div class="form-check-inline">
					<label class="form-check-label"> <input type="checkbox"
						name="veiculosIds" value="${v.id}" class="form-check-input">${v.nomeCarro}
					</label>
				</div>
			</c:forEach>			
			</c:if>
			<c:if test="${empty veiculos}">
				<label>Não existem veículos cadastrados!!!</label>
				<c:set var="botao" value="disabled"/>
			</c:if>
			
			</div>
			
			<div class="form-group">
				<c:if test="${not empty clientes}">
				<label>Cliente:</label> <select name="cliente.id" class="form-control">
					<c:forEach var="c" items="${clientes}">
					<option value="${c.id}">${c.nome}</option>
					</c:forEach>
				</select>
				</c:if>
			<c:if test="${empty clientes}">
				<label>Não existem clientes cadastrados!!!</label>
			<c:set var="botao" value="disabled"/>
			</c:if>
			
			</div>
			
			

			<button ${botao} type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>