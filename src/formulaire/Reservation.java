package formulaire;

import java.util.Date;

public interface Reservation {
	public String getNom();
	public void setNom(String nom);
	
	public String getPrenom();
	public void setPrenom(String prenom);
	
	public String getAdresse();
	public void setAdresse(String adresse);
	
	public String getTelephone();
	public void setTelephone(String telephone);
	
	public String getEmail();
	public void setEmail(String email);
	
	public int getNbrPersonne();
	public void setNbrPersonne(int nbrPersonne);
	
	public String getRegionOrigine();
	public void setRegionOrigine(String regionOrigine);
	
	public int getDureeSejour();
	public void setDureeSejour(int dureeSejour);
	
	public Date getDateEnregistrement();
	public void setDateEnregistrement(Date date);
	
	public boolean getAnimal();
	public void setAnimal(String etatCheckBoxAnimal);
	
	public boolean getParking();
	public void setParking(String etatCheckBoxParking);
	
	public boolean getFumeur();
	public void setFumeur(String etatCheckBoxFumeur);
	
	public boolean getDon();
	public void setDon(String etatCheckBoxDon);
	
	public String getTypeSejour();
	public void setTypeSejour(String typeSejour);
}
