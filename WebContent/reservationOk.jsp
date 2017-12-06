<%@page import="formulaire.Reservation"%>
<%@ page language="java" contentType="text/html; TUF8"
    pageEncoding="UTF8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; UTF8">
	<title>Réservation enregistrée</title>
		<link rel="stylesheet" type="text/css" href="css/style.css">
	</head>
	<body style="text-align:center;">
		<% Reservation reservation = (Reservation) request.getAttribute("reservation"); %>
		<h1>Bravo</h1>
		<p>Votre réservation a tété renregistrée à <%=reservation.getDateEnregistrement()%> avec les informations suivantes :</p>
		<table class="resultTable">
			<tr>
				<td>Nom</td>
				<td><%=reservation.getNom()%></td>
			</tr>
			<tr>
				<td>Prénom</td>
				<td><%=reservation.getPrenom()%></td>
			</tr>
			<tr>
				<td>Téléphone</td>
				<td><%=reservation.getPrenom()%></td>
			</tr>
			<tr>
				<td>Durée du séjour</td>
				<td><%=reservation.getDureeSejour()%></td>
			</tr>
		</table>

	</body>
</html>