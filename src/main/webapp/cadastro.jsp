<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Usu�rio</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
  <form action="cadastro" method="post">
    <div class="form-group">
      <label>Nome:</label>
      <input value="teste da silva" type="text" class="form-control" placeholder="Entre com o seu nome" name="nome">
    </div>
    <div class="form-group">
      <label>Email:</label>
      <input value="t@t.com" type="email" class="form-control" placeholder="Entre com o e-mail..." name="email">
    </div>
    <div class="form-group">
      <label>Senha:</label>
      <input type="password" class="form-control" placeholder="Entre com a sua senha..." name="senha">
    </div>
    <div class="alert alert-warning">
  	<strong>Aten��o!</strong> A senha padr�o � 123.
	</div>
    <button type="submit" class="btn btn-primary">Cadastrar Usu�rio</button>
  </form>
</body>
</html>