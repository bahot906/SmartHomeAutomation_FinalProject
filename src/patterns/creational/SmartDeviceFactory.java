package patterns.creational;

public class SmartDeviceFactory {
    public static DeviceFactory createDevice(String type, String name) {
        if (type.equalsIgnoreCase("LIGHT")) {
            return new SmartLight(name);
        } else if (type.equalsIgnoreCase("CAMERA")) {
            return new SmartCamera(name);
        }
        throw new IllegalArgumentException("Unknown device type: " + type);
    }

    private static class SmartLight implements DeviceFactory {
        private String name;
        private boolean isOn;

        public SmartLight(String name) { this.name = name; }
        public void turnOn() { isOn = true; System.out.println("[Light] " + name + " is turned ON."); }
        public void turnOff() { isOn = false; System.out.println("[Light] " + name + " is turned OFF."); }
        public String getStatus() { return name + " Light is " + (isOn ? "ON" : "OFF"); }
    }

    private static class SmartCamera implements DeviceFactory {
        private String name;
        private boolean isOn;

        public SmartCamera(String name) { this.name = name; }
        public void turnOn() { isOn = true; System.out.println("[Camera] " + name + " recording started."); }
        public void turnOff() { isOn = false; System.out.println("[Camera] " + name + " recording stopped."); }
        public String getStatus() { return name + " Camera is " + (isOn ? "Active" : "Inactive"); }
    }
}
