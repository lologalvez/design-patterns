package widgets;

import song.Song;

public class HistoryWidget implements CurrentSongObserver {
    @Override
    public void update(Song song) {
        System.out.println("History Display: last song played is " + song.toString() + ".");
    }
}
