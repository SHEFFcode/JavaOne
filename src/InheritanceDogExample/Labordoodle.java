package InheritanceDogExample;

/**
 * Created by jeremy.shefer on 4/16/17.
 */
public class Labordoodle extends Dog implements Pet {
    public Labordoodle(int height, int weight) {
        super(height, weight);
    }

    @Override
    public void BeNice() {
        System.out.println("Being nice only the way a labordoodle can!!");
    }

    @Override
    public void Play() {
        System.out.println("Playing with you, the way only a larbordoodle can!");
    }

    @Override
    public void MakeThemLaugh() {
        System.out.println("Making you laugh the way only a labordoodle can!");
    }

    @Override
    public void JoinThePoliceForce() {
        super.JoinThePoliceForce();
        System.out.println("Woof woof, play with me!!");
    }
}
