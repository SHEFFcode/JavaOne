package PolymorphismExample;

/**
 * Created by jeremy.shefer on 4/16/17.
 */
public class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String Plot() {
        return "Aliens attempt to take over the earth.";
    }
}
