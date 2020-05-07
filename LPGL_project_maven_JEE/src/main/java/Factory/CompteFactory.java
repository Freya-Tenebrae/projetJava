package Factory;

import java.util.ArrayList;

import Dao.DaoCompte;
import Metier.Compte;
import Metier.CompteAvecDecouvert;
import Metier.CompteSansDecouvert;

public class CompteFactory {
	
	static DaoCompte dao = new DaoCompte();
	
	public static Compte getNewInstance(String num) {
		double decouvert = dao.getDecouvertCompteById(num);
		Compte compte;
		if (decouvert == 0)
		{
			compte = new CompteSansDecouvert(num, dao.getSoldeCompteById(num));
		}
		else
		{
			compte = new CompteAvecDecouvert(num, dao.getSoldeCompteById(num), decouvert);
		}
		return compte;
	}
	
	public static ArrayList<Compte> getNewInstances(String IdClient) {
		ArrayList<Compte> ListeCompte = new ArrayList<Compte>();
		String[] listeIdcompte = dao.getListeCompteByClientId(IdClient);
		int numberofCompte = listeIdcompte.length;
		for (int i = 0; i < numberofCompte; i++)
		{
			ListeCompte.add(getNewInstance(listeIdcompte[i]));
		}
		return ListeCompte;
	}
}
