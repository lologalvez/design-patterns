package display;

import song.Song;

public class SocialDisplay implements Observer {
    @Override
    public void update(Song song) {
        System.out.println("Social display: Lolo is now playing " + song.toString() + ".");
    }
}
