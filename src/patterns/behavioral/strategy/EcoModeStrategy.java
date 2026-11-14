package patterns.behavioral.strategy;

public class EcoModeStrategy implements AutomationStrategy {
    @Override
    public void executeRoutine() {
        System.out.println("[Strategy] Executing ECO Mode: Dimming lights, setting thermostat to 18°C.");
    }
}