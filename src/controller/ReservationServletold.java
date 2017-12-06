package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import formulaire.Reservation;
import formulaire.ReservationImpl;
import formulaire.ReservationManager;

/**
 * Servlet implementation class ReservationServlet
 */
 @WebServlet("/reservation")
public class ReservationServletold {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservationServletold() {
        super();
    }

	/**
	 * La requète GET renvoie la liste de tous les tickets actifs dans la JSP d'affichage
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// Récupération des r�servations
		request.setAttribute("r�servations", ReservationManager.getInstance().getReservations().values());
		
		getServletContext().getRequestDispatcher("/listereservations.jsp").forward(request, response);
	}

	/**
	 * La requête POST valide les données envoyé et crée un nouveau ticket qui sera stocké
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Récupération des informations saisies par l'utilisateur
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		
		
		// Vérification des informations saisies
		if((nom == null) || (nom.isEmpty()))
		{
			String message = "Le nom n'est pas renseigné !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurSaisie.jsp").forward(request, response);
		}
		else if((prenom == null) || (prenom.isEmpty()))
		{
			String message = "Le prenom n'est pas renseigné !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurSaisie.jsp").forward(request, response);
		}
		else if((adresse == null) || (adresse.isEmpty()))
		{
			String message = "L'adresse n'est pas renseignée !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurSaisie.jsp").forward(request, response);
		}
		else if((telephone == null) || (telephone.isEmpty()))
		{
			String message = "Le num�ro de t�l�phone n'est pas renseigné !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurSaisie.jsp").forward(request, response);
		}
		else if((email == null) || (email.isEmpty()))
		{
			String message = "L'adresse mail n'est pas renseignée !";
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/erreurSaisie.jsp").forward(request, response);
		}
		else
		{
			boolean enregistrementOk = true;
			
			// Tout est en règle => Création du nouveau ticket
			Reservation newReservation = new ReservationImpl();
			newReservation.setNom(nom);
			newReservation.setPrenom(prenom);
			newReservation.setAdresse(adresse);
			newReservation.setTelephone(telephone);
			newReservation.setEmail(email);
			
			// Ajout du ticket à la liste des tickets déjà entrés
//			try {
//				ReservationManager.getInstance().addReservation(newReservation);
//			}
//			catch (Exception e) {
//				// Gestion des exceptions
//				reservationOk = false;
//				request.setAttribute("message", e.getMessage());
//				getServletContext().getRequestDispatcher("/erreurSaisie.jsp").forward(request, response);
//			}
//			
//			if(reservationOk)
//			{
//				// L'ajout du ticket s'est bien passé => Affichage de la page de récapitulation
//				request.setAttribute("reservation", newReservation);
//				getServletContext().getRequestDispatcher("/reservationOk.jsp").forward(request, response);
//			}	
		}
	}

	private ServletRequest getServletContext() {
		// TODO Auto-generated method stub
		return null;
	}

}
