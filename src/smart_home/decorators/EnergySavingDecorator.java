package smart_home.decorators;

import smart_home.devices.Device;

public class EnergySavingDecorator extends DeviceDecorator {

    public EnergySavingDecorator(Device device) {
        super(device);
    }

    @Override
    public void operate() {
        super.operate();
        System.out.println("Energy-saving mode activated for this device.");
    }
}