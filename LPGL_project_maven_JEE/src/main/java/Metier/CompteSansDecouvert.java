package Metier;

public class CompteSansDecouvert extends Compte {
	
	public CompteSansDecouvert(String num, double s) {
		super(num, s);
	}
	
	/**************************
	 *    GETTER & SETTER     *
	 **************************/
	
	/**************************
	 *        FUNCTION        *
	 **************************/

	public void debiter(double montant) {
		if (solde > montant)
		{
			System.out.println("le compte possède un solde sufisant pour débiter le montant");
			if (dao.updatingSoldeByCompteId(numeroCompte, solde - montant))
			{
				solde = solde - montant;
				System.out.println("la transaction s'est bien déroulée");
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
