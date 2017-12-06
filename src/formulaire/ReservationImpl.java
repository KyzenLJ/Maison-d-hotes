package formulaire;

import java.util.Date;

public class ReservationImpl implements Reservation {

	private String nom;
	private String prenom;
	private String adresse;
	private String telephone;
	private String email;
	private int nbrPersonne;
	private String regionOrigine;
	private int dureeSejour;
	private Date dateEnregistrement;
	
	@Override
	public String getNom() {
		return nom;
	}
	@Override
	public void setNom(String nom) {
		this.nom = nom;
		
	}
	@Override
	public String getPrenom() {
		return prenom;
	}
	@Override
	public void setPrenom(String prenom) {
		this.prenom = prenom;
		
	}
	@Override
	public String getAdresse() {
		// TODO Auto-generated method stub
		return adresse;
	}
	@Override
	public void setAdresse(String adresse) {
		this.adresse = adresse;
		
	}
	@Override
	public String getTelephone() {
		return telephone;
	}
	@Override
	public void setTelephone(String telephone) {
		this.telephone = telephone;
		
	}
	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
	@Override
	public void setEmail(String email) {
		this.email = email;
		
	}
	@Override
	public int getNbrPersonne() {
		return nbrPersonne;
	}
	@Override
	public void setNbrPersonne(int nbrPersonne) {
		this.nbrPersonne = nbrPersonne;
		
	}
	@Override
	public String getRegionOrigine() {
		// TODO Auto-generated method stub
		return regionOrigine;
	}
	@Override
	public void setRegionOrigine(String regionOrigine) {
		this.regionOrigine = regionOrigine;
		
	}
	@Override
	public int getDureeSejour() {
		// TODO Auto-generated method stub
		return dureeSejour;
	}
	@Override
	public void setDureeSejour(int dureeSejour) {
		this.dureeSejour = dureeSejour;
	}
	@Override
	public Date getDateEnregistrement() {
		// TODO Auto-generated method stub
		return dateEnregistrement;
	}
	@Override
	public void setDateEnregistrement(Date date) {
		this.dateEnregistrement = date;
		
	}
	
	
	}
