package structural.adapter;

/**
 * @author Gokalp on 10/3/22
 */
public class Plug {
    public void giveElectricity(ElectricalAppliances electricalAppliances) {
        int voltage = electricalAppliances.plugAndRun();
        System.out.println("Voltage:" + voltage);
    }
}
