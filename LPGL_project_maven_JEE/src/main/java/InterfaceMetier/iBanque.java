package InterfaceMetier;

public interface iBanque {
	/**************************
	 *    GETTER & SETTER     *
	 **************************/
	/**************************
	 *        FUNCTION        *
	 **************************/
	public Boolean retrait(String num_Compte, double montant);
	public Boolean depot(String num_Compte, double montant);
	public void ouverture_compte(String nom_Client);
	public Boolean consultation(String num_Compte);
	public double conversionFromEuro(double montant);
	public double conversionToEuro(double montant);
	/**************************
	 *    PRIVATE FUNCTION    *
	 **************************/
}