package InheritanceDogExample;

/**
 * Created by jeremy.shefer on 4/16/17.
 */
public class RobotDog extends Robot implements Pet {
    @Override
    public void BeNice() {
        System.out.println("I am being nice the way only a robot dog can!");
    }

    @Override
    public void Play() {
        System.out.println("I am playing with you the way only a robot dog can!");
    }

    @Override
    public void MakeThemLaugh() {
        System.out.println("I am making you laugh the way only a robot dog can!");
    }

    @Override
    public void BeARobot() {
        System.out.println("I am being a robot by being a robot dog.");
    }

}
