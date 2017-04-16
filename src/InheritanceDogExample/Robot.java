package InheritanceDogExample;

/**
 * Created by jeremy.shefer on 4/16/17.
 */
public abstract class Robot {
    private int CPU;
    private int RAM;
    private int roboticLimbs;

    public abstract void BeARobot();
    public void Compute(){
        System.out.println("I am computing.");
    }
}
