<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	F�licitation,<%=request.getAttribute("nom")%>
	,vous �tes admis
	<br>
	<a href="formulaire.html"> Retourner au Formulaire </a>
	<br>
	<a href="menu.jsp"> Retour au menu </a>
</body>
</html>