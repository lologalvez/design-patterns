import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YoutubeVideoQueueShould {

    @Test
    public void be_able_to_get_new_videos_added_to_the_queue() {
        YoutubeVideoQueue queue = new YoutubeVideoQueue();
        Video randomVideo = new Video("Random Video");
        YoutubeVideoQueue expectedQueue = new YoutubeVideoQueue(randomVideo);

        queue.add(randomVideo);

        Assertions.assertEquals(expectedQueue, queue);
    }

    @Test
    public void be_able_to_get_video_removed_from_queue() {
        YoutubeVideoQueue queue = new YoutubeVideoQueue();
        Video randomVideo = new Video("Random Video");
        YoutubeVideoQueue expectedQueue = new YoutubeVideoQueue();

        queue.add(randomVideo);
        queue.remove(randomVideo);

        Assertions.assertEquals(expectedQueue, queue);
    }

    @Test
    public void start_playing_first_video_in_the_queue() {
        YoutubeVideoQueue queue = new YoutubeVideoQueue();
        Video randomVideoOne = new Video("Random Video 1");
        YoutubeVideoQueue expectedQueue = new YoutubeVideoQueue(randomVideoOne);

        queue.add(randomVideoOne);
        queue.play();

        Assertions.assertEquals(expectedQueue, queue);
    }
}



