import widgets.CurrentSongObserver;

public interface Observable {
    void subscribe(CurrentSongObserver currentSongObserver);
    void unsubscribe(CurrentSongObserver currentSongObserver);
    void notifySubscribers();
}
