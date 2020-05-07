package Metier;

import java.util.ArrayList;

import Factory.ClientFactory;
import Factory.CompteFactory;

public class Banque {
	
	ClientFactory clFact;
	ArrayList<CompteFactory> numCompte = new ArrayList<CompteFactory>();
			
	/**************************
	 *    GETTER & SETTER     *
	 **************************/
	
	/**************************
	 *        FUNCTION        *
	 **************************/
	
	public void retrait(String num_Compte, String nom_Client, double montant) {
		
	}
	
	public void depot(String num_Compte, String nom_Client, double montant) {
		
	}
	
	public void ouverture_compte(String nom_Client) {
		
	}
	
	public void consultation(String num_Compte) {
		
	}
	
	public double conversionFromEuro(double montant) {
		return montant;
		
	}
	
	public double conversionToEuro(double montant) {
		return montant;
		
	}
	
	/**************************
	 *    PRIVATE FUNCTION    *
	 **************************/

}
