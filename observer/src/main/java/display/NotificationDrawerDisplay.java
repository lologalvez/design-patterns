package display;

import song.Song;

public class NotificationDrawerDisplay implements Observer {
    @Override
    public void update(Song song) {
        System.out.println("Notification drawer: now playing " + song.toString() + ".");
    }
}
