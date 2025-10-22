package smart_home.devices;

public class SecurityCamera implements Device {
    @Override
    public void operate() {
        System.out.println("Security camera is monitoring the area.");
    }

    public void enableRecording() {
        System.out.println("Security camera recording started.");
    }
}
