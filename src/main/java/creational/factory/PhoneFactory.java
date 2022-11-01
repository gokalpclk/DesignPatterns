package creational.factory;

/**
 * @author Gokalp on 9/21/22
 */
public class PhoneFactory {
    public static Phone getPhone(String model, String battery, int width, int height){
        Phone phone;
        if ("Phone1".equalsIgnoreCase(model)) {
            phone = new Phone1(model,battery, width, height);
        } else if ("Phone2".equalsIgnoreCase(model)) {
            phone = new Phone2(model, battery, width, height);
        }else{
            throw new RuntimeException("Unexpected model");
        }

        return phone;
    }
}
