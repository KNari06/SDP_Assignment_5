package smart_home.devices;

public class Light implements Device {
    @Override
    public void operate() {
        System.out.println("Light is turned on.");
    }

    public void turnOff() {
        System.out.println("Light is turned off.");
    }
}
