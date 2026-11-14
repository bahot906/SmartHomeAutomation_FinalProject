import patterns.creational.DeviceFactory;
import patterns.creational.SmartDeviceFactory;
import patterns.structural.adapter.IThermostat;
import patterns.structural.adapter.LegacyThermostat;
import patterns.structural.adapter.ThermostatAdapter;
import patterns.structural.decorator.EnergySavingDecorator;
import patterns.behavioral.observer.AutomationHub;
import patterns.behavioral.observer.MobileApp;
import patterns.behavioral.strategy.AutomationStrategy;
import patterns.behavioral.strategy.EcoModeStrategy;
import patterns.behavioral.strategy.ComfortModeStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SMART HOME AUTOMATION SYSTEM INITIALIZED ===");

        // 1. Factory & Decorator Patterns Demo
        System.out.println("\n--- Testing Factory & Decorator ---");
        DeviceFactory rawLight = SmartDeviceFactory.createDevice("LIGHT", "Living Room");
        DeviceFactory smartEcoLight = new EnergySavingDecorator(rawLight);
        smartEcoLight.turnOn();

        // 2. Adapter Pattern Demo
        System.out.println("\n--- Testing Adapter Pattern ---");
        LegacyThermostat legacyTh = new LegacyThermostat();
        IThermostat thermostat = new ThermostatAdapter(legacyTh);
        thermostat.setTemperature(21);
        System.out.println("Current Thermostat Reading: " + thermostat.getTemperature() + "°C");

        // 3. Singleton & Observer Patterns Demo
        System.out.println("\n--- Testing Singleton & Observer Patterns ---");
        AutomationHub hub = AutomationHub.getInstance();
        MobileApp userApp1 = new MobileApp("Alice");
        MobileApp userApp2 = new MobileApp("Bob");

        hub.registerObserver(userApp1);
        hub.registerObserver(userApp2);

        hub.triggerEvent("Motion detected in the front yard!");

        // 4. Strategy Pattern Demo
        System.out.println("\n--- Testing Strategy Pattern ---");
        AutomationStrategy strategy;

        // Switch to Eco Mode
        strategy = new EcoModeStrategy();
        strategy.executeRoutine();

        // Switch to Comfort Mode
        strategy = new ComfortModeStrategy();
        strategy.executeRoutine();

        System.out.println("\n=== ALL SYSTEM TESTS COMPLETED SUCCESSFULLY ===");
    }
}
