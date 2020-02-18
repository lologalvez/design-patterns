package widgets;

import song.Song;

public class NotificationDrawerWidget implements Observer {
    @Override
    public void update(Song song) {
        System.out.println("Notification drawer: now playing " + song.toString() + ".");
    }
}
