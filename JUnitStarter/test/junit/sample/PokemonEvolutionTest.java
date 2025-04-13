package junit.sample;

import static org.junit.Assert.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PokemonEvolutionTest {
	 private final PokemonEvolution evolution = new PokemonEvolution();

	    @ParameterizedTest(name = "{0} に {1} を使うと {2}")
	    @CsvSource({
	        // 正常進化パターン
	        "ピカチュウ, かみなりのいし, ライチュウ",
	        "イーブイ, ほのおのいし, ブースター",
	        "イーブイ, かみなりのいし, サンダース",
	        "イーブイ, みずのいし, シャワーズ",
	        "イーブイ, リーフのいし, リーフィア",
	        "イーブイ, こおりのいし, グレイシア",
	        // 進化はしないパターン
	        "ピカチュウ, みずのいし, 進化はしない",
	        "イーブイ, その辺の石, 進化はしない"
	    })
	    void testEvolution(String base, String item, String expected) {
	        assertEquals(expected, evolution.evolve(base, item));
	    }
	}

