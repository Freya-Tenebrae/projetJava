package testDao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import Dao.DaoClient;

public class testDaoClient {
	
	DaoClient dao = new DaoClient();
	
	@Test
	public void testgetClientByIdExistant() {
		String[] client = new String[3];
		client[0] = "cl01";
		client[1] = "Célia";
		client[2] = "3 rue ferdinand guepratte, ancy sur moselle 57130";
		assertEquals(dao.getClientById("cl01")[0], client[0]);
		assertEquals(dao.getClientById("cl01")[1], client[1]);
		assertEquals(dao.getClientById("cl01")[2], client[2]);
	}
	
	@Test
	public void testgetClientByIdExistant2() {
		String[] client = new String[3];
		client[0] = "cl03";
		client[1] = "Freya";
		client[2] = "5 rue saint félix, maizière les mets 57280";
		assertEquals(dao.getClientById("cl03")[0], client[0]);
		assertEquals(dao.getClientById("cl03")[1], client[1]);
		assertEquals(dao.getClientById("cl03")[2], client[2]);
	}
	
	@Test
	public void testgetClientByIdExistantMaisNonAssociés() {
		String[] client = new String[3];
		client[0] = "cl03";
		client[1] = "Freya";
		client[2] = "5 rue saint félix, maizière les mets 57280";
		assertNotEquals(dao.getClientById("cl02")[0], client[0]);
		assertNotEquals(dao.getClientById("cl02")[1], client[1]);
		assertNotEquals(dao.getClientById("cl02")[2], client[2]);
	}
	
	@Test
	public void testgetClientByIdNonExistant() {
		String[] client = new String[3];
		client[0] = "cl73";
		client[1] = "NoName";
		client[2] = "42 place de la lune, mars";
		assertNotEquals(dao.getClientById("cl73")[0], client[0]);
		assertNotEquals(dao.getClientById("cl73")[1], client[1]);
		assertNotEquals(dao.getClientById("cl73")[2], client[2]);
	}
	
	@Test
	public void testgetIdClientByNameExistant1() {
		assertEquals(dao.getIdClientBynom("Célia"), "cl01");
	}
	
	@Test
	public void testgetIdClientByNameExistant2() {
		assertEquals(dao.getIdClientBynom("Freya"), "cl03");
	}
	
	@Test
	public void testgetIdClientByNameExistantMaisNonAssociés() {
		assertNotEquals(dao.getIdClientBynom("Freya"), "cl02");
	}
	
	@Test
	public void testgetIdClientByNameNonExistant() {
		assertNotEquals(dao.getIdClientBynom("NoName"), "cl73");
	}
	
	@Test
	public void testAjoutDUnCompteAvecIdDejaExistant1() {
		assertFalse(dao.ajoutClient("cl01","nomFictif", "AdresseFictive"));
	}
	
	@Test
	public void testAjoutDUnCompteAvecIdDejaExistant2() {
		assertFalse(dao.ajoutClient("cl03","nomFictif", "AdresseFictive"));
	}
	
	@Test
	public void testAjoutDUnCompteAvecNomDejaExistant1() {
		assertFalse(dao.ajoutClient("cl73","Célia", "AdresseFictive"));
	}
	
	@Test
	public void testAjoutDUnCompteAvecNomDejaExistant2() {
		assertFalse(dao.ajoutClient("cl73","Freya", "AdresseFictive"));
	}
	
	@Test
	public void testAjoutDUnCompteCorrectPuisSupression() {
		assertTrue(dao.ajoutClient("cl73","NoName", "42 place de la lune, mars"));
		assertTrue(dao.retireClientById("cl73"));
	}
	
	@Test
	public void testSupressionDUnCompteInnexistant() {
		assertFalse(dao.retireClientById("cl96"));
	}
}
