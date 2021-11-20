<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
  <h2>Sistema de Cadastramento de Alunos</h2>
<c:if test="${not empty msg}">  
  <div class="alert alert-warning">
  	<strong>Alerta!</strong> ${msg}
  </div>
  </c:if>
  
  <form action="/login" method="post">
    <div class="form-group">
      <label>Email:</label>
      <input value="t@t.com" type="email" class="form-control" placeholder="Entre com o e-mail..." name="email">
    </div>
    <div class="form-group">
      <label>Senha:</label>
      <input value="123" type="password" class="form-control" placeholder="Entre com a sua senha..." name="senha">
    </div>

    <button type="submit" class="btn btn-primary">Fazer Login</button>
  </form>
</div>

</body>
</html>