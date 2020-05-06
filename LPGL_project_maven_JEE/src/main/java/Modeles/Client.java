package Modeles;

public class Client {
	
	String numeroClient;
	String adresse;
	String nom;
	
	public Client(String num_Client, String ad, String nm){
		numeroClient = num_Client;
		adresse = ad;
		nom = nm;
	}
	
	public void setNumeroClient(String num_Client) {
		numeroClient = num_Client;
	}
	
	public String getNumeroClient() {
		return numeroClient;
	}
	
	public void setAdresse(String ad) {
		adresse = ad;
	}
	
	public String getAdresse() {
		return adresse ;
	}
	
	public void setNom(String nm) {
		nom = nm;
	}
	
	public String getNom() {
		return nom;
	}
}
