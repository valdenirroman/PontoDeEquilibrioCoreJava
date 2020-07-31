<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Empresas</title>
</head>
<body>
	
	
	
	<form action="/pontodeequilibrio/novaEmpresa" method="POST">
	
	nome: <input type="text" name="nome">
		
		<input type="submit"/>
		
	</form>

</body>
</html>