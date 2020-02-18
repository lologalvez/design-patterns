package widgets;

import song.Song;

public class MainWidget implements Observer {
    @Override
    public void update(Song song) {
        System.out.println("Main Display: now playing " + song.toString() + ".");
    }
}
