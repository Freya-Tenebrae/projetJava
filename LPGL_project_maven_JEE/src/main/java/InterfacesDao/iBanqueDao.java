package InterfacesDao;

import java.rmi.Remote;

public interface iBanqueDao extends Remote{
	/**************************
	 *         GETTER         *
	 **************************/
	public String[] getClientById(String idClient);
	public String[] getListeCompteByClientId(String idClient);
	public double getSoldeCompteById(String idCompte);
	public double getDecouvertCompteById(String idCompte);
	/**************************
	 *         INSERT         *
	 **************************/
	public boolean ajoutClient(String idClient, String nom_client, String adresse);
	public boolean ajoutCompte(String idCompte, String idClient, double solde, double decouvert);
	/**************************
	 *         DELETE         *
	 **************************/
	public boolean retireClientById(String idClient);
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
