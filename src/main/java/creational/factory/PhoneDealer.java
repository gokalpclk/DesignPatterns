package creational.factory;

/**
 * @author Gokalp on 9/21/22
 */
public class PhoneDealer {
    public static void main(String[] args) {
        Phone phone1 = PhoneFactory.getPhone("Phone1", "2600mah", 4, 7);
        Phone phone2 = PhoneFactory.getPhone("Phone2", "3600mah", 5, 8);

        System.out.println("Phone1 details:");
        System.out.println(phone1);

        System.out.println("Phone2 details:");
        System.out.println(phone2);

    }
}
