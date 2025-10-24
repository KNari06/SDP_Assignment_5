package smart_home.devices;

public class Thermostat implements Device {
    private boolean ecoMode = false;
    private double temperature = 22.0;

    @Override
    public void operate() {
        if (ecoMode) {
            ecoMode = false;
            temperature = 22.0;
            System.out.println("Thermostat: Normal mode, " + temperature + "°C");
        } else {
            ecoMode = true;
            temperature = 19.0;
            System.out.println("Thermostat: Eco mode, " + temperature + "°C");
        }
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        System.out.println("Thermostat set to " + temperature + "°C");
    }
}
