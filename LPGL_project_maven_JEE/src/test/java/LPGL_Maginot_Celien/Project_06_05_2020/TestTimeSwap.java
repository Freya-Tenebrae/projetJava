package LPGL_Maginot_Celien.Project_06_05_2020;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Tools.TimeSwap;

public class TestTimeSwap {
	TimeSwap ts1 = new TimeSwap(1,1,2,2,3,3);
	TimeSwap ts2 = new TimeSwap(1,2,3,4,6,5);
	TimeSwap ts3 = new TimeSwap(1,2,3,7,8,9);
	TimeSwap ts4 = new TimeSwap(2,2,4,4,6,6);
	TimeSwap ts5 = new TimeSwap(6,6,6,6,6,6);
	
	@Test
	public void testFoundRightTimeTS1() {
		assertEquals(ts1.FoundRightTime(), "11h22m33s");
	}
	
	@Test
	public void testFoundRightTimeTS2() {
		assertEquals(ts2.FoundRightTime(), "12h34m56s");
	}
	
	@Test
	public void testFoundRightTimeTS3() {
		assertEquals(ts3.FoundRightTime(), "17h28m39s");
	}
	
	@Test
	public void testFoundRightTimeTS4() {
		assertEquals(ts4.FoundRightTime(), "22h46m46s");
	}
	
	@Test
	public void testFoundRightTimeTS5() {
		assertEquals(ts5.FoundRightTime(), "PAS POSSIBLE");
	}
}