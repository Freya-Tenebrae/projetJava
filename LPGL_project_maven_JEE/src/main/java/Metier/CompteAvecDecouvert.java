package Metier;

public class CompteAvecDecouvert extends Compte {

	double decouvertAutorise;
	
	CompteAvecDecouvert(String num, double s, double dA) {
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
		//test si le compte peut être créditer (en prenan compte la qtt de découvert)
		//test si l'opération en dao s'est bien effectuer
		//affiche le nouveau solde
	}
	
	
	/**************************
	 *    PRIVATE FUNCTION    *
	 **************************/
	
}
