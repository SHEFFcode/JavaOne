package CompositionExample;

/**
 * Created by jeremy.shefer on 4/16/17.
 */
public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimentions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimentions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimentions = dimentions;
    }

    public void PressPowerButton() {
        System.out.println("Power button pressed.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Dimensions getDimentions() {
        return dimentions;
    }

    public void setDimentions(Dimensions dimentions) {
        this.dimentions = dimentions;
    }
}
