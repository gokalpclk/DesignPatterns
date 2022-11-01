package structural.bridge.audioDevice;

/**
 * @author Gokalp on 10/5/22
 */
public class Speaker  implements AudioDevice{
    public void playSound(String sound) {
        System.out.println("Speaker: " + sound);
    }
}
