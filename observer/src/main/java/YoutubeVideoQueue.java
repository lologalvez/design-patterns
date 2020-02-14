import java.util.LinkedList;
import java.util.Objects;

public class YoutubeVideoQueue {

    private LinkedList<Video> videoQueue;
    private Video nowPlaying;

    public YoutubeVideoQueue() {
        this.videoQueue = new LinkedList<>();
    }

    public YoutubeVideoQueue(Video video) {
        this.videoQueue = new LinkedList<>();
        this.videoQueue.add(video);
        this.nowPlaying = video;
    }

    public void add(Video video) {
        this.videoQueue.add(video);
    }

    public void remove(Video video) {
        this.videoQueue.remove(video);
    }

    public void play() {
        this.nowPlaying = this.videoQueue.getFirst();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YoutubeVideoQueue that = (YoutubeVideoQueue) o;

        return Objects.equals(videoQueue, that.videoQueue);
    }

    @Override
    public int hashCode() {
        return videoQueue != null ? videoQueue.hashCode() : 0;
    }

}
