package codingbat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FrontBackTest {

	@Test
	void test() {
		FrontBack fb = new FrontBack();
		assertEquals("eodcc", fb.frontBack("codce"));
	}


	@Test
	void test1() {
		FrontBack fb = new FrontBack();
		assertEquals("a", fb.frontBack("a"));
	}
	

	@Test
	void test2() {
		FrontBack fb = new FrontBack();
		assertEquals("ab", fb.frontBack("ba"));
	}
}
