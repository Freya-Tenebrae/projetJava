package Modeles;

public class CompteAvecDecouvert extends Compte {

	double decouvertAutorise;
	
	CompteAvecDecouvert(String num, double s, double dA) {
		super(num, s);
		decouvertAutorise = dA;
	}
	
	public void setDecouvertAutorise(Double dA) {
		decouvertAutorise = dA;
	}
	
	public double getDecouvertAutoriese() {
		return decouvertAutorise;
	}
	
	public void debiter(double montant) {
		
	}
	
}
