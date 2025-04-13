package junit.sample;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
	Calculator cal;

	@BeforeEach
	public void setUp() {
		cal = new Calculator();

	}

	@Test
	public void testAdd() {
		assertTrue("DEV".equals(System.getenv("ENV")));
		//期待値
		int expected = 5;
		//		実測値
		int actual = cal.add(3, 2);
		//		期待値と実測値の比較
		assertEquals(expected, actual);
	}

	@Test
	public void testSub() {
		assumingThat("DEV".equals(System.getenv("ENV")), () -> {
			int expected = 5;
			int actual = cal.sub(7, 2);
			assertEquals(expected, actual);
			System.out.println("(１)テスト実行");
		});
		System.out.println("(２)テスト終了");

	}

	@Test
	public void testMul() {
		int expected = 14;
		int actual = cal.mul(7, 2);
		assertEquals(expected, actual);
	}

	@Test
	public void testDiv() {
		int expected = 4;
		float actual = cal.div(8, 2);
		assertEquals(expected, actual);

	}

	@Test
	@Tag("Exception")
	public void testDivException() {
		//		第一引数は例外クラスを、第二引数はラムダ式でメソッドの実行記入
		assertThrows(IllegalArgumentException.class, () -> cal.div(3, 0));
	}

	@Disabled
	@Test
	@Tag("Exception")
	public void testDivException2() {
		try {
			cal.div(3, 0);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("第二引数に0が指定されました", e.getMessage());

		}
	}

}
