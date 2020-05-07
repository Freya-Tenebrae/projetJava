package testMetier;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Metier.Client;


public class testClient {
	
	Client cl = new Client("c1", "adresse fictive numéro 1", "nom fictif numéro 1");  // 12h34m56s
	
	@Test
	public void testGettercl1() {
		assertEquals(cl.getNumeroClient(), "c1");
	}
	
	@Test
	public void testGettercl2() {
		assertEquals(cl.getAdresse(), "adresse fictive numéro 1");
	}
	
	@Test
	public void testGettercl3() {
		assertEquals(cl.getNom(), "nom fictif numéro 1");
	}
	
	@Test
	public void testSettercl1() {
		cl.setNumeroClient("c2");
		assertEquals(cl.getNumeroClient(), "c2");
	}
	
	@Test
	public void testSettercl2() {
		cl.setAdresse("adresse fictive numéro 2");
		assertEquals(cl.getAdresse(), "adresse fictive numéro 2");
	}
	
	@Test
	public void testSettercl3() {
		cl.setNom("nom fictif numéro 2");
		assertEquals(cl.getNom(), "nom fictif numéro 2");
	}
	

}
