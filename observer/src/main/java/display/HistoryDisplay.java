package display;

import song.Song;

public class HistoryDisplay implements Observer {
    @Override
    public void update(Song song) {
        System.out.println("History Display: last song played is " + song.toString() + ".");
    }
}
