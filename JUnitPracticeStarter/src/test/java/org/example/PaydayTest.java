package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PaydayTest {

	@ParameterizedTest // 同じテスト構造で「複数パターンの入力と期待値」をまとめてチェック
	@CsvSource({ // テストの 引数セット を "文字列, 数値" のような形式で一括指定できるアノテーション。
		"2025, 4, 25, 0",
		"2025, 5, 1, 24",
		"2025, 6, 26, 29"
	})
	void testGetNextPayday(int yyyy, int mm, int dd, int expected) {
		Payday payday = new Payday(LocalDate.of(yyyy, mm, dd));//引数ありコンストラクタを使うに理由は「指定した日付を使って Payday オブジェクト」を作り、
		//テストケースごとにに異なる LocalDate を使って、異なる結果を検証するため

		int actual = payday.getNextPayday();
		assertEquals(expected, actual);
	}
}
