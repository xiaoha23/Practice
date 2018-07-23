package codingbat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Or35Test {
	private Or35 o;

	@BeforeEach
	public void init() {
	  o = new Or35();
	}
	
	@Test
	void test() {		
		assertFalse(o.or35(8));
	}
	
	@Test
	void test1() {
		assertTrue(o.or35(3));
	}
	
	@Test
	void test2() {
		assertTrue(o.or35(10));
	}

}
