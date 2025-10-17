package smart_home.devices;

public class SecurityCamera implements Device {
    private boolean isActive = false;

    @Override
    public void operate() {
        if (isActive) {
            System.out.println("Security camera is turning off.");
            isActive = false;
        } else {
            System.out.println("Security camera is now monitoring.");
            isActive = true;
        }
    }

    public void enableSurveillance() {
        isActive = true;
        System.out.println("Security camera surveillance enabled.");
    }
}