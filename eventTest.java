package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class eventTest {

	@Test
	public void test() {
		JUnitTesting test = new JUnitTesting();
		boolean output = test.event(1,31);
		assertEquals(true, output);
	}

}
