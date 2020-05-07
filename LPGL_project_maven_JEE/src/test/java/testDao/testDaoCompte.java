package testDao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import Dao.DaoCompte;

public class testDaoCompte {
	
	DaoCompte dao = new DaoCompte();

	@Test
	public void testgetListeCompteByClientIdExistant1() {
		String[] compteId = new String[4];
		compteId[0] = "C01";
		compteId[1] = "C04";
		compteId[2] = "C06";
		compteId[3] = "C07";
		assertEquals(dao.getListeCompteByClientId("cl01")[0], compteId[0]);
		assertEquals(dao.getListeCompteByClientId("cl01")[1], compteId[1]);
		assertEquals(dao.getListeCompteByClientId("cl01")[2], compteId[2]);
		assertEquals(dao.getListeCompteByClientId("cl01")[3], compteId[3]);
	}
	
	@Test
	public void testgetListeCompteByClientIdExistant2() {
		String[] compteId = new String[1];
		compteId[0] = "C03";
		assertEquals(dao.getListeCompteByClientId("cl03")[0], compteId[0]);
	}
	
	@Test
	public void testgetListeCompteByClientIdNonExistant() {
		assertEquals(dao.getListeCompteByClientId("cl73").length, 0);
	}
	
	@Test
	public void testgetSoldeCompteByIdExistant1() {
		assertTrue(dao.getSoldeCompteById("C01") == 254.24);
	}
	
	@Test
	public void testgetSoldeCompteByIdExistant2() {
		assertTrue(dao.getSoldeCompteById("C03") == 9452.28);
	}
	
	@Test
	public void testgetSoldeCompteByIdExistantNeCorrespondantPas() {
		assertFalse(dao.getSoldeCompteById("C01") == 1000.01);
	}
	
	@Test
	public void testgetSoldeCompteByIdNonExistant() {
		assertFalse(dao.getSoldeCompteById("C106") == 100415.23);
	}
	
	@Test
	public void testgetDecouvertCompteByIdExistant1() {
		assertTrue(dao.getDecouvertCompteById("C01") == 50);
	}
	
	@Test
	public void testgetDecouvertCompteByIdExistant2() {
		assertTrue(dao.getDecouvertCompteById("C03") == 250);
	}
	
	@Test
	public void testgetDecouvertCompteByIdExistantNeCorrespondantPas() {
		assertFalse(dao.getDecouvertCompteById("C01") == 0);
	}
	
	@Test
	public void testgetDecouvertCompteByIdNonExistant() {
		assertFalse(dao.getDecouvertCompteById("C106") == 10000000);
	}
	
	@Test
	public void testAjoutDUnCompteAvecIdDejaExistant1() {
		assertFalse(dao.ajoutCompte("C01","cl73", 100415.23, 10000000));
	}
	
	@Test
	public void testAjoutDUnCompteAvecIdDejaExistant2() {
		assertFalse(dao.ajoutCompte("C03","cl73", 100415.23, 10000000));
	}
	
	@Test
	public void testAjoutDUnCompteCorrectPuisSupression() {
		assertTrue(dao.ajoutCompte("C106","cl73", 100415.23, 10000000));
		assertTrue(dao.retireCompteById("C106"));
		assertTrue(dao.ajoutCompte("C106","cl73", 100415.23, 10000000));
		assertTrue(dao.retireCompteByClientId("cl73"));
	}
	
	@Test
	public void testSupressionDUnCompteInnexistant() {
		assertFalse(dao.retireCompteById("C106"));
	}
	
	@Test
	public void testupdatingSoldeByCompteIdExistant1() {
		assertTrue(dao.updatingSoldeByCompteId("C01", 254.24 + 10));
		assertTrue(dao.updatingSoldeByCompteId("C01", 254.24));
	}
	
	@Test
	public void testupdatingSoldeByCompteIdExistant2() {
		assertTrue(dao.updatingSoldeByCompteId("C03", 9452.28 + 148.27));
		assertTrue(dao.updatingSoldeByCompteId("C03", 9452.28));
	}
	
	@Test
	public void testupdatingSoldeByCompteIdNonExistant1() {
		assertFalse(dao.updatingSoldeByCompteId("C106", 100415.23 + 10045.10));
	}
	
	@Test
	public void testupdatingSoldeByCompteIdNonExistant2() {
		assertFalse(dao.updatingSoldeByCompteId("C106", 100415.23 - 10045.10));
	}
}
