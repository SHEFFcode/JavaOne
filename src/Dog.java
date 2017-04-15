/**
 * Created by jeremy.shefer on 4/15/17.
 */
public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void Eat() {
        this.Chew();
        super.Eat();
    }

    public void Chew() {
        System.out.println(getName() + " is chewing.");
    }
}
