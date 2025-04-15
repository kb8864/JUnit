package junit.sample;

/**
 * ポケモンが進化する処理
 * @param base 元のポケモン名
 * @param item 使用するアイテム
 * @return 進化後のポケモン名 または "進化はしない"
 */
public class PokemonEvolution {
	public String evolve(String base, String item) {
		if ("ピカチュウ".equals(base) && "かみなりのいし".equals(item)) {
			return "ライチュウ";
		}
		if ("イーブイ".equals(base)) {
			switch (item) {
			case "ほのおのいし":
				return "ブースター";
			case "かみなりのいし":
				return "サンダース";
			case "みずのいし":
				return "シャワーズ";
			case "リーフのいし":
				return "リーフィア";
			case "こおりのいし":
				return "グレイシア";
			}
		}
		return "進化はしない";
	}
}
