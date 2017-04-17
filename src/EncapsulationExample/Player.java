package EncapsulationExample;

/**
 * Created by jeremy.shefer on 4/16/17.
 */
public class Player {
    public String name;
    public int health;
    public String weapon;

    public void LoseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0)
            System.out.println("The play is knocked out");
    }

    public int HealthRemaining() {
        return this.health;
    }
}
