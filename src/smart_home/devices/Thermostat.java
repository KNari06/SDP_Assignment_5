package smart_home.devices;

public class Thermostat implements Device {
    @Override
    public void operate() {
        System.out.println("Thermostat is set to comfortable temperature.");
    }

    public void ecoMode() {
        System.out.println("Thermostat is now in eco mode.");
    }
}
