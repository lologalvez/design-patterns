import widgets.Observer;
import song.Song;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class YoutubeMusicQueue implements Observable {

    private LinkedList<Song> songQueue;
    private final ArrayList<Observer> widgets;
    private Song nowPlaying;

    public YoutubeMusicQueue(Song song) {
        this.songQueue = new LinkedList<>();
        this.songQueue.add(song);
        this.nowPlaying = song;
        this.widgets = new ArrayList<Observer>();
    }

    public void subscribe(Observer observer) {
        this.widgets.add(observer);
        observer.update(this.nowPlaying);
    }

    public void unsubscribe(Observer observer) {
        this.widgets.remove(observer);
    }

    public void nextSong() {
        this.songQueue.removeFirst();
        this.nowPlaying = this.songQueue.getFirst();
        this.notifySubscribers();
    }

    public void notifySubscribers() {
        for(Observer widget: this.widgets) {
            widget.update(this.nowPlaying);
        }
    }

    public void addSong(Song song) {
        this.songQueue.add(song);
    }
    public void removeSong(Song song) {
        this.songQueue.remove(song);
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
