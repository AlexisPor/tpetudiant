<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>

	Felicitation, l'etudiant
	<%=request.getAttribute("nom")%>
	avec l'id
	<%=request.getAttribute("code")%>
	,a bien ete ajoute.
	<br>

</body>
</html>