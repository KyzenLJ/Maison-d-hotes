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
<body style="text-align:center;">
	request
		<h1>Liste des réservations</h1>
			
		<table border=1 class="reservationTable">
		<tr>
			<th>Nom</th>
			<th>Prenom</th>
			<th>Téléphone</th>
			<th>Durée du Séjour</th>
			<th>Date</th>
		</tr>
		<td> ${newReservation.prenom}</td>
<%-- 		<%
			SimpleDateFormat dateFormater = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Collection<Reservation> listReservations = (Collection<Reservation>) request.getAttribute("reservations");
			if(listReservations != null){
				Iterator it = listReservations.iterator() ;
			    while (it.hasNext()){
			    	Reservation serveur=(Reservation) it.next() ;
		%>
					<tr>
						<td><%=serveur.getNom()%></td>
						<td><%=serveur.getPrenom()%></td>
						<td><%=serveur.getTelephone()%></td>
						<td><%=serveur.getDureeSejour()%></td>
						<td><%=dateFormater.format(serveur.getDateEnregistrement())%></td>
					</tr>
		<%      }
			}
		%> --%>
		</table>
		<a href="Inscription.html" >Retour au formulaire</a>
</body>
</html>