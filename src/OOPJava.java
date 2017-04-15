/**
 * Created by jeremy.shefer on 4/15/17.
 */
public class OOPJava {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
    public void setModel(String model) {
        if (!model.isEmpty()) {
            System.out.println("Car model is now " + model);
            this.model = model;
        }
    }
    public String getModel() {
        return this.model;
    }
    private void Run() {


    }
}
