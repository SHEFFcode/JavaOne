package InheritanceDogExample;

/**
 * Created by jeremy.shefer on 4/16/17.
 */
public class Dog extends Canine {
    public Dog(int height, int weight) {
        super(height, weight);
    }

    @Override
    public void Sniff() {
        System.out.println("I am sniffing like a dog.");
    }

    public void JoinThePoliceForce() {
        if (!(this instanceof Pet)) {
            System.out.println("I have decided to join the police force.");
        } else {
            System.out.println("I am a pet, I cannot join the police force");
        }
    }

}
