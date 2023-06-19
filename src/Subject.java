
// implemented by Cricket data to communicate with observers
public interface Subject {
    public void registerObserver(Observer observer);
    public void unregisterObserver(Observer observer);
    public void notifyObservers();
}
