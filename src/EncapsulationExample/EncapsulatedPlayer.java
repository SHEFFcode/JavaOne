package EncapsulationExample;

/**
 * Created by jeremy.shefer on 4/16/17.
 */
public class EncapsulatedPlayer {
    private String name;
    private int health;
    private String weapon;

    public EncapsulatedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.health = health;
        } else {
            this.health = 100;
        }
        this.weapon = weapon;
    }

    public void LoseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0)
            System.out.println("Player knocked out!");
    }

    public int getHealth() {
        return this.health;
    }
}
