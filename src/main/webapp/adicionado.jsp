<%@page import="java.util.List"%>
<%@page import="tp1_desenv_web.domain.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Usuário Cadastrado!</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	
	<%
	String nome = (String)request.getAttribute("nome");
	List<Usuario> usuarios = (List<Usuario>)request.getAttribute("lista");
	%>

	<div class="container">
	<form action="usuario" method="get">
		<h4>Usuario <i><%=nome%></i> Cadastrado com sucesso!!!</h4>
		<button class="btn btn-primary" type="submit">Voltar</button>
	</form>
	<hr>
	<h4>Lista de Usuários:</h4>
	<%for(Usuario user : usuarios){%>
		<h5><%=user.getNome()%> - <%=user.getEmail()%></h5>
	<%}%>

	</div>

</body>
</html>