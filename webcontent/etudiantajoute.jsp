<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Felicitation, l'etudiant
	<%=request.getAttribute("nom")%>
	avec l'id
	<%=request.getAttribute("code")%>
	,a bien ete ajoute.
	<br>
	<a href="ajout.html"> Ajouter etudiant</a>
	<br>
	<a href="menu.jsp"> Retour au menu</a>
</body>
</html>