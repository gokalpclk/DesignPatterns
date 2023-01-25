package behavioural.chain;

/**
 * @author Gokalp on 25.01.2023
 * @project DesignPatterns
 */
public class App {
    public static void main(String[] args) {

        CargoCompany gklpCargo = GklpCargo.getCargoCompany();

        gklpCargo.shipIt(City.KARS);

        System.out.println("\n----------\n");

        gklpCargo.shipIt(City.ANTALYA);

        System.out.println("\n----------\n");

        gklpCargo.shipIt(City.ISTANBUL);

        System.out.println("\n----------\n");

        gklpCargo.shipIt(City.ANKARA);

    }
}
