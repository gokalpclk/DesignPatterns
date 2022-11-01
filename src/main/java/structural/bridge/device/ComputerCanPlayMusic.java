package structural.bridge.device;

import structural.bridge.Music;
import structural.bridge.audioDevice.AudioDevice;
import structural.bridge.player.MusicPlayer;

/**
 * @author Gokalp on 10/5/22
 */
public abstract class ComputerCanPlayMusic {
    protected AudioDevice audioDevice;
    protected MusicPlayer musicPlayer;

    public ComputerCanPlayMusic() {
    }

    public ComputerCanPlayMusic(AudioDevice audioDevice, MusicPlayer musicPlayer) {
        this.audioDevice = audioDevice;
        this.musicPlayer = musicPlayer;
    }

    public void playMusic(Music music) {
        String sound = musicPlayer.playMusic(music);
        audioDevice.playSound(sound);
    }
}
