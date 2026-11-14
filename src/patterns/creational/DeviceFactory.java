package patterns.creational;

import patterns.structural.decorator.DeviceDecorator;
import patterns.behavioral.observer.Observer;

public interface DeviceFactory {
    void turnOn();
    void turnOff();
    String getStatus();
}