import display.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import song.Song;

public class YoutubeMusicQueueShould {

    @Test
    public void be_able_to_get_new_songs_added_to_the_queue() {
        Song randomSong = new Song("Random song.Song");
        Song anotherRandomSong = new Song("Another Random song.Song");
        YoutubeMusicQueue queue = new YoutubeMusicQueue(randomSong);

        queue.add(anotherRandomSong);

        Assertions.assertEquals(2, queue.getQueueSize());
    }

    @Test
    public void be_able_to_get_song_removed_from_queue() {
        Song randomSong = new Song("Random Video");
        YoutubeMusicQueue queue = new YoutubeMusicQueue(randomSong);

        queue.remove(randomSong);

        Assertions.assertEquals(0, queue.getQueueSize());
    }

    @Test
    public void be_able_to_skip_to_next_song() {
        Song randomSongOne = new Song("Random Video 1");
        Song randomSongTwo = new Song("Random Video 2");
        YoutubeMusicQueue queue = new YoutubeMusicQueue(randomSongOne);
        YoutubeMusicQueue expectedQueue = new YoutubeMusicQueue(randomSongTwo);

        queue.add(randomSongTwo);
        queue.next();

        Assertions.assertEquals(expectedQueue, queue);
    }

    @Test
    public void notify_all_registered_displays_when_playing_video_changes() {
        song.Song randomSongOne = new song.Song("Random Song 1");
        song.Song randomSongTwo = new song.Song("Random Song 2");
        YoutubeMusicQueue queue = new YoutubeMusicQueue(randomSongOne);
        Observer mainDisplay = new MainDisplay();
        Observer notificationDrawerDisplay = new NotificationDrawerDisplay();
        Observer historyDisplay = new HistoryDisplay();
        Observer socialDisplay = new SocialDisplay();

        queue.subscribe(mainDisplay);
        queue.subscribe(notificationDrawerDisplay);
        queue.subscribe(historyDisplay);
        queue.subscribe(socialDisplay);
        queue.add(randomSongTwo);
        queue.next();

        /*Assertions.assertEquals(expectedQueue, queue);*/
        /* verify().update(Song concreteSong) -> Mockito to be used here */
    }
}



