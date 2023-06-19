// this interface is implemented by all those
// classes that are to be updated whenever there
// is an update from CricketData

public interface Observer {
    void update(int runs, int wickets, float overs);
}
