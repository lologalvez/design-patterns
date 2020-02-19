import widgets.CurrentSongObserver;
import song.Song;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class YoutubeMusicQueue implements Observable {

    private LinkedList<Song> songQueue;
    private final ArrayList<CurrentSongObserver> widgets;
    private Song nowPlaying;

    public YoutubeMusicQueue(Song song) {
        this.songQueue = new LinkedList<>();
        this.songQueue.add(song);
        this.nowPlaying = song;
        this.widgets = new ArrayList<CurrentSongObserver>();
    }

    public void subscribe(CurrentSongObserver currentSongObserver) {
        this.widgets.add(currentSongObserver);
        currentSongObserver.update(this.nowPlaying);
    }

    public void unsubscribe(CurrentSongObserver currentSongObserver) {
        this.widgets.remove(currentSongObserver);
    }

    public void nextSong() {
        this.songQueue.removeFirst();
        this.nowPlaying = this.songQueue.getFirst();
        this.notifySubscribers();
    }

    public void notifySubscribers() {
        for(CurrentSongObserver widget: this.widgets) {
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
