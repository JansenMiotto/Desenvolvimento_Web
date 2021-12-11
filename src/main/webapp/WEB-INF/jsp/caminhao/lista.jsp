<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">	
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
		<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container">	
	
	<a href="/caminhao">Novo Caminhão</a>
	
		
		<c:if test="${not empty nome}">
			<div class="alert alert-success">
				<strong>Confirmação!</strong> O veículo ${nome} cadastrado com sucesso!!!
			</div>
		</c:if>
	<c:if test="${not empty listaCaminhao}">
	
	<h4>Listagem de Caminhões:</h4>
	<table class="table table-striped">
	<thead>
	<tr>
		<th>#</th>
		<th>Carro</th>
		<th>Cor</th>
		<th>Valor</th>
		<th>Automático</th>
		<th>Carroceria</th>
		<th>Qtde de Eixo</th>		
		<th></th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="c" items="${listaCaminhao}">
		<tr>
		<td>${c.id}</td>
		<td>${c.nomeCarro}</td>
		<td>${c.cor}</td>
		<td>${c.valor}</td>
		<td>${c.cambioAutomatico}</td>
		<td>${c.tipoCarroceria}</td>
		<td>${c.qtdeEixo}</td>		
		<c:if test="${user.admin}">
		<td><a href="/caminhao/${c.id}/excluir">Excluir</a></td>
		</c:if>
		</tr>
	</c:forEach>
	</tbody>
	</table>
	</c:if>
	<c:if test="${empty listaCaminhao}">
	<h4>Não existem veículos cadastrados!</h4>
	
	
	</c:if>
	</div>
</body>
</html>