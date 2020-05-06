package LPGL_Maginot_Celien.TD5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Manager.TimeManager;


public class TestTimeManager {
	
	TimeManager t1 = new TimeManager("123456");  // 12h34m56s
	TimeManager t2 = new TimeManager("123489");  // 12h38m49s
	TimeManager t3 = new TimeManager("123789");  // 17h28m39s
	TimeManager t4 = new TimeManager("001234");  // 0h12m34s
	TimeManager t5 = new TimeManager("120500");  // 12h5m0s
	
	TimeManager t6 = new TimeManager("456789");  // PAS POSSIBLE
	TimeManager t7 = new TimeManager("1234");    // PAS POSSIBLE
	TimeManager t8 = new TimeManager("1234567"); // PAS POSSIBLE
	TimeManager t9 = new TimeManager("");        // PAS POSSIBLE
	
	// suposition personnelles quand à la compréhension de l'exercice
	TimeManager t10 = new TimeManager("124356");  // 12h43m56s
	TimeManager t11 = new TimeManager("222013"); // 22h20m13s
	TimeManager t12 = new TimeManager("214865"); // 12h46m58s
	
	@Test
	public void testGetTimeT1() {
		assertEquals(t1.getTime(), "12h34m56s");
	}
	
	@Test
	public void testGetTimeT2() {
		assertEquals(t2.getTime(), "12h38m49s");
	}
	
	@Test
	public void testGetTimeT3() {
		assertEquals(t3.getTime(), "17h28m39s");
	}
	
	@Test
	public void testGetTimeT4() {
		assertEquals(t4.getTime(), "0h12m34s");
	}
	
	@Test
	public void testGetTimeT5() {
		assertEquals(t5.getTime(), "12h5m0s");
	}
	
	@Test
	public void testGetTimeT6() {
		assertEquals(t6.getTime(), "PAS POSSIBLE");
	}
	
	@Test
	public void testGetTimeT7() {
		assertEquals(t7.getTime(), "PAS POSSIBLE");
	}
	
	@Test
	public void testGetTimeT8() {
		assertEquals(t8.getTime(), "PAS POSSIBLE");
	}
	
	@Test
	public void testGetTimeT9() {
		assertEquals(t9.getTime(), "PAS POSSIBLE");
	}
	
	@Test
	public void testGetTimeT10() {
		assertEquals(t10.getTime(), "12h43m56s");
	}
	
	@Test
	public void testGetTimeT11() {
		assertEquals(t11.getTime(), "22h20m13s");
	}
	
	@Test
	public void testGetTimeT12() {
		assertEquals(t12.getTime(), "12h46m58s");
	}
	
}
