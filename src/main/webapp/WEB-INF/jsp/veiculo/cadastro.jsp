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
		<form action="/veiculo/incluir" method="post">
			<div class="form-group">
				<label>Nome:</label> <input type="text" class="form-control"
					placeholder="Digite seu nome..." name="nome">
			</div>

			<div class="form-group">
				<label>E-mail:</label> <input type="email" class="form-control" placeholder="Entre com o seu e-mail..." name="email">
			</div>

			<div class="form-group">
				<label>Idade:</label> <input type="text" class="form-control" name="idade">
			</div>

			<div class="form-group">
				<label>Mensalidade:</label> <input type="text" class="form-control" name="mensalidade">
			</div>

			<!-- value vai me ajudar a encontrar no backend -->
			<div class="form-group">
				<label>Escolaridade:</label>
				<div class="form-check-inline">
					<label class="form-check-label"> <input type="radio"
						name="escolaridade" value="G" class="form-check-input">
						Graduação
					</label>
				</div>

				<div class="form-check-inline">
					<label class="form-check-label"> <input type="radio"
						name="escolaridade" value="E" class="form-check-input">
						Especialização
					</label>
				</div>

				<div class="form-check-inline">
					<label class="form-check-label"> <input type="radio"
						name="escolaridade" value="M" class="form-check-input">
						Mestrado
					</label>
				</div>

				<div class="form-check-inline">
					<label class="form-check-label"> <input type="radio"
						name="escolaridade" value="D" class="form-check-input">
						Doutorado

					</label>
				</div>
			</div>

			<div class="form-group">
				<label>Disciplinas:</label>
				<div class="form-check-inline">
					<label class="form-check-label"> <input type="checkbox"
						name="disciplinas" value="FUND" class="form-check-input">Fundamento
						Java
					</label>
				</div>

				<div class="form-check-inline">
					<label class="form-check-label"> <input type="checkbox"
						name="disciplinas" value="NUV" class="form-check-input">Java
						Nuvem
					</label>
				</div>

				<div class="form-check-inline">
					<label class="form-check-label"> <input type="checkbox"
						name="disciplinas" value="WEB" class="form-check-input">Java
						Web
					</label>
				</div>
			</div>

			<div class="form-group">
				<label>Regiões:</label> <select name="regiao" class="form-control">
					<option value="S">Sul</option>
					<option value="Su">Sudeste</option>
					<option value="N">Norte</option>
					<option value="No">Nordeste</option>
					<option value="C">Centro-Oeste</option>
				</select>
			</div>

			<!-- 	<input type="reset"> // redefine as coisas-->
			<!-- 	<input type="button">executar algo dentro da propria pagina, sem precisar ir no backend -->
			<!-- 	<input type="submit" value="Cadastrar"> //fazer uma requisição no backend	 -->
			<!-- 	<button type="reset"></button> -->
			<!-- 	<button type="button"></button> -->
			<button type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>