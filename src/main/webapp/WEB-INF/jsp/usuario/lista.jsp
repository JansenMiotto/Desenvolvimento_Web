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
		
		<c:if test="${not empty nome}">
			<div class="alert alert-success">
				<strong>Confirmação!</strong> Usuário ${nome} cadastrado com sucesso!!!
			</div>
		</c:if>
	<c:if test="${not empty listaUsuarios}">
	
	<h4>Listagem de Usuários (${listaUsuarios.size}):</h4>
	<table class="table table-striped">
	<thead>
	<tr>
		<th>#</th>
		<th>Nome</th>
		<th>E-mail</th>
		<th>Alunos</th>
		<th></th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="u" items="${listaUsuarios}">
		<tr>
		<td>${u.id}</td>
		<td>${u.nome}</td>
		<td>${u.email}</td>
		<td>${u.alunos.size()}</td>
		<td><a>Excluir href="/usuario/${u.id}/excluir"</a></td>
		</tr>
	</c:forEach>
	</tbody>
	</table>
	</c:if>
	<c:if test="${empty listaUsuarios}">
	
	
	<h4>Não existem usuários!</h4>
	
	
	</c:if>
	</div>
</body>
</html>