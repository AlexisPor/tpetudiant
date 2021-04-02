<%@page import="persistence.entities.TEtudiant"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste etudiant</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
	<h1>Liste etudiant</h1>
	<%
		List<TEtudiant> etudiants = (List<TEtudiant>) request.getAttribute("liste");
	%>

	<table>

		<td>code</td>
		<td>nom</td>
		<td>moyenne</td>


		<c:forEach items="${ liste }" var="i">
			<tr>
				<td>${ i.getCode() }</td>
				<td>${ i.getNom() }</td>
				<td>${ i.getMoyenne() }</td>
			</tr>
			
		</c:forEach>
	</table> <br>
</body>
</html>