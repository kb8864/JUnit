package junit.sample;

public class Pokemon {
    private String name;
    private int hp;
    private int attackPower;

    public Pokemon(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public int getHp() {
        return hp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void receiveDamage(int damage) {
        this.hp = Math.max(this.hp - damage, 0);
    }

    public String getName() {
        return name;
    }
}
