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
	//	 Récupération des r�servations
		request.setAttribute("r�servations", ReservationManager.getInstance().getReservations().values());

		getServletContext().getRequestDispatcher("/istereservations.jsp").forward(request, response);
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

		// Tout est en règle => Création du nouveau ticket
		Reservation newReservation = new ReservationImpl();
		newReservation.setNom(nom);
		newReservation.setPrenom(prenom);
		newReservation.setAdresse(adresse);
		newReservation.setTelephone(telephone);
		newReservation.setEmail(email);
		
		request.setAttribute("r�servations",newReservation);
		getServletContext().getRequestDispatcher("/listereservations.jsp").forward(request, response);
	}

}
