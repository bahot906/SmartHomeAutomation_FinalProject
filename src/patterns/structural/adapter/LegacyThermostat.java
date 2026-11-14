package patterns.structural.adapter;

public class LegacyThermostat {
    private int legacyTemp = 20;
    public void setOldSystemTemp(int temp) {
        this.legacyTemp = temp;
        System.out.println("[Legacy Thermostat] Temperature adjusted to " + temp + "°C via legacy protocol.");
    }
    public int getOldSystemTemp() { return legacyTemp; }
}