package testMetier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import Metier.Banque;

public class testBanque {
	
Banque b = new Banque();
	
	@Test
	public void testconsultationImpossibleIdBanqueNonExistant() {
		b.ouverture_compte("Célia");
		assertFalse(b.consultation("C106"));
	}
	
	@Test
	public void testconsultationImpossibleIdBanqueetNomNeCoincidentPas() {
		b.ouverture_compte("Célia");
		assertFalse(b.consultation("C03"));
	}
	
	@Test
	public void testconsultationPossible1() {
		b.ouverture_compte("Célia");
		assertTrue(b.consultation("C01"));
	}
	
	@Test
	public void testconsultationPossible2() {
		b.ouverture_compte("Freya");
		assertTrue(b.consultation("C03"));
	}
	
	@Test
	public void testRetraitImpossibleSommeTropElevee() {
		b.ouverture_compte("Célia");
		b.consultation("C01");
		assertFalse(b.retrait("C01", 500));
	}
	
	@Test
	public void testRetraitPossibleEtDepot() {
		b.ouverture_compte("Célia");
		b.consultation("C01");
		assertTrue(b.retrait("C01", 100.24));
		assertTrue(b.depot("C01", 100.24));
	}
}
