<%@page import="java.util.Collection"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="formulaire.Reservation"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF8">
<title>Réservations actives</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body style="text-align: center;">
	request
	<h1>Liste des réservations</h1>

	<table border=1 class="reservationTable">
		<thead>
			<tr>
				<th>Nom</th>
				<th>Prenom</th>
				<th>Téléphone</th>
				<th>Adresse</th>
				<th>e-mail</th>
				<th>Animal de compagnie</th>
				<th>Parking</th>
				<th>Fumeur</th>
				<th>Don</th>
				<!-- <th>Durée du séjour</th> -->
				<th>Nombre de participants</th>
				<th>Région d'origine</th>
				<th>Type de séjour</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><%=request.getParameter("nom")%></td>
				<td><%=request.getParameter("prenom")%></td>
				<td><%=request.getParameter("telephone")%></td>
				<td><%=request.getParameter("adresse")%></td>
				<td><%=request.getParameter("email")%></td>
				<td><%=request.getParameter("animal")%></td>
				<td><%=request.getParameter("parking")%></td>
				<td><%=request.getParameter("fumeur")%></td>
				<td><%=request.getParameter("don")%></td>
				<%-- <td><%=request.getParameter("duree")%></td> --%>
				<td><%=request.getParameter("participant")%></td>
				<td><%=request.getParameter("region")%></td>
				<td><%=request.getParameter("typeSejour")%></td>
			</tr>
		</tbody>

	</table>
	<a href="Inscription.html">Retour au formulaire</a>
</body>
</html>