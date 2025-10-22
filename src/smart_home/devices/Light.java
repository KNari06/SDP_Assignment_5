package smart_home.devices;

public class Light implements Device {
    private boolean on = false;
    private int brightness = 100;

    @Override
    public void operate() {
        if (on) {
            System.out.println("Light off");
            on = false;
        } else {
            System.out.println("Light on");
            on = true;
        }
    }

    public void dim(int value) {
        brightness = Math.max(0, Math.min(100, value));
        System.out.println("Light dimmed to " + brightness + "%");
    }
}
