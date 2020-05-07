package InterfaceModeles;

public interface iBanque {
	/**************************
	 *    GETTER & SETTER     *
	 **************************/
	/**************************
	 *        FUNCTION        *
	 **************************/
	public void retrait(String num_Compte, String nom_Client, double montant);
	public void depot(String num_Compte, String nom_Client, double montant);
	public void ouverture_compte(String nom_Client);
	public void consultation(String num_Compte);
	public double conversionFromEuro(double montant);
	public double conversionToEuro(double montant);
	/**************************
	 *    PRIVATE FUNCTION    *
	 **************************/
}