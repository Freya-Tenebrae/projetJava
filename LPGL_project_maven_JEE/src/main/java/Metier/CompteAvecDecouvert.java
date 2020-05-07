package Metier;

public class CompteAvecDecouvert extends Compte {

	double decouvertAutorise;
	
	public CompteAvecDecouvert(String num, double s, double dA) {
		super(num, s);
		decouvertAutorise = dA;
	}
	
	/**************************
	 *    GETTER & SETTER     *
	 **************************/
	
	public void setDecouvertAutorise(Double dA) {
		decouvertAutorise = dA;
	}
	
	public double getDecouvertAutoriese() {
		return decouvertAutorise;
	}
	
	
	/**************************
	 *        FUNCTION        *
	 **************************/
	
	public void debiter(double montant) {
		if ((solde + decouvertAutorise) > montant)
		{
			System.out.println("le compte possède un solde sufisant pour débiter le montant");
			if (dao.updatingSoldeByCompteId(numeroCompte, solde - montant))
			{
				solde = solde - montant;
				System.out.println("la dransaction s'est bien déroulée");
				System.out.println("le solde restant est de " + solde + " euro.");
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
	}	
	
	/**************************
	 *    PRIVATE FUNCTION    *
	 **************************/	
}
