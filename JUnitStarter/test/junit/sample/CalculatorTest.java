package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		//期待値
		int expected = 5;
//		実測値
		int actual = cal.add(3, 2);
//		期待値と実測値の比較
		assertEquals(expected, actual);
	}

	@Test
	public void testSub() {
		Calculator cal = new Calculator();
		int expected = 5;
		int actual = cal.sub(7, 2);
		assertEquals(expected, actual);
	}

	@Test
	public void testMul() {
		Calculator cal = new Calculator();
		int expected = 14;
		int actual = cal.mul(7, 2);
		assertEquals(expected, actual);
	}

	@Test
	public void testDiv() {
		Calculator cal = new Calculator();
		int expected = 4;
		float actual = cal.div(8, 2);
		assertEquals(expected, actual);

	}

}
