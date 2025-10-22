package smart_home.devices;

public class SecurityCamera implements Device {
    private boolean recording = false;

    @Override
    public void operate() {
        if (recording) {
            System.out.println("Camera stopped recording");
            recording = false;
        } else {
            System.out.println("Camera recording");
            recording = true;
        }
    }

    public void enableSecurity() {
        recording = true;
        System.out.println("Security system enabled");
    }
}
