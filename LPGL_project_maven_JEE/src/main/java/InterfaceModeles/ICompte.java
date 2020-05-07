package InterfaceModeles;

public interface ICompte {
	/**************************
	 *    GETTER & SETTER     *
	 **************************/
	public void setNumeroCompte(String num);
	public String getNumeroCompte();
	public void setSolde(double s);
	public double getSolde();
	/**************************
	 *        FUNCTION        *
	 **************************/
	public void debiter(double montant);
	public void crediter(double montant);
	/**************************
	 *    PRIVATE FUNCTION    *
	 **************************/
}
