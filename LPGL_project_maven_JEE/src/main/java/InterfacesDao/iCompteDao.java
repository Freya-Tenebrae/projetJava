package InterfacesDao;

public interface iCompteDao {
	/**************************
	 *         GETTER         *
	 **************************/
	public String[] getListeCompteByClientId(String idClient);
	public double getSoldeCompteById(String idCompte);
	public double getDecouvertCompteById(String idCompte);
	/**************************
	 *         INSERT         *
	 **************************/
	public boolean ajoutCompte(String idCompte, String idClient, double solde, double decouvert);
	/**************************
	 *         DELETE         *
	 **************************/
	public boolean retireCompteById(String idCompte);
	public boolean retireCompteByClientId(String idClient);
	/**************************
	 *         UPDATE         *
	 **************************/
	public boolean updatingSoldeByCompteId(String idCompte, double soldeRemaining);
	/**************************
	 *    PRIVATE FUNCTION    *
	 **************************/
}
