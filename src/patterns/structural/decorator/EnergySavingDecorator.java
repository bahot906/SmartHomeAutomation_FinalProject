package patterns.structural.decorator;
import patterns.creational.DeviceFactory;

public class EnergySavingDecorator extends DeviceDecorator {
    public EnergySavingDecorator(DeviceFactory decoratedDevice) {
        super(decoratedDevice);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        enablePowerSavingFeature();
    }

    private void enablePowerSavingFeature() {
        System.out.println("--> [Decorator] Eco-Power Saving Mode activated on device.");
    }
}