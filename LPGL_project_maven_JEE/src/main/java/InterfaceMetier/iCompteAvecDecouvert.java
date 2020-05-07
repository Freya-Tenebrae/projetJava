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
	public void debiter(double montant);
	/**************************
	 *    PRIVATE FUNCTION    *
	 **************************/
}
