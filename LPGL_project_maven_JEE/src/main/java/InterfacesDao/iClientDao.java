package InterfacesDao;

public interface iClientDao {
	/**************************
	 *         GETTER         *
	 **************************/
	public String[] getClientById(String idClient);
	public String getIdClientBynom(String nomClient);
	/**************************
	 *         INSERT         *
	 **************************/
	public boolean ajoutClient(String idClient, String nom_client, String adresse);
	/**************************
	 *         DELETE         *
	 **************************/
	public boolean retireClientById(String idClient);
	/**************************
	 *         UPDATE         *
	 **************************/
	/**************************
	 *    PRIVATE FUNCTION    *
	 **************************/
}
