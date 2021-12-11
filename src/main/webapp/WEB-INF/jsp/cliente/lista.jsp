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
		<a href="/cliente">Novo Cliente</a>
		<hr>
		<c:if test="${not empty mensagem}">
			<div class="alert alert-warning">
				<strong>Atenção!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${not empty nome}">
			<div class="alert alert-success">
				<strong>Confirmação!</strong> Cliente ${nome} cadastrado com sucesso!!!
			</div>
		</c:if>		
		
	<c:if test="${not empty listaClientes}">
	
	<h4>Listagem de Clientes:</h4>
	<table class="table table-striped">
	<thead>
	<tr>
		<th>#</th>
		<th>Nome</th>
		<th>CPF</th>
		<th>E-mail</th>
		<th>Usuario</th>
		<th></th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="c" items="${listaClientes}">
		<tr>
		<td>${c.id}</td>
		<td>${c.nome}</td>
		<td>${c.cpf}</td>
		<td>${c.email}</td>
		<td>${c.usuario.nome}</td>
		<c:if test="${user.admin}">
		<td><a href="/cliente/${c.id}/excluir">Excluir</a></td>
		</c:if>
		</tr>
	</c:forEach>
	</tbody>
	</table>
	</c:if>
	<c:if test="${empty listaClientes}">
	<h4>Não existem Clientes!</h4>
	</c:if>
	</div>
</body>
</html>