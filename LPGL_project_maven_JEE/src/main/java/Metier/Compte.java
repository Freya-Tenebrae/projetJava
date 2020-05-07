package Metier;

import Dao.DaoCompte;

public class Compte {
	
	double solde;
	String numeroCompte;
	DaoCompte dao;
	
	public Compte(String num, double s){
		numeroCompte = num;
		solde = s;
		dao = new DaoCompte();
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
	
	public boolean debiter(double montant) {
		if (solde > montant)
		{
			System.out.println("le compte possède un solde sufisant pour débiter le montant");
			if (dao.updatingSoldeByCompteId(numeroCompte, solde - montant))
			{
				solde = solde - montant;
				System.out.println("la transaction s'est bien déroulée");
				System.out.println("le solde restant est de " + solde + " euro.");
				return true;
			}
			else
			{
				System.out.println("une erreur à eu lieu au niveau de la base de donnée, la transaction est annulée");
			}
		}
		else
		{
			System.out.println("le compte ne possède pas un solde sufisant pour débiter le montant");
		}
		return false;
	}
	
	public boolean crediter(double montant) {
		if (dao.updatingSoldeByCompteId(numeroCompte, solde + montant))
		{
			solde = solde + montant;
			System.out.println("la transaction s'est bien déroulée");
			System.out.println("le solde restant est de " + solde + " euro.");
			return true;
		}
		else
		{
			System.out.println("une erreur à eu lieu au niveau de la base de donnée, la transaction est annulée");
		}
		return false;
	}
	
	/**************************
	 *    PRIVATE FUNCTION    *
	 **************************/

}
