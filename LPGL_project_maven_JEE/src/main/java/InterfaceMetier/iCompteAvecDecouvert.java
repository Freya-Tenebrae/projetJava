package InterfaceMetier;

public interface iCompteAvecDecouvert {
	/**************************
	 *    GETTER & SETTER     *
	 **************************/
	public void setDecouvertAutorise(Double dA);
	public double getDecouvertAutoriese();
	/**************************
	 *        FUNCTION        *
	 **************************/
	public boolean debiter(double montant);
	/**************************
	 *    PRIVATE FUNCTION    *
	 **************************/
}
