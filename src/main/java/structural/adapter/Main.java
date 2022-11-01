package structural.adapter;

/**
 * @author Gokalp on 10/3/22
 */
public class Main {
    public static void main(String[] args) {
        Plug plug = new Plug();

        Iron iron = new Iron();
        Fridge fridge = new Fridge();

        plug.giveElectricity(iron);
        plug.giveElectricity(fridge);

        SamsungPhone samsungPhone = new SamsungPhone();
        PhoneToElectricalAppliancesAdapter adapter = new PhoneToElectricalAppliancesAdapter(samsungPhone);

        plug.giveElectricity(adapter);
    }
}
