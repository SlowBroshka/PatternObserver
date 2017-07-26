package Observer;

/**
 * Created by slowbro on 18.07.17.
 */
public interface Subject {
    public void registerObserver(Observer obs);
    public void removeObserver(Observer obs);
    public void notifyObserver();
}
