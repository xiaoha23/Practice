package codingbat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MissingCharTest {

	@Test
	void test() {
		MissingChar mc = new MissingChar();
		assertEquals("ktten", mc.missingChar("kitten", 1));
	}
	
	@Test
	void test1() {
		MissingChar mc = new MissingChar();
		assertEquals("itten", mc.missingChar("kitten", 0));
	}

	@Test
	void test2() {
		MissingChar mc = new MissingChar();
		assertEquals("kittn", mc.missingChar("kitten", 4));
	}

}
