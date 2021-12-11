<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/app">Appaluguelcarros</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/home">Home</a></li>



      <c:if test="${not empty user}">
      <li class="active"><a href="/usuarios">Usuário</a></li>
      <li class="active"><a href="/clientes">Cliente</a></li>
      <li class="active"><a href="/veiculos">Veiculos</a></li>
      <li class="active"><a href="/locacoes">Aluguel</a></li>
 	<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Cadastros <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="/economico">Econômico</a></li>
          <li><a href="/suvs">SUV</a></li>
          <li><a href="/caminhoes">Caminhão</a></li>
        </ul>
      </li>
      </c:if>
      
<%--       <c:if test="${not empty user}">   --%>
<!--       <li><a href="/usuarios">Usuário</a></li> -->
<%--     </c:if> --%>
    
    </ul>
    <ul class="nav navbar-nav navbar-right">
      
      
       <c:if test="${empty user}">
      <li><a href="/usuario"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      </c:if>
      
      
      <c:if test="${empty user}">
      <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </c:if>	
      
      <c:if test="${not empty user}">
      	<li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout, ${user.nome}</a></li>
   	  </c:if>
    </ul>
  </div>
</nav>