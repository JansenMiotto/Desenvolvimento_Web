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
	
	<a href="/cadastro">Novo Carro Econ�mico</a>
	
		
		<c:if test="${not empty nome}">
			<div class="alert alert-success">
				<strong>Confirma��o!</strong> O ve�culo ${nome} cadastrado com sucesso!!!
			</div>
		</c:if>
	<c:if test="${not empty listaEconomicos}">
	
	<h4>Listagem de ve�culos econ�micos:</h4>
	<table class="table table-striped">
	<thead>
	<tr>
		<th>#</th>
		<th>Carro</th>
		<th>Cor</th>
		<th>Valor</th>
		<th>Autom�tico</th>
		<th>Qtde Condutores</th>
		<th>Ar-Condicionado</th>		
		<th></th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="e" items="${listaEconomicos}">
		<tr>
		<td>${e.id}</td>
		<td>${e.nome}</td>
		<td>${e.cor}</td>
		<td>${e.valor}</td>
		<td>${e.automatico}</td>
		<td>${e.qtdeCondutores}</td>
		<td>${e.arCondicionado}</td>		
		<c:if test="${user.admin}">
		<td><a href="/economico/${e.id}/excluir">Excluir</a></td>
		</c:if>
		</tr>
	</c:forEach>
	</tbody>
	</table>
	</c:if>
	<c:if test="${empty listaEconomicos}">
	<h4>N�o existem ve�culos cadastrados!</h4>
	
	
	</c:if>
	</div>
</body>
</html>