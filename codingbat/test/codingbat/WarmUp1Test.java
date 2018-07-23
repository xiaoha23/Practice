package codingbat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WarmUp1Test {

	private WarmUp1 w;
	
	@BeforeEach
	private void init() {
		w = new WarmUp1();
	}
	
	@Test
	void testIn1020() {
		assertTrue(w.in1020(12, 99));
		assertTrue(w.in1020(21, 12));
		assertFalse(w.in1020(8, 99));
	}

	
	@Test
	void testHasTeen() {
		assertTrue(w.hasTeen(13, 20, 10));
		assertTrue(w.hasTeen(20, 19, 10));
		assertTrue(w.hasTeen(20, 10, 13));
	}

	@Test
	void testLoneTeen() {
		assertTrue(w.loneTeen(13, 99));
		assertTrue(w.loneTeen(21, 19));
		assertFalse(w.loneTeen(13, 13));
	}
	
	@Test
	void testDelDel() {
		assertEquals("abc", w.delDel("adelbc"));
		assertEquals("aHello", w.delDel("adelHello"));
		assertEquals("adedbc", w.delDel("adedbc"));
	}
	
	@Test
	void testMixStart() {
		assertTrue(w.mixStart("mix snacks"));
		assertTrue(w.mixStart("pix snacks"));
		assertFalse(w.mixStart("piz snacks"));
	}
	
	@Test
	void testStartOz() {
		assertEquals("oz", w.startOz("ozymandias"));
		assertEquals("z", w.startOz("bzoo"));
		assertEquals("o", w.startOz("oxx"));
	}
	
	@Test
	void testIntMax() {
		assertEquals(3, w.intMax(1, 2, 3));
		assertEquals(3, w.intMax(1, 3, 2));
		assertEquals(3, w.intMax(3, 2, 1));
	}
	
	@Test
	void testClose10() {
		assertEquals(8, w.close10(8, 13));
		assertEquals(8, w.close10(13, 8));
		assertEquals(0, w.close10(13, 7));
	}
	
	@Test
	void testIn3050() {
		assertTrue(w.in3050(30, 31));
		assertFalse(w.in3050(30, 41));
		assertTrue(w.in3050(40, 50));
	}
	
	@Test
	void testMax1020() {
		assertEquals(19, w.max1020(11, 19));
		assertEquals(19, w.max1020(19, 11));
		assertEquals(11, w.max1020(11, 9));
		
	}
	
	@Test
	void testStringE() {
		assertTrue(w.stringE("Hello"));
		assertTrue(w.stringE("Heelle"));
		assertFalse(w.stringE("Heelele"));
	}
	
	@Test
	void testLastDigit() {
		assertTrue(w.lastDigit(7, 17));
		assertFalse(w.lastDigit(6, 17));
		assertTrue(w.lastDigit(3, 113));
	}
	
	@Test
	void testEndUp() {
		assertEquals("HeLLO", w.endUp("Hello"));
		assertEquals("hi thERE", w.endUp("hi there"));
		assertEquals("HI", w.endUp("hi"));
	}
}
