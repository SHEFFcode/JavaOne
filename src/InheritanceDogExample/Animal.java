package InheritanceDogExample;

/**
 * Created by jeremy.shefer on 4/16/17.
 */
public abstract class Animal {
    public Animal(int height, int weight, int numberOfEyes, int numberOfTails, int numberOfLimbs) {
        this.height = height;
        this.weight = weight;
        this.numberOfEyes = numberOfEyes;
        this.numberOfTails = numberOfTails;
        this.numberOfLimbs = numberOfLimbs;
    }

    private int height;
    private int weight;
    private int numberOfEyes;
    private int numberOfTails;
    private int numberOfLimbs;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public int getNumberOfTails() {
        return numberOfTails;
    }

    public void setNumberOfTails(int numberOfTails) {
        this.numberOfTails = numberOfTails;
    }

    public int getNumberOfLimbs() {
        return numberOfLimbs;
    }

    public void setNumberOfLimbs(int numberOfLimbs) {
        this.numberOfLimbs = numberOfLimbs;
    }

    public void Stand() {
        System.out.println("I am standing");
    }

    public void Sit() {
        System.out.println("I am sitting");
    }

    public abstract void BeAnAnimal();
}
