package testMetier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Factory.CompteFactory;
import Metier.CompteAvecDecouvert;

public class testCompteAvecDecouvert {
	
	CompteAvecDecouvert cp1 = (CompteAvecDecouvert) CompteFactory.getNewInstance("C03");
	
	@Test
	public void testGetNumeroCompte() {
		assertEquals(cp1.getNumeroCompte(), "C03");
	}
	
	@Test
	public void testGetSolde() {
		assertTrue(cp1.getSolde() == 9452.28);
	}
	
	@Test
	public void testgetDecouvertAutoriese() {
		assertTrue(cp1.getDecouvertAutoriser() == 250);
	}
	
	@Test
	public void testDebiterImpossible() {
		assertFalse(cp1.debiter(10000));
	}
	
	@Test
	public void testDebiterPossibleSuiviDeCrediter1() {
		assertTrue(cp1.debiter(9500));
		assertTrue(cp1.crediter(9500));
	}
	
	@Test
	public void testDebiterPossibleSuiviDeCrediter2() {
		assertTrue(cp1.debiter(846.23));
		assertTrue(cp1.crediter(846.23));
	}
}
