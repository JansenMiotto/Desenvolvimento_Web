<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aluguel Carro Econômico</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">	
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
		<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="container">
		<form action="/economico/incluir" method="post">
			<div class="form-group">
				<label>Nome do Carro:</label> <input type="text" class="form-control"
					placeholder="Digite o nome do carro..." name="nome">
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
				<label>Quantidade de Dias:</label> <input type="number" class="form-control" placeholder="Qtde de dias com o carro..." name="dias">
			</div>

			<div class="form-group">
				<label>Preço:</label> <input value="100" type="number" class="form-control" name="valor">
			</div>
			
			<div class="form-group">
				<label>Quantidade Condutores:</label> <input value="2" type="number" class="form-control" name="condutores">
			</div>

						<div class="form-group">
				<label>Extra:</label>
				<div class="form-check-inline">
					<label class="form-check-label"> <input type="checkbox"
						name="disciplinas" value="FUND" class="form-check-input">Câmbio Automático
					</label>
				</div>

				<div class="form-check-inline">
					<label class="form-check-label"> <input type="checkbox"
						name="disciplinas" value="NUV" class="form-check-input">Ar-condicionado
					</label>
				</div>

	<hr>
			<button type="submit">Cadastrar</button>
		</form>
	</div>
<a href="/"><button>Voltar</button></a>
	
</body>
</html>