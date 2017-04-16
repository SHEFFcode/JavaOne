package InheritanceDogExample;

/**
 * Created by jeremy.shefer on 4/16/17.
 */
public class YellowLabordoodle implements Pet {
    @Override
    public void BeNice() {
        System.out.println("Being nice as a yellow lab...");
    }

    @Override
    public void Play() {
        System.out.println("Playing as a yellow lab...");
    }

    @Override
    public void MakeThemLaugh() {
        System.out.println("Making them laugh as a yellow lab...");
    }



}
