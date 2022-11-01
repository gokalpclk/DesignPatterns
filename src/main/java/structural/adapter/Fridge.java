package structural.adapter;

/**
 * @author Gokalp on 10/3/22
 */
public class Fridge implements ElectricalAppliances {

    private int voltage;

    public Fridge() {
        this.voltage = 220;
    }

    @Override
    public int plugAndRun() {
        System.out.println("Fridge is running");
        return voltage;
    }
}
