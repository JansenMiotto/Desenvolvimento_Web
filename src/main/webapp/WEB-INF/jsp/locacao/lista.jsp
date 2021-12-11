<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="br.edu.infnet.appaluguelcarros.model.domain.Cliente"%>
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
		<a href="/locacao">Nova Locação</a>
		<hr>
		<c:if test="${not empty descricao}">
			<div class="alert alert-success">
				<strong>Confirmação!</strong> Locação "${descricao}" cadastrado com sucesso!!!
			</div>
		</c:if>
	<c:if test="${not empty listaLocacao}">
	
	<h4>Listagem de Locações:</h4>
	<table class="table table-striped">
	<thead>
	<tr>
		<th>#</th>
		<th>Descrição</th>
		<th>Cliente</th>
		<th>Veiculos</th>
		<th></th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="l" items="${listaLocacao}">
		<tr>
		<td>${l.id}</td>
		<td>${l.descricao}</td>
		<td>${l.cliente.nome}</td>
		<td>${l.veiculos.size()}</td>
		<c:if test="${user.admin}">
		<td><a href="/locacao/${l.id}/excluir">Excluir</a></td>
		</c:if>
		</tr>
	</c:forEach>
	</tbody>
	</table>
	</c:if>
	<c:if test="${empty listaLocacao}">
	<h4>Não existem Locações!</h4>
	</c:if>
	</div>
</body>
</html>