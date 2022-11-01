package structural.adapter;

/**
 * @author Gokalp on 10/3/22
 */
public class PhoneToElectricalAppliancesAdapter implements ElectricalAppliances{
    private Phone phone;

    public PhoneToElectricalAppliancesAdapter(Phone phone) {
        this.phone = phone;
    }

    @Override
    public int plugAndRun() {
        return phone.chargeIt();
    }
}
