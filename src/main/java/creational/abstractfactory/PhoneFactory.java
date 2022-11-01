package creational.abstractfactory;

/**
 * @author Gokalp on 9/21/22
 */
public interface PhoneFactory {
    Phone getPhone(String model, String battery, int width, int height);
}
