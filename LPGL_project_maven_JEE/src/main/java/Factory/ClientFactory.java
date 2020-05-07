package Factory;

import Dao.DaoClient;
import Metier.Client;

public class ClientFactory {
	
	static DaoClient dao = new DaoClient();
	
	public static Client getNewInstance(String nom) {
		String idClient = dao.getIdClientBynom(nom);
		String[] cl = dao.getClientById(idClient);
		Client client = new Client(cl[0], cl[1], cl[2]);
		return client;
	}

}
