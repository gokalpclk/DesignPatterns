package creational.abstractfactory;

/**
 * @author Gokalp on 9/21/22
 */
public class Phone2Factory implements PhoneFactory{


    @Override
    public Phone getPhone(String model, String battery, int width, int height) {
        return new Phone2(model, battery, width, height);
    }
}
