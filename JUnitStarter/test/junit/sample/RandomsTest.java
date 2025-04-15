package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.jupiter.api.Test;

public class RandomsTest{

	@Test
	void testChoice() {
		List<String> options = new ArrayList<String>();
		options.add("A");
		options.add("B");
		Randoms sut = new Randoms();

//		モックの生成
		final AtomicBoolean isCalled = new AtomicBoolean(false);
		//テストメソッドにスタブの設定
		sut.random = new RandomNumber() {

			@Override
			public int nextInt() {
				// TODO 自動生成されたメソッド・スタブ
				isCalled.set(true);
				return 0;
			}
		};
//		//別途でスタブクラスの生成
//		sut.random = new RandomNumberStub();
		assertEquals(sut.choice(options), "A");
		
		assertTrue(isCalled.get());
	}

}
