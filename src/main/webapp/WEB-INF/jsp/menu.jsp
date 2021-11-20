<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Appaluguelcarros</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
<!--       <li class="active"><a href="/veiculos">Alunos</a></li> -->
<!--       <li class="active"><a href="/usuarios">Usuário</a></li> -->

      <c:if test="${not empty user}">
 	<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Cadastros <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="/economico">Econômico</a></li>
          <li><a href="/suv">SUV</a></li>
          <li><a href="/caminhao">Caminhão</a></li>
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