package creational.builder;

/**
 * @author Gokalp on 9/23/22
 */
public class HouseBuilder {

    private String country;
    private String district;
    private String street;

    private int buildingAge;
    private int roomCount;
    private int bathroomCount;
    private int toiletCount;
    private int balconyCount;

    private boolean isDuplex;
    private boolean isFurniture;
    private boolean hasCarPark;
    private boolean hasPark;
    private boolean hasAc;
    private boolean hasPool;

    public static HouseBuilder startBuild() {
        return new HouseBuilder();
    }

    public static HouseBuilder standardHouseBuild(String country, String district, String street, int buildingAge, int roomCount) {
        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.country = country;
        houseBuilder.district = district;
        houseBuilder.street = street;
        houseBuilder.buildingAge = buildingAge;
        houseBuilder.roomCount = roomCount;
        return houseBuilder;
    }

    public static HouseBuilder poolHouseBuild(String country, String district, String street, int buildingAge, int roomCount) {
        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.country = country;
        houseBuilder.district = district;
        houseBuilder.street = street;
        houseBuilder.buildingAge = buildingAge;
        houseBuilder.roomCount = roomCount;
        houseBuilder.setHasPool(true);
        return houseBuilder;
    }

    public House build() {
        House house = new House();

        house.setCountry(country);
        house.setDistrict(district);
        house.setStreet(street);

        house.setBuildingAge(buildingAge);
        house.setRoomCount(roomCount);
        house.setBathroomCount(bathroomCount);
        house.setToiletCount(toiletCount);
        house.setBalconyCount(balconyCount);

        house.setDuplex(isDuplex);
        house.setFurniture(isFurniture);
        house.setHasCarPark(hasCarPark);
        house.setHasPark(hasPark);
        house.setHasAc(hasAc);
        house.setHasPool(hasPool);

        return house;
    }

    public HouseBuilder setCountry(String country) {
        this.country = country;
        return this;
    }

    public HouseBuilder setDistrict(String district) {
        this.district = district;
        return this;
    }

    public HouseBuilder setStreet(String street) {
        this.street = street;
        return this;
    }

    public HouseBuilder setBuildingAge(int buildingAge) {
        this.buildingAge = buildingAge;
        return this;
    }

    public HouseBuilder setRoomCount(int roomCount) {
        this.roomCount = roomCount;
        return this;
    }

    public HouseBuilder setBathroomCount(int bathroomCount) {
        this.bathroomCount = bathroomCount;
        return this;
    }

    public HouseBuilder setToiletCount(int toiletCount) {
        this.toiletCount = toiletCount;
        return this;
    }

    public HouseBuilder setBalconyCount(int balconyCount) {
        this.balconyCount = balconyCount;
        return this;
    }

    public HouseBuilder setDuplex(boolean duplex) {
        isDuplex = duplex;
        return this;
    }

    public HouseBuilder setFurniture(boolean furniture) {
        isFurniture = furniture;
        return this;
    }

    public HouseBuilder setHasCarPark(boolean hasCarPark) {
        this.hasCarPark = hasCarPark;
        return this;
    }

    public HouseBuilder setHasPark(boolean hasPark) {
        this.hasPark = hasPark;
        return this;
    }

    public HouseBuilder setHasAc(boolean hasAc) {
        this.hasAc = hasAc;
        return this;
    }

    public HouseBuilder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }
}
