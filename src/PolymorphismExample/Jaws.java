package PolymorphismExample;

/**
 * Created by jeremy.shefer on 4/16/17.
 */
public class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String Plot() {
        return "Shark eats lots of people.";
    }
}
