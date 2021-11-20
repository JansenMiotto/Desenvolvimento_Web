<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="br.edu.infnet.appaluguelcarros.model.domain.Aluno"%>
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
	<a href="veiculo">Novo Aluno</a>
	
		<hr>
		<c:if test="${not empty nome}">
			<div class="alert alert-success">
				<strong>Confirmação!</strong> Aluno ${nome} cadastrado com sucesso!!!
			</div>
		</c:if>
	<c:if test="${not empty listaAlunos}">
	
	<h4>Listagem Alunos (${listaAlunos.size}):</h4>
	<table class="table table-striped">
	<thead>
	<tr>
	<th>#</th>
		<th>Nome</th>
			<th>E-mail</th>
			<th>Usuario</th>
				<th></th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="a" items="${listaAlunos}">
		<tr>
		<td>${a.id}</td>
		<td>${a.nome}</td>
		<td>${a.email}</td>
		<td>${a.usuario.nome}</td>
		<td><a>Excluir href="/veiculo/${a.id}/excluir"</a></td>
		</tr>
	</c:forEach>
	</tbody>
	</table>
	</c:if>
	<c:if test="${empty listaAlunos}">
	
	
	<h4>Não existem alunos!</h4>
	
	
	</c:if>
	</div>
</body>
</html>