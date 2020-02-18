import widgets.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import song.Song;

import java.net.SocketImpl;
import java.util.List;

import static org.mockito.Mockito.*;

public class YoutubeMusicQueueShould {

    @Test
    public void be_able_to_get_new_songs_added_to_the_queue() {
        Song randomSong = new Song("Random Song", "Random Band");
        Song anotherRandomSong = new Song("Another Random Song", "Random Band" );
        YoutubeMusicQueue queue = new YoutubeMusicQueue(randomSong);

        queue.addSong(anotherRandomSong);

        Assertions.assertEquals(2, queue.getQueueSize());
    }

    @Test
    public void be_able_to_get_song_removed_from_queue() {
        Song randomSong = new Song("Random Song", "Random Band");
        YoutubeMusicQueue queue = new YoutubeMusicQueue(randomSong);

        queue.removeSong(randomSong);

        Assertions.assertEquals(0, queue.getQueueSize());
    }

    @Test
    public void be_able_to_skip_to_next_song() {
        Song randomSongOne = new Song("Random Song 1", "Random Band");
        Song randomSongTwo = new Song("Random Song 2", "Random Band");
        YoutubeMusicQueue queue = new YoutubeMusicQueue(randomSongOne);
        YoutubeMusicQueue expectedQueue = new YoutubeMusicQueue(randomSongTwo);

        queue.addSong(randomSongTwo);
        queue.nextSong();

        Assertions.assertEquals(expectedQueue, queue);
    }

    @Test
    public void notify_all_registered_displays_when_playing_video_changes() {
        song.Song randomSongOne = new song.Song("Random Song 1", "Random Band");
        song.Song randomSongTwo = new song.Song("Random Song 2", "Random Band");
        YoutubeMusicQueue queue = new YoutubeMusicQueue(randomSongOne);
        Observer mockMainWidget = mock(MainWidget.class);
        Observer mockHistoryWidget = mock(HistoryWidget.class);
        Observer mockSocialWidget = mock(SocialWidget.class);
        Observer mockNotificationDrawerWidget = mock(NotificationDrawerWidget.class);
        queue.subscribe(mockMainWidget);
        queue.subscribe(mockNotificationDrawerWidget);
        queue.subscribe(mockHistoryWidget);
        queue.subscribe(mockSocialWidget);
        queue.addSong(randomSongTwo);
        queue.nextSong();

        verify(mockMainWidget, times(2)).update(any(Song.class));
        verify(mockHistoryWidget, times(2)).update(any(Song.class));
        verify(mockSocialWidget, times(2)).update(any(Song.class));
        verify(mockNotificationDrawerWidget, times(2)).update(any(Song.class));
    }
}



