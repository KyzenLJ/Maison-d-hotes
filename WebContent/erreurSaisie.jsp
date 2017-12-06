<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Erreur de saisie</title>
</head>
<body>
<h1>Erreur de saisie</h1>
		<p>Les champs suivants sont mal renseignés :</p>
		<p class="error"><%=request.getAttribute("message") %></p>
		<p>Merci de vérifier les informations qui ont été saisie.</p>
		
		<%@include file="/Inscription.html" %>
</body>
</html>