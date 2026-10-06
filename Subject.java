/**
 * ACS-3913-770 - Assignment 1 F2026
 */

public interface Subject{
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
