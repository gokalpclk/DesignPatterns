package structural.bridge;


import structural.bridge.audioDevice.Headphone;
import structural.bridge.device.ComputerHeadphoneFizy;
import structural.bridge.device.Phone;
import structural.bridge.player.Spotify;

/**
 * @author Gokalp on 10/5/22
 */
public class Main {
    public static void main(String[] args) {
        Music music = new Music("Sezen Aksu - Gulumse", "Gulumse Haydi Gulumse");
        ComputerHeadphoneFizy computerHeadphoneFizy = new ComputerHeadphoneFizy();
        computerHeadphoneFizy.playMusic(music);


        System.out.println("****************");
        Phone phone = new Phone(new Headphone(), new Spotify());
        phone.playMusic(music);
    }
}
