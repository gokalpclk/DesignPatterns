package structural.bridge.device;

import structural.bridge.Music;
import structural.bridge.audioDevice.AudioDevice;
import structural.bridge.player.MusicPlayer;

/**
 * @author Gokalp on 10/5/22
 */
public class Phone extends ComputerCanPlayMusic {
    public Phone(AudioDevice audioDevice, MusicPlayer musicPlayer) {
        super(audioDevice, musicPlayer);
    }

    @Override
    public void playMusic(Music music) {
        System.out.println("Phone: " + music );
        super.playMusic(music);
    }
}
