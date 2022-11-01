package structural.bridge.audioDevice;

/**
 * @author Gokalp on 10/5/22
 */
public class Headphone implements AudioDevice{
    @Override
    public void playSound(String sound) {
        System.out.println("Headphone: " + sound);

    }
}
