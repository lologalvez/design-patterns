import java.util.Objects;

public class Song {
    private final String videoTitle;

    public Song(String songTitle) {
        this.videoTitle = songTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        return Objects.equals(videoTitle, song.videoTitle);
    }

    @Override
    public int hashCode() {
        return videoTitle != null ? videoTitle.hashCode() : 0;
    }
}
