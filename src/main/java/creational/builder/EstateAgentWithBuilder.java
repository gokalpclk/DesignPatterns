package creational.builder;

/**
 * @author Gokalp on 9/23/22
 */
public class EstateAgentWithBuilder {
    public static void main(String[] args) {
        House house = HouseBuilder.startBuild()
                .setCountry("Istanbul")
                .setDistrict("Umraniye")
                .setStreet("Tatlisu")
                .setBuildingAge(2008)
                .setRoomCount(3)
                .setHasPark(true)
                .setHasCarPark(true)
                .build();

        printHouse(house);

        House house1 = HouseBuilder.standardHouseBuild("Istanbul", "Umraniye", "Tatlisu", 2010, 3)
                .setHasPark(true)
                .setDuplex(true)
                .build();

        printHouse(house1);

        House house2 = HouseBuilder.poolHouseBuild("Istanbul", "Umraniye", "Tatlisu", 2010, 3)
                .setHasPark(true)
                .setDuplex(true)
                .build();

        printHouse(house2);


    }

    private static void printHouse(House house) {
        System.out.println("*********");
        System.out.println("House added ->" + house);
        System.out.println("*********");

    }
}
