package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import formulaire.Reservation;
import formulaire.ReservationImpl;
import formulaire.ReservationManager;

/**
 * Servlet implementation class ReservationServlet
 */
@WebServlet("/ReservationServlet")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ReservationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	ReservationManager resaManager = new ReservationManager();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		// Récupération des réservations
	//	request.setAttribute("réservations", ReservationManager.getInstance().getReservations().values());

		getServletContext().getRequestDispatcher("/listereservations.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// Récupération des informations saisies par l'utilisateur
		// les champs en String
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
	//	Date dateArrivee = request.getParameterValues(dateArrivee);

		// les volets déroulants (Select)
		String nbrPersonne = "";
		int participantSlct = 0;
		if (request.getParameter("participant") != null) {
			nbrPersonne = request.getParameter("participant");
			participantSlct = Integer.parseInt(nbrPersonne);
		} else {
			String message = "Le nombre de participants n'est pas renseigné !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurSaisie.jsp").forward(request, response);
		}

//		String dureeSejour = "";
//		int dureeSlct = 0;
//		try{if (request.getParameter("duree") != null) {
//			dureeSejour = request.getParameter("dureeSejour");
//			dureeSlct = Integer.parseInt(dureeSejour);
//		} else {
//			String message = "La durée du séjour n'est pas renseignée !";
//			request.setAttribute("message", message);
//			getServletContext().getRequestDispatcher("/erreurSaisie.jsp").forward(request, response);
//		}}
//		catch(Exception e) {
//			System.out.println("Bug");
//		}

		String regionOrigine = request.getParameter("region");
		// resultat du radio button
		String typeSejour = request.getParameter("typeSejour");

		// Vérification des informations saisies
		if ((nom == null) || (nom.isEmpty())) {
			String message = "Le nom n'est pas renseigné !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurSaisie.jsp").forward(request, response);
		} else if ((prenom == null) || (prenom.isEmpty())) {
			String message = "Le prenom n'est pas renseigné !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurSaisie.jsp").forward(request, response);
		} else if ((adresse == null) || (adresse.isEmpty())) {
			String message = "L'adresse n'est pas renseignée !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurSaisie.jsp").forward(request, response);
		} else if ((telephone == null) || (telephone.isEmpty())) {
			String message = "Le numéro de téléphone n'est pas renseigné !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurSaisie.jsp").forward(request, response);
		} else if ((email == null) || (email.isEmpty())) {
			String message = "L'adresse mail n'est pas renseignée !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurSaisie.jsp").forward(request, response);
//		} else if ((dateArrivee == null) || (dateArrivee.isEmpty())) {
//			String message = "La date d'arrivée n'est pas renseignée !";
//			request.setAttribute("message", message);
//			getServletContext().getRequestDispatcher("/erreurSaisie.jsp").forward(request, response);
		}

//		else {
//			boolean reservationOk = true;

			// Tout est en règle => Création d'une nouvelle résa
			Reservation newReservation = new ReservationImpl();
			newReservation.setNom(nom);
			newReservation.setPrenom(prenom);
			newReservation.setAdresse(adresse);
			newReservation.setTelephone(telephone);
			newReservation.setEmail(email);
			newReservation.setNbrPersonne(participantSlct);
		//	newReservation.setDureeSejour(dureeSlct);
			newReservation.setRegionOrigine(regionOrigine);
	//		newReservation.setDateEnregistrement(dateArrivee);

			// les checkboxes
			if (request.getParameter("animal") != null) {
				newReservation.setAnimal("Oui");
			} else {
				newReservation.setAnimal("Non");
			}
			if (request.getParameter("parking") != null) {
				newReservation.setParking("Oui");
			} else {
				newReservation.setParking("Non");
			}
			if (request.getParameter("fumeur") != null) {
				newReservation.setFumeur("Oui");
			} else {
				newReservation.setFumeur("Non");
			}
			if (request.getParameter("don") != null) {
				newReservation.setDon("Oui");
			} else {
				newReservation.setDon("Non");
			}

			// radio button
			if (request.getParameter("typeSejour") != null) {
				newReservation.setRegionOrigine(request.getParameter(typeSejour));
			}
			// Ajout réservation à la liste des réservations déjà entrées
//						try {
//							ReservationManager.getInstance().addReservation(newReservation);
//						}
//						catch (Exception e) {
//							// Gestion des exceptions
//							reservationOk = false;
//							request.setAttribute("message", e.getMessage());
//							getServletContext().getRequestDispatcher("/erreurSaisie.jsp").forward(request, response);
//						}
//			if (reservationOk) {

			
			try {
				resaManager.connection();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				resaManager.insertData(nom, prenom);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				resaManager.showData();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			

				request.setAttribute("réservations", newReservation);
				getServletContext().getRequestDispatcher("/listereservations.jsp").forward(request, response);
			}
		}
//	}
//}
