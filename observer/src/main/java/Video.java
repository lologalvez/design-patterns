import java.util.Objects;

public class Video {
    private final String videoTitle;

    public Video(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Video video = (Video) o;

        return Objects.equals(videoTitle, video.videoTitle);
    }

    @Override
    public int hashCode() {
        return videoTitle != null ? videoTitle.hashCode() : 0;
    }
}
