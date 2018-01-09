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
	@Override
	public boolean getAnimal() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setAnimal(String etatCheckBoxAnimal) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean getParking() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setParking(String etatCheckBoxParking) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean getFumeur() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setFumeur(String etatCheckBoxFumeur) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean getDon() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setDon(String etatCheckBoxDon) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getTypeSejour() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setTypeSejour(String typeSejour) {
		// TODO Auto-generated method stub
		
	}
	
	
	}
