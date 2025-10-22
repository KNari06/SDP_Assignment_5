package smart_home.devices;

public class Thermostat implements Device {
    private int temperature = 22;

    @Override
    public void operate() {
        System.out.println("Thermostat set to " + temperature + "°C");
    }

    public void ecoMode() {
        temperature = 18;
        System.out.println("Thermostat set to eco mode");
    }
}
