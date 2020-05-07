package Metier;

import java.util.ArrayList;

import Factory.ClientFactory;
import Factory.CompteFactory;
import InterfaceMetier.iBanque;
import InterfacesDao.iCompteDao;

public class Banque implements iBanque{

	Client cl;
	ArrayList<Compte> listeCompte = new ArrayList<Compte>();
	
	public Banque(){

	}
			
	/**************************
	 *    GETTER & SETTER     *
	 **************************/
	
	/**************************
	 *        FUNCTION        *
	 **************************/
	
	public Boolean retrait(String num_Compte, double montant) {
		for (int i = 0; i < listeCompte.size(); i++) {
			if (listeCompte.get(i).getNumeroCompte().equals(num_Compte)) {
				if (listeCompte.get(i).debiter(montant)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public Boolean depot(String num_Compte, double montant) {
		for (int i = 0; i < listeCompte.size(); i++) {
			if (listeCompte.get(i).getNumeroCompte().equals(num_Compte)) {
				if (listeCompte.get(i).crediter(montant)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void ouverture_compte(String nom_Client) {
		cl = ClientFactory.getNewInstance(nom_Client);
		listeCompte = CompteFactory.getNewInstances(cl.getNumeroClient());
		
		System.out.println("le compte du client " + nom_Client + " à l'adresse " + cl.getAdresse() + " à bien été ouvert. y sont liés les comptes :");
		for (int i = 0; i < listeCompte.size(); i++) {
			System.out.println("- " + listeCompte.get(i).getNumeroCompte());
		}
	}
	
	public Boolean consultation(String num_Compte) {
		for (int i = 0; i < listeCompte.size(); i++) {
			if (listeCompte.get(i).getNumeroCompte().equals(num_Compte)) {
				System.out.println("le compte " + num_Compte + " possède un solde de " + listeCompte.get(i).getSolde() + " euro.");
				return true;
			}
		}
		return false;
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
