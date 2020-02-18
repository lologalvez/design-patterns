package song;

import java.util.Objects;

public class Song {
    private final String videoTitle;
    private final String band;

    public Song(String songTitle, String band) {
        this.videoTitle = songTitle;
        this.band = band;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (!Objects.equals(videoTitle, song.videoTitle)) return false;
        return Objects.equals(band, song.band);
    }

    @Override
    public int hashCode() {
        int result = videoTitle != null ? videoTitle.hashCode() : 0;
        result = 31 * result + (band != null ? band.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return videoTitle + " by " + band;
    }
}
