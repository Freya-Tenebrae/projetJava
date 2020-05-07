package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import InterfacesDao.iClientDao;
import SGBDConnection.MySqlConnection;

public class DaoClient implements iClientDao {

	private Connection sgbd = null;
	
	public DaoClient(){
		this.sgbd = MySqlConnection.getInstance();
	}
	
	/**************************
	 *         GETTER         *
	 **************************/
	
	public String[] getClientById(String idClient) {
		String[] client = new String[3];
		ResultSet rs = Requete("SELECT * FROM project_joyeux.client c WHERE c.id_client = '" + idClient + "';");
		try
		{
    		if(rs.next())
    			for (int i = 0; i < 3; i++)
    				client[i] = rs.getObject(i+1).toString();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return client;
	}
	
	public String getIdClientBynom(String nomClient) {
		ResultSet rs = Requete("SELECT id_client FROM project_joyeux.client c WHERE c.nom_client = '" + nomClient + "';");
		try
		{
    		if(rs.next())
    			return rs.getObject(1).toString();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return "";
	}
	
	/**************************
	 *         INSERT         *
	 **************************/
	
	public boolean ajoutClient(String idClient, String nom_client, String adresse) {
		return executeUpdate("INSERT INTO `project_joyeux`.`client` (`id_client`, `nom_client`, `adresse`) "
				             + "VALUES ('" + idClient + "', '" + nom_client + "', '" + adresse + "');");
	}
	
	/**************************
	 *         DELETE         *
	 **************************/
	
	public boolean retireClientById(String idClient) {
		return executeUpdate("DELETE FROM `project_joyeux`.`client` "
				             + "WHERE (`id_client` = '" + idClient +"');");
	}
	
	/**************************
	 *         UPDATE         *
	 **************************/

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
}
