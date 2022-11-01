package creational.builder;

/**
 * @author Gokalp on 9/23/22
 */
public class HouseBuilderRequired {



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

    public static HouseBuilderRequired startBuild(String country, String district, String street, int buildingAge, int roomCount) {
        HouseBuilderRequired houseBuilderRequired = new HouseBuilderRequired();
        houseBuilderRequired.country = country;
        houseBuilderRequired.district = district;
        houseBuilderRequired.street = street;
        houseBuilderRequired.buildingAge = buildingAge;
        houseBuilderRequired.roomCount = roomCount;
        return houseBuilderRequired;
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

    public HouseBuilderRequired setBathroomCount(int bathroomCount) {
        this.bathroomCount = bathroomCount;
        return this;
    }

    public HouseBuilderRequired setToiletCount(int toiletCount) {
        this.toiletCount = toiletCount;
        return this;
    }

    public HouseBuilderRequired setBalconyCount(int balconyCount) {
        this.balconyCount = balconyCount;
        return this;
    }

    public HouseBuilderRequired setDuplex(boolean duplex) {
        isDuplex = duplex;
        return this;
    }

    public HouseBuilderRequired setFurniture(boolean furniture) {
        isFurniture = furniture;
        return this;
    }

    public HouseBuilderRequired setHasCarPark(boolean hasCarPark) {
        this.hasCarPark = hasCarPark;
        return this;
    }

    public HouseBuilderRequired setHasPark(boolean hasPark) {
        this.hasPark = hasPark;
        return this;
    }

    public HouseBuilderRequired setHasAc(boolean hasAc) {
        this.hasAc = hasAc;
        return this;
    }

    public HouseBuilderRequired setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }
}
