package smart_home.devices;

public class Light implements Device {
    private boolean isOn = false;

    @Override
    public void operate() {
        if (isOn) {
            System.out.println("Light is turning off.");
            isOn = false;
        } else {
            System.out.println("Light is turning on.");
            isOn = true;
        }
    }

    public void dim(int level) {
        System.out.println("Light dimmed to " + level + "% brightness.");
    }
}