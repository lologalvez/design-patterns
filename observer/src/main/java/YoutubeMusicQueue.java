import java.util.LinkedList;
import java.util.Objects;

public class YoutubeMusicQueue {

    private LinkedList<Song> songQueue;
    private Song nowPlaying;

    public YoutubeMusicQueue(Song song) {
        this.songQueue = new LinkedList<>();
        this.songQueue.add(song);
        this.nowPlaying = song;
    }

    public void add(Song song) {
        this.songQueue.add(song);
    }

    public void remove(Song song) {
        this.songQueue.remove(song);
    }

    public void next() {
        this.songQueue.removeFirst();
        this.nowPlaying = this.songQueue.getFirst();
    }

    public int getQueueSize() {
        return this.songQueue.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YoutubeMusicQueue that = (YoutubeMusicQueue) o;

        return Objects.equals(songQueue, that.songQueue);
    }

    @Override
    public int hashCode() {
        return songQueue != null ? songQueue.hashCode() : 0;
    }

}
