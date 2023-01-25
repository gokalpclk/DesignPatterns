package behavioural.chain;

/**
 * @author Gokalp on 25.01.2023
 * @project DesignPatterns
 */
public enum City {
    ISTANBUL("Istanbul"),
    ANKARA("Ankara"),
    ANTALYA("Antalya"),
    KARABUK("Karabuk"),
    KARS("Kars");

    private String city;

    City(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return city;
    }
}
