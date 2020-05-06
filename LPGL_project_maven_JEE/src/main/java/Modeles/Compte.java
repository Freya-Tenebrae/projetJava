package Modeles;

public class Compte {
	
	double solde;
	String numeroCompte;
	
	Compte(String num, double s){
		numeroCompte = num;
		solde = s;
	}
	
	public void setNumeroCompte(String num) {
		numeroCompte = num;
	}
	
	public String getNumeroCompte() {
		return numeroCompte;
	}
	
	public void setSolde(double s) {
		solde = s;
	}
	
	public double getSolde() {
		return solde;
	}
	
	public void debiter(double montant) {
		
	}
	
	public void crediter(double montant) {
		
	}

}
