package money;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {

	@Test
	void testMultiplication() {
		Doller five = new Doller(5);
		Doller product = five.times(2);
		assertEquals(10, product.amount);

		product = five.times(3);
		assertEquals(15, product.amount);
	}

}
