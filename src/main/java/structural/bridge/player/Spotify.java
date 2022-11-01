package structural.bridge.player;

import structural.bridge.Music;

/**
 * @author Gokalp on 10/5/22
 */
public class Spotify implements MusicPlayer{
    @Override
    public String playMusic(Music music){
        System.out.println("Spotify: " +music);
        return music.getSound();
    }
}
