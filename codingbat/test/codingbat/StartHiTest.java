package codingbat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StartHiTest {

	private StartHi startHi;
	
	@BeforeEach
	private void init( ) {
		startHi = new StartHi();
	}
	
	@Test
	void test() {
		assertTrue(startHi.startHi("hi there"));
	}
	
	@Test
	void test1() {
		assertTrue(startHi.startHi("hi"));
	}
	
	@Test
	void test2() {
		assertFalse(startHi.startHi("hello hi"));
	}

}
