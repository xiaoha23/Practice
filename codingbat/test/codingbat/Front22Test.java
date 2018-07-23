package codingbat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Front22Test {

	private Front22 f22;
	
	@BeforeEach
	private void init() {
		f22 = new Front22();
	}
	
	
	@Test
	void test() {
		assertEquals("kikittenki", f22.front22("kitten"));
	}
	
	@Test
	void test1() {
		assertEquals("HaHaHa", f22.front22("Ha"));
	}
	
	@Test
	void test2() {
		assertEquals("ababcab", f22.front22("abc"));
	}

}
