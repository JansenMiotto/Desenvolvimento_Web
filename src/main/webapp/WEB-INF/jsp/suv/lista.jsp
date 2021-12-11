<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de cadastro de veiculos</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">	
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
		<c:import url="/WEB-INF/jsp/menu.jsp"/>
	<div class="container">	
	
	<a href="/suv">Novo Carro SUV</a>
	
		
		<c:if test="${not empty nome}">
			<div class="alert alert-success">
				<strong>Confirmação!</strong> O veículo ${nome} cadastrado com sucesso!!!
			</div>
		</c:if>
	<c:if test="${not empty listaSuv}">
	
	<h4>Listagem de veículos SUV:</h4>
	<table class="table table-striped">
	<thead>
	<tr>
		<th>#</th>
		<th>Carro</th>
		<th>Cor</th>
		<th>Valor</th>
		<th>Seguro</th>
		<th>Total de Passageiros</th>
		<th>Motor</th>		
		<th></th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="s" items="${listaSuv}">
		<tr>
		<td>${s.id}</td>
		<td>${s.nomeCarro}</td>
		<td>${s.cor}</td>
		<td>${s.valor}</td>
		<td>${s.seguro}</td>
		<td>${s.totalPassageiros}</td>
		<td>${s.motor}</td>		
		<c:if test="${user.admin}">
		<td><a href="/suv/${s.id}/excluir">Excluir</a></td>
		</c:if>
		</tr>
	</c:forEach>
	</tbody>
	</table>
	</c:if>
	<c:if test="${empty listaSuv}">
	<h4>Não existem veículos cadastrados!</h4>
	
	
	</c:if>
	</div>
</body>
</html>