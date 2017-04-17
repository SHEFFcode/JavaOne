package CompositionExample;

/**
 * Created by jeremy.shefer on 4/16/17.
 */
public class PC {
    private Case theCase;
    private Monitor monitors;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitors, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitors = monitors;
        this.motherboard = motherboard;
    }

    public void PowerUp() {
        this.getTheCase().PressPowerButton();
        this.drawLogo();
    }

    private void drawLogo() {
        System.out.println("Drawing logo...");
        this.getMonitors().DrawPixelAt(2, 2, "red");
    }

    private Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitors() {
        return monitors;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
