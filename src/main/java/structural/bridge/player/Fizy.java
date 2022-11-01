package structural.bridge.player;

import structural.bridge.Music;

/**
 * @author Gokalp on 10/5/22
 */
public class Fizy implements MusicPlayer{
    @Override
    public String playMusic(Music music) {
        System.out.println("Fizzy: " + music);
        return music.getSound();
    }
}
