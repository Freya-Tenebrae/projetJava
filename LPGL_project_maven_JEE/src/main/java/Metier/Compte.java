package Metier;

public class Compte {
	
	double solde;
	String numeroCompte;
	
	Compte(String num, double s){
		numeroCompte = num;
		solde = s;
	}
	
	/**************************
	 *    GETTER & SETTER     *
	 **************************/
	
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
	
	/**************************
	 *        FUNCTION        *
	 **************************/
	
	public void debiter(double montant) {
		//test si le compte peut être créditer
		//test si l'opération en dao s'est bien effectuer
		//affiche le nouveau solde
	}
	
	public void crediter(double montant) {
		//test si l'opération en dao s'est bien effectuer
		//affiche le nouveau solde
	}
	
	/**************************
	 *    PRIVATE FUNCTION    *
	 **************************/

}
