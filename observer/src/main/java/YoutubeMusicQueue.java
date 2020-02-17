import display.Observer;
import song.Song;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class YoutubeMusicQueue implements Observable {

    private final ArrayList<Observer> displays;
    private LinkedList<Song> songQueue;
    private Song nowPlaying;

    public YoutubeMusicQueue(Song song) {
        this.songQueue = new LinkedList<>();
        this.songQueue.add(song);
        this.nowPlaying = song;
        this.displays = new ArrayList<Observer>();
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
        this.notifySubscribers();
    }

    private void notifySubscribers() {
        for(Observer display: this.displays) {
            display.update(this.nowPlaying);
        }
    }

    public void subscribe(Observer observer) {
        this.displays.add(observer);
        observer.update(this.nowPlaying);
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
