package LPGL_Maginot_Celien.Project_06_05_2020;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Tools.TimeTools;

public class TestTimeTools {
	
	@Test
	public void testValidSecondOrMinuteNumberOver59() {
		assertFalse(TimeTools.validSecondOrMinute(66));
	}
	
	@Test
	public void testValidSecondOrMinuteNumberUnder0() {
		assertFalse(TimeTools.validSecondOrMinute(-42));
	}
	
	@Test
	public void testValidSecondOrMinuteValidNumber() {
		assertTrue(TimeTools.validSecondOrMinute(42));
	}
	
	@Test
	public void testValidHeureNumberOver23() {
		assertFalse(TimeTools.validHour(42));
	}
	
	@Test
	public void testValidHeureNumberUnder0() {
		assertFalse(TimeTools.validHour(-07));
	}
	
	@Test
	public void testValidHeureValidNumber() {
		assertTrue(TimeTools.validHour(07));
	}

}
