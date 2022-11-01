package creational.builder;

/**
 * @author Gokalp on 9/23/22
 */
public class EstateAgent {

    public static void main(String[] args) {
        House house1 = new House();
        house1.setCountry("Ankara");
        house1.setDistrict("Golbasi");
        house1.setStreet("Incek");
        house1.setRoomCount(3);
        house1.setBuildingAge(2010);
        house1.setHasAc(true);


        House house2 = new House("Istanbul", "Umraniy", "Tatlisu", 2008, 2, 3, 2, 0, false, false, true, true, true, false);


        printHouse(house1);
        printHouse(house2);

    }

    private static void printHouse(House house) {
        System.out.println("*********");
        System.out.println("House added ->" + house);
        System.out.println("*********");

    }
}
