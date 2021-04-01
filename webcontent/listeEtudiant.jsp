<%@page import="persistence.entities.TEtudiant"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste etudiant</title>
</head>
<body>
	<h1>Liste etudiant</h1>
	<%
		List<TEtudiant> etudiants = (List<TEtudiant>) request.getAttribute("liste");
	%>

	<table border="solid 1px black">

		<td>code</td>
		<td>nom</td>
		<td>moyenne</td>


		<%
			for (int i = 0; i < etudiants.size(); i++) {
			out.println("<tr>");
			out.println("<td>" + etudiants.get(i).getECode() + " </td>");
			out.println("<td>" + etudiants.get(i).getENom() + "</td>");
			out.println("<td>" + etudiants.get(i).getEMoyenne() + "</td>");
			out.println("</tr>");
		}
		%>
	</table> <br>
	<a href="menu.jsp"> Retour au menu </a>
</body>
</html>