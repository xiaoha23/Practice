package codingbat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BackAroundTest {

	@Test
	void test() {
		BackAround ba = new BackAround();
		assertEquals("tcatt", ba.backAround("cat"));
	}
	
	@Test
	void test1() {
		BackAround ba = new BackAround();
		assertEquals("oHelloo", ba.backAround("Hello"));
	}
	
	@Test
	void test2() {
		BackAround ba = new BackAround();
		assertEquals("aaa", ba.backAround("a"));
	}

}
