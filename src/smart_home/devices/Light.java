package smart_home.devices;

public class Light implements Device {
    private boolean isOn = false;
    private int brightness = 50;

    @Override
    public void operate() {
        if (isOn) {
            System.out.println("Light turned off.");
            isOn = false;
        } else {
            isOn = true;
            brightness = 70;
            System.out.println("Light turned on. Brightness: " + brightness + "%");
        }
    }

    public void dimLight() {
        if (isOn) {
            brightness = 30;
            System.out.println("Light dimmed to " + brightness + "%.");
        } else {
            System.out.println("Light is off, can't dim.");
        }
    }
}
