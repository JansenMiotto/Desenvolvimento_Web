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
		
		<c:if test="${not empty nome}">
			<div class="alert alert-success">
				<strong>Confirmação!</strong> Veículo ${nome} cadastrado com sucesso!!!
			</div>
		</c:if>
	<c:if test="${not empty listaVeiculos}">
	
	<h4>Listagem de Veiculos:</h4>
	<table class="table table-striped">
	<thead>
	<tr>
		<th>#</th>
		<th>Veiculo</th>
		<th>Cor</th>
		<th>Valor</th>		
		<th></th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="v" items="${listaVeiculos}">
		<tr>
		<td>${v.id}</td>
		<td>${v.nomeCarro}</td>
		<td>${v.cor}</td>
		<td>${v.valor}</td>
				
		<c:if test="${user.admin}">
		<td><a href="/veiculo/${v.id}/excluir">Excluir</a></td>
		</c:if>
		</tr>
	</c:forEach>
	</tbody>
	</table>
	</c:if>
	<c:if test="${empty listaVeiculos}">
	<h4>Não existem veículos cadastrados!</h4>
	
	
	</c:if>
	</div>
</body>
</html>