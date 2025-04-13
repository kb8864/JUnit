package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void testTaxPrice() {
		Calculator cal  = new Calculator();
		int expected  = 110;
		int actual = cal.taxPrice(100);

		assertEquals(expected, actual);
	}

	@Test
	public void testTaxPriceException() {
		Calculator cal  = new Calculator();
		IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> cal.taxPrice(-100));

		assertEquals("価格は0円以上にしてください", e.getMessage());
	}

}
