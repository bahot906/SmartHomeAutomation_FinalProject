package patterns.behavioral.observer;
import java.util.ArrayList;
import java.util.List;

public class AutomationHub implements Subject {
    private static AutomationHub instance;
    private List<Observer> observers = new ArrayList<>();
    private String latestEvent;

    private AutomationHub() {}

    public static synchronized AutomationHub getInstance() {
        if (instance == null) {
            instance = new AutomationHub();
        }
        return instance;
    }

    public void triggerEvent(String eventDescription) {
        this.latestEvent = eventDescription;
        System.out.println("\n[Hub Event Triggered]: " + latestEvent);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) { observers.add(o); }

    @Override
    public void removeObserver(Observer o) { observers.remove(o); }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestEvent);
        }
    }
}
