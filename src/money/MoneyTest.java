package money;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {

	@Test
	void testMultiplication() {
		Doller five = new Doller(5);
		five.times(5);
		assertEquals(10, five.amount);
	}

}
