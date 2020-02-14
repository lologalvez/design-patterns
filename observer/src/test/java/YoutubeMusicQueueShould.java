import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YoutubeMusicQueueShould {

    @Test
    public void be_able_to_get_new_songs_added_to_the_queue() {
        Song randomSong = new Song("Random Song");
        Song anotherRandomSong = new Song("Another Random Song");
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

    /*@Test
    public void notify_all_registered_displays_when_playing_video_changes() {
        YoutubeMusicQueue queue = new YoutubeMusicQueue();
        Song randomSongOne = new Song("Random Video 1");
        Song randomSongTwo = new Song("Random Video 2");
        YoutubeMusicQueue expectedQueue = new YoutubeMusicQueue();

        queue.add(randomSongOne);
        queue.add(randomSongTwo);
        queue.next();

        Assertions.assertEquals(expectedQueue, queue);
    }*/
}



