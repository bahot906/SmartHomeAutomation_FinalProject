package patterns.behavioral.strategy;

public class ComfortModeStrategy implements AutomationStrategy {
    @Override
    public void executeRoutine() {
        System.out.println("[Strategy] Executing COMFORT Mode: Brightening lights, setting thermostat to 22°C.");
    }
}