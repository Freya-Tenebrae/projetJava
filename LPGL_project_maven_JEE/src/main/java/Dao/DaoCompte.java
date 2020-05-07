package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import InterfacesDao.iCompteDao;
import SGBDConnection.MySqlConnection;

public class DaoCompte implements iCompteDao {

	private Connection sgbd = null;
	
	DaoCompte(){
		this.sgbd = MySqlConnection.getInstance();
	}
	
	/**************************
	 *         GETTER         *
	 **************************/
	
	public String[] getListeCompteByClientId(String idClient) {
		int numberOfCompteForThisId = getNombreCompteByClientId(idClient);
		String[] listIdCompte = new String[numberOfCompteForThisId];
		ResultSet rs = Requete("SELECT id_compte FROM project_joyeux.compte c WHERE c.id_client = '" + idClient + "';");
		try
		{
    		for (int i = 0; i < numberOfCompteForThisId; i++)
    			if(rs.next())
    				listIdCompte[i] = rs.getObject(i+1).toString();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return listIdCompte;
	}

	public double getSoldeCompteById(String idCompte) {
		ResultSet rs = Requete("SELECT solde_actuel FROM project_joyeux.compte where id_compte = '" + idCompte + "';");
		try
		{
    		if(rs.next())
    			return Double.parseDouble(rs.getObject(1).toString());
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return 0;
	}

	public double getDecouvertCompteById(String idCompte) {
		ResultSet rs = Requete("SELECT decouvert FROM project_joyeux.compte where id_compte = '" + idCompte + "';");
		try
		{
    		if(rs.next())
    			return Double.parseDouble(rs.getObject(1).toString());
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	
	/**************************
	 *         INSERT         *
	 **************************/
	
	public boolean ajoutCompte(String idCompte, String idClient, double solde, double decouvert) {
		return executeUpdate("INSERT INTO `project_joyeux`.`compte` (`id_compte`, `id_client`, `solde_actuel`, `decouvert`) "
				             + "VALUES ('" + idCompte + "', '" + idClient + "', '" + solde + "', '" + decouvert + "');");
	}
	
	/**************************
	 *         DELETE         *
	 **************************/
	
	public boolean retireCompteById(String idCompte) {
		return executeUpdate("DELETE FROM `project_joyeux`.`compte` "
				             + "WHERE (`id_compte` = '" + idCompte +"');");
	}
	
	public boolean retireCompteByClientId(String idClient) {
		return executeUpdate("DELETE FROM `project_joyeux`.`compte` "
			          	     + "WHERE (`id_client` = '" + idClient +"');");
	}
	
	/**************************
	 *         UPDATE         *
	 **************************/

	public boolean updatingSoldeByCompteId(String idCompte, double soldeRemaining) {
		return executeUpdate("UPDATE `project_joyeux`.`compte` SET `solde_actuel` = '" + soldeRemaining + "' "
				             + "WHERE (`id_compte` = '" + idCompte + "');");
	}
	
	/**************************
	 *    PRIVATE FUNCTION    *
	 **************************/
	
	private ResultSet Requete(String query)
	{
		ResultSet rs = null;
		try {
			rs = sgbd.createStatement().executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	private boolean executeUpdate(String query) {
		try 
		{
			Statement st;
			st = sgbd.createStatement();
			if (st.executeUpdate(query) == 1)
			return true;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return false;
	}
	
	private int getNombreCompteByClientId(String idClient) {
		ResultSet rs = Requete("SELECT count(*) FROM project_joyeux.compte where id_client = '" + idClient + "';");
		try
		{
    		if(rs.next())
    			return Integer.parseInt(rs.getObject(1).toString());
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return 0;
	}
}
