package widgets;
import song.Song;

public interface CurrentSongObserver {
    void update(Song song);
}
