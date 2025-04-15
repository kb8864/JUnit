package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class PokemonBattleTest {
    private Pokemon pikachu;
    private Pokemon eievui;
    private PokemonBattle battle;

    @BeforeEach
    public void setUp() {
        pikachu = new Pokemon("Pikachu", 100, 20);
        eievui = new Pokemon("Eievui", 100, 15);
        battle = new PokemonBattle(pikachu, eievui);
    }

    @Test
    public void testAttackReducesHp() {
        battle.attack();
        assertEquals(80, eievui.getHp());
    }



	@Test
    @Tag("critical")
    public void testCriticalHit() {
        // クリティカルヒットのロジックがある場合のテスト
        // ここでは仮に2倍のダメージを与えるとします
        int criticalDamage = pikachu.getAttackPower() * 2;
        eievui.receiveDamage(criticalDamage);
        assertEquals(60, eievui.getHp());
    }

    @Test
    @Tag("edge")
    public void testAttackWhenHpIsZero() {
        eievui.receiveDamage(100);
        assertEquals(0, eievui.getHp());
        battle.attack();
        assertEquals(0, eievui.getHp(), "HPが0のときに攻撃を受けてもHPは0のまま");
    }
}
