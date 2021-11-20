<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aluguel Caminh�o</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">	
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
		<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="container">
		<form action="/caminhao/incluir" method="post">
			<div class="form-group">
				<label>Nome do Caminh�o:</label> <input type="text" class="form-control"
					placeholder="Digite o nome do caminh�o..." name="nome">
			</div>

			<div class="form-group">
				<label>Cor:</label> <select name="cor" class="form-control">
					<option value="Pa">Prata</option>
					<option value="Po">Preto</option>
					<option value="B">Branco</option>
					<option value="V">Vermelho</option>
				</select>
			</div>


			<div class="form-group">
				<label>Quantidade de Dias:</label> <input type="number" class="form-control" placeholder="Qtde de dias com o caminh�o..." name="dias">
			</div>

			<div class="form-group">
				<label>Pre�o:</label> <input value="300" type="number" class="form-control" name="valor">
			</div>
			
			<div class="form-group">
				<label>Carroceria:</label> <select name="carroceria" class="form-control">
					<option value="Ca�">Ca�amba</option>
					<option value="Bau">Ba�</option>
					<option value="Frig">Frigor�fico</option>
				</select>
			</div>			

			<div class="form-group">
				<label>Quantidade Eixo:</label> <input value="8" type="number" class="form-control" name="eixo">
			</div>
			
						<div class="form-group">
				<label>C�mbio:</label>
				<div class="form-check-inline">
					<label class="form-check-label"> <input type="checkbox"
						name="disciplinas" value="FUND" class="form-check-input">Autom�tico
					</label>
				</div>
			

			<button type="submit">Cadastrar</button>
		</form>
	</div>
<a href="/"><button>Voltar</button></a>
</body>
</html>