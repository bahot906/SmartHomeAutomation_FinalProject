package patterns.structural.decorator;
import patterns.creational.DeviceFactory;

public abstract class DeviceDecorator implements DeviceFactory {
    protected DeviceFactory decoratedDevice;

    public DeviceDecorator(DeviceFactory decoratedDevice) {
        this.decoratedDevice = decoratedDevice;
    }

    public void turnOn() { decoratedDevice.turnOn(); }
    public void turnOff() { decoratedDevice.turnOff(); }
    public String getStatus() { return decoratedDevice.getStatus(); }
}