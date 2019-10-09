<%@page import="br.edu.infnet.simulacaoapp.app.model.Simulacao"%>
<%@ page contentType="text/html; charset=ISO-8859-1" language="java" pageEncoding="UTF-8" import="java.sql.*" errorPage="" %>

<!-- %@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"% -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
  
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" 
			href="<c:url value="/resources/css/main.css" />" >
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
 integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<meta charset="UTF-8">
<title>Editar Simulação</title>
</head>
<body>
 
   <h2>Editar nome</h2>
   <form action="<c:url value="/simulacoes/update" />" method="post">
	<input type="hidden" value="${simulacao.id}" name="id" >
 <div class="col-md-12 pd-10 container">
   <span>
      <label for="nome"><b>Simulação</b></label><br>
        <input type="text" value="${simulacao.nome}" name="nome" id="nome" size="128" required autofocus>
        <br/>
    </span>
    <span>
    <label for="versao"><b>Versao</b></label><br>
        <input type="number" value="${simulacao.versao}" min="0" name="versao" id="versao" onkeypress="return isNumericKey(event)" size="128" required>
        <br/>
    </span>
    <span>
    <br>
    <div class="custom-control custom-checkbox">  
	<span class="form-check">
		
	    <input type="checkbox" name="versao_final" class="custom-control-input" id="versao_final" <c:if test="${simulacao.versao_final}">checked</c:if>>
	    <label class="custom-control-label" for="versao_final" >É final?</label>
	    
	</span>
		<br>
    </div>
  </div>  
      	<div class="container-fluid">
		<tr>
		 <button type="submit" class="btn btn-success">Salvar</button> 
		 <a href="list""><button type="button" class="btn btn-secondary">Cancelar</button></a>
		</tr>
	</div> 
   </form>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>