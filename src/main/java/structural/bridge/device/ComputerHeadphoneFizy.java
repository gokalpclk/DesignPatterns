package structural.bridge.device;

import structural.bridge.Music;
import structural.bridge.audioDevice.Headphone;
import structural.bridge.device.ComputerCanPlayMusic;
import structural.bridge.player.Fizy;

/**
 * @author Gokalp on 10/5/22
 */
public class ComputerHeadphoneFizy extends ComputerCanPlayMusic {
    public ComputerHeadphoneFizy() {
        audioDevice = new Headphone();
        musicPlayer = new Fizy();
    }

    @Override
    public void playMusic(Music music) {
        super.playMusic(music);
    }
}
