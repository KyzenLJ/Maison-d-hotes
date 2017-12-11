package controller;

import java.io.IOException;
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	//	 Récupération des réservations
		request.setAttribute("réservations", ReservationManager.getInstance().getReservations().values());

		getServletContext().getRequestDispatcher("/listereservations.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		// Récupération des informations saisies par l'utilisateur
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		boolean etatCheckBoxAnimal = request.getParameter( "animal" ) != null;
		boolean etatCheckBoxParking = request.getParameter( "parking" ) != null;
		boolean etatCheckBoxFumeur = request.getParameter( "fumeur" ) != null;
		boolean etatCheckBoxDon = request.getParameter( "don" ) != null;
		int nbrPersonne = request.getParameter();
		int dureeSejour = request.getParameter("duree");

		// Tout est en règle => Création d'une nouvelle résa
		Reservation newReservation = new ReservationImpl();
		newReservation.setNom(nom);
		newReservation.setPrenom(prenom);
		newReservation.setAdresse(adresse);
		newReservation.setTelephone(telephone);
		newReservation.setEmail(email);
		newReservation.setAnimal(etatCheckBoxAnimal);
		newReservation.setParking(etatCheckBoxParking);
		newReservation.setFumeur(etatCheckBoxFumeur);
		newReservation.setDon(etatCheckBoxDon);
		
		
		request.setAttribute("réservations",newReservation);
		getServletContext().getRequestDispatcher("/listereservations.jsp").forward(request, response);
	}

}
