import song.Song;
import widgets.HistoryWidget;
import widgets.MainWidget;
import widgets.NotificationDrawerWidget;
import widgets.SocialWidget;

public class YoutubeMusicPlayer {

    public static void main(String[] args) {

        Song strangeDenial = new Song("Strange Denial", "Bad Religion");
        Song designInMalice = new Song("Design In Malice", "Jedi Mind Tricks");

        YoutubeMusicQueue queue = new YoutubeMusicQueue(strangeDenial);
        queue.addSong(designInMalice);

        queue.subscribe(new MainWidget());
        queue.subscribe(new HistoryWidget());
        queue.subscribe(new NotificationDrawerWidget());
        queue.subscribe(new SocialWidget());

        System.out.println("\n------ Next song clicked ------\n");
        queue.nextSong();

        Song standBy = new Song("Standby", "Extremoduro");
        queue.addSong(standBy);
        System.out.println("\n------ New song added to the queue ------\n");
        System.out.println("\n------ Next song clicked ------\n");

        queue.nextSong();
    }
}
