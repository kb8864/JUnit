package junit.sample;

public class PokemonBattle {
    private Pokemon attacker;
    private Pokemon defender;

    public PokemonBattle(Pokemon attacker, Pokemon defender) {
        this.attacker = attacker;
        this.defender = defender;
    }

    public void attack() {
        int damage = attacker.getAttackPower();
        defender.receiveDamage(damage);
    }

    public Pokemon getAttacker() {
        return attacker;
    }

    public Pokemon getDefender() {
        return defender;
    }
}