package song;

import java.util.Objects;

public class Song {
    private final String songTitle;
    private final String band;

    public Song(String songTitle, String band) {
        this.songTitle = songTitle;
        this.band = band;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (!Objects.equals(songTitle, song.songTitle)) return false;
        return Objects.equals(band, song.band);
    }

    @Override
    public int hashCode() {
        int result = songTitle != null ? songTitle.hashCode() : 0;
        result = 31 * result + (band != null ? band.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return songTitle + " by " + band;
    }
}
