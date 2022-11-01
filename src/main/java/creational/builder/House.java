package creational.builder;

/**
 * @author Gokalp on 9/23/22
 */
public class House {
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

    public House() {
    }

    public House(String country, String district, String street, int buildingAge, int roomCount, int bathroomCount, int toiletCount, int balconyCount, boolean isDuplex, boolean isFurniture, boolean hasCarPark, boolean hasPark, boolean hasAc, boolean hasPool) {
        this.country = country;
        this.district = district;
        this.street = street;
        this.buildingAge = buildingAge;
        this.roomCount = roomCount;
        this.bathroomCount = bathroomCount;
        this.toiletCount = toiletCount;
        this.balconyCount = balconyCount;
        this.isDuplex = isDuplex;
        this.isFurniture = isFurniture;
        this.hasCarPark = hasCarPark;
        this.hasPark = hasPark;
        this.hasAc = hasAc;
        this.hasPool = hasPool;
    }

    //required
    public House(String country, String district, String street, int buildingAge, int roomCount) {
        this.country = country;
        this.district = district;
        this.street = street;
        this.buildingAge = buildingAge;
        this.roomCount = roomCount;
    }

    //optional
    public House(String country, String district, String street, int buildingAge, int roomCount, int bathroomCount) {
        this.country = country;
        this.district = district;
        this.street = street;
        this.buildingAge = buildingAge;
        this.roomCount = roomCount;
        this.bathroomCount = bathroomCount;
    }


    @Override
    public String toString() {
        return "House{" +
                "country='" + country + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", buildingAge=" + buildingAge +
                ", roomCount=" + roomCount +
                ", bathroomCount=" + bathroomCount +
                ", toiletCount=" + toiletCount +
                ", balconyCount=" + balconyCount +
                ", isDuplex=" + isDuplex +
                ", isFurniture=" + isFurniture +
                ", hasCarPark=" + hasCarPark +
                ", hasPark=" + hasPark +
                ", hasAc=" + hasAc +
                ", hasPool=" + hasPool +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuildingAge() {
        return buildingAge;
    }

    public void setBuildingAge(int buildingAge) {
        this.buildingAge = buildingAge;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getBathroomCount() {
        return bathroomCount;
    }

    public void setBathroomCount(int bathroomCount) {
        this.bathroomCount = bathroomCount;
    }

    public int getToiletCount() {
        return toiletCount;
    }

    public void setToiletCount(int toiletCount) {
        this.toiletCount = toiletCount;
    }

    public int getBalconyCount() {
        return balconyCount;
    }

    public void setBalconyCount(int balconyCount) {
        this.balconyCount = balconyCount;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }

    public boolean isFurniture() {
        return isFurniture;
    }

    public void setFurniture(boolean furniture) {
        isFurniture = furniture;
    }

    public boolean isHasCarPark() {
        return hasCarPark;
    }

    public void setHasCarPark(boolean hasCarPark) {
        this.hasCarPark = hasCarPark;
    }

    public boolean isHasPark() {
        return hasPark;
    }

    public void setHasPark(boolean hasPark) {
        this.hasPark = hasPark;
    }

    public boolean isHasAc() {
        return hasAc;
    }

    public void setHasAc(boolean hasAc) {
        this.hasAc = hasAc;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }


}
