package behavioural.chain;

/**
 * @author Gokalp on 25.01.2023
 * @project DesignPatterns
 */
public abstract class CargoCompany {
    private City city;
    private CargoCompany nextCargoCompany;

    public CargoCompany(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    public CargoCompany getNextCargoCompany() {
        return nextCargoCompany;
    }

    public CargoCompany setNextCargoCompany(CargoCompany nextCargoCompany) {
        this.nextCargoCompany = nextCargoCompany;
        return this;
    }

    public void shipIt(City city) {
        cargoInformation(city);
        if (getCity().equals(city)) {
            completedInformation();
        } else if (getNextCargoCompany() != null) {
            getNextCargoCompany().shipIt(city);
        } else {
            outOfServiceArea(city);
        }
    }

    private void outOfServiceArea(City city) {
        System.out.println(city.getCity() + "is out of service area");
    }

    private void completedInformation() {
        System.out.println("Shipping has been completed");
    }

    private void cargoInformation(City city) {
        System.out.println(
                "The cargo that will go to " + city.getCity() + " has arrived at the " + getCity().getCity() +
                        " branch.");
    }
}
