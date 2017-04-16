package InheritanceDogExample;

/**
 * Created by jeremy.shefer on 4/16/17.
 */
public abstract class Canine extends Animal {
    public Canine(int height, int weight) {
        super(height, weight, 2, 1, 4);
    }

    public void Run() {
        System.out.println("I am moving my legs and running.");
    }

    public abstract void Sniff();

    @Override
    public void BeAnAnimal() {
        System.out.println("I am being an animal by being a canine.");
    }
}
