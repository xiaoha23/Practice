package codingbat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Front3Test {

	@Test
	void test() {
		Front3 f3 = new Front3();
		assertEquals("JavJavJav", f3.front3("Java"));
	}

	@Test
	void test2() {
		Front3 f3 = new Front3();
		assertEquals("ChoChoCho", f3.front3("Chocolate"));
	}
	
	@Test
	void test3() {
		Front3 f3 = new Front3();
		assertEquals("abcabcabc", f3.front3("abc"));
	}
}
