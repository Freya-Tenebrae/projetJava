package InterfaceMetier;

public interface iCompte {
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
	public boolean debiter(double montant);
	public boolean crediter(double montant);
	/**************************
	 *    PRIVATE FUNCTION    *
	 **************************/
}
