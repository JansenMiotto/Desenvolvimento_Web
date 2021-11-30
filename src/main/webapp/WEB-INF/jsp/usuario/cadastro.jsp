<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<!-- pelo action eu posso chamar uma tela, função, rotas - method post vai escondido não mostra na url -->
	<div class="container">
		<form action="/cep" class="form-inline" method="post">
			<div class="form-group">
				<label>CEP:</label> <input type="text" class="form-control"
					placeholder="Digite seu CEP..." name="cep" value="06850-140">
			</div>	
			<button type="submit" class="btn btn-primary">Cadastrar</button>		
		</form>
		
		<hr>
	
		<form action="/usuario/incluir" method="post">
			<div class="form-group">
				<label>Nome:</label> <input type="text" class="form-control"
					placeholder="Digite seu nome..." name="nome">
			</div>

			<div class="form-group">
				<label>E-mail:</label> <input type="email" class="form-control" placeholder="Entre com o seu e-mail..." name="email">
			</div>
		
		    <div class="form-group">
		      <label>Senha:</label>
		      <input value="t@t.com" type="password" class="form-control" placeholder="Entre com a sua senha..." name="senha">
		    </div>
			
		<c:import url="/WEB-INF/jsp/endereco.jsp"/>
				

			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
<a href="/"><button>Voltar</button></a>
</body>
</html>