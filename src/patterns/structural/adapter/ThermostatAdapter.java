package patterns.structural.adapter;

public class ThermostatAdapter implements IThermostat {
    private LegacyThermostat legacyThermostat;

    public ThermostatAdapter(LegacyThermostat legacyThermostat) {
        this.legacyThermostat = legacyThermostat;
    }

    @Override
    public void setTemperature(int temperature) {
        legacyThermostat.setOldSystemTemp(temperature);
    }

    @Override
    public int getTemperature() {
        return legacyThermostat.getOldSystemTemp();
    }
}