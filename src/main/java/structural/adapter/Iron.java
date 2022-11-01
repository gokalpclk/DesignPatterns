package structural.adapter;

/**
 * @author Gokalp on 10/3/22
 */
public class Iron implements ElectricalAppliances {

    private int voltage;

    public Iron() {
        this.voltage = 220;
    }

    @Override
    public int plugAndRun() {
        System.out.println("Iron is running");
        return voltage;
    }
}
