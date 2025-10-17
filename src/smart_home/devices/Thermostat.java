package smart_home.devices;

public class Thermostat implements Device {
    private int temperature = 22;

    @Override
    public void operate() {
        System.out.println("Thermostat is maintaining " + temperature + "°C.");
    }

    public void setEcoMode() {
        temperature = 18;
        System.out.println("Thermostat set to Eco Mode (18°C).");
    }
}