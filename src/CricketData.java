import java.util.ArrayList;
import java.util.Iterator;

public class CricketData implements Subject {
    int runs;
    int wickets;
    float overs;

    ArrayList<Observer> observers;

    public CricketData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observers.indexOf(observer));
    }

    @Override
    public void notifyObservers() {
        for(Iterator<Observer> it = observers.iterator(); it.hasNext();) {
            Observer o = it.next();
            o.update(runs, wickets, overs);
        }
    }

    // get latest runs from stadium
    private int getLatestRuns() {
        return 90;
    }

    // get latest wickets from stadium
    private int getLatestWickets() {
        return 2;
    }

    // get latest overs from stadium
    private float getLatestOvers () {
        return (float) 10.2;
    }

    // this method is used update displays when data changes
    public void dataChanged() {
        // get latest data
        this.runs = this.getLatestRuns();
        this.wickets = this.getLatestWickets();
        this.overs = this.getLatestOvers();

        this.notifyObservers();
    }
}
