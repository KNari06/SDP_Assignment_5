package smart_home.devices;

public class SecurityCamera implements Device {
    private boolean active = false;

    @Override
    public void operate() {
        if (active) {
            System.out.println("Security camera deactivated.");
            active = false;
        } else {
            System.out.println("Security camera activated and recording.");
            active = true;
        }
    }
}
