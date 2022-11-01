package creational.abstractfactory;

/**
 * @author Gokalp on 9/21/22
 */
public class PhoneDealer {
    public static void main(String[] args) {
        Phone1Factory phone1Factory = new Phone1Factory();
        Phone phone1 = phone1Factory.getPhone("Phone1", "2600mah", 4, 7);

        Phone2Factory phone2Factory = new Phone2Factory();
        Phone phone2 = phone2Factory.getPhone("Phone2", "3600mah", 5, 8);

        System.out.println(phone1);
        System.out.println(phone2);
    }
}
