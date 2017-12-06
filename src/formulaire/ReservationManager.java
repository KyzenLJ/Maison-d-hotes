package formulaire;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ReservationManager {
	
	private final static ReservationManager INSTANCE = new ReservationManager();
	private final Map<String, Reservation> reservations = new HashMap<String, Reservation>();
	
	private ReservationManager(){
	}
	
	public static ReservationManager getInstance() {
		return INSTANCE;
	}
	
	public Map<String, Reservation> getReservations(){
		return reservations;
	}
	
//	public void addTicket(Reservation reservation) throws Exception{
//		if(reservations.containsKey(reservation.getDateEnregistrement()))
//			throw new Exception("Cette date est déjà réservée !");
//		
//		reservation.setDateEnregistrement(new Date());
//		reservations.put(reservation.getDateEnregistrement(), reservation);
//	}
}
