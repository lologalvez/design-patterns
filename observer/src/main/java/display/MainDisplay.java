package display;

import song.Song;

public class MainDisplay implements Observer {
    @Override
    public void update(Song song) {
        System.out.println("Main Display: now playing " + song.toString() + ".");
    }
}
