package testMetier;

import Metier.Compte;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class testCompte {
	
	Compte cp1 = new Compte("C01", 254.24);
	
	@Test
	public void testGetNumeroCompte1() {
		assertEquals(cp1.getNumeroCompte(), "C01");
	}
	
	@Test
	public void testGetNumeroCompte2() {
		cp1.setNumeroCompte("C02");
		assertEquals(cp1.getNumeroCompte(), "C02");
	}
	
	@Test
	public void testGetSolde1() {
		assertTrue(cp1.getSolde() == 254.24);
	}
	
	@Test
	public void testGetSolde2() {
		cp1.setSolde(300);
		assertTrue(cp1.getSolde() == 300);
		cp1.setSolde(254.24);
	}
	
	@Test
	public void testDebiterImpossible() {
		assertFalse(cp1.debiter(500));
	}
	
	@Test
	public void testDebiterPossibleSuiviDeCrediter() {
		assertTrue(cp1.debiter(100));
		assertTrue(cp1.crediter(100));
	}
}
