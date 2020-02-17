import display.Observer;

public interface Observable {
    void subscribe(Observer observer);
    void next();
}
