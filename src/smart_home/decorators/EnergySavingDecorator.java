package smart_home.decorators;

import smart_home.devices.Device;

public class EnergySavingDecorator extends DeviceDecorator {
    public EnergySavingDecorator(Device device) {
        super(device);
    }

    @Override
    public void operate() {
        System.out.println("Running in energy-saving mode.");
        device.operate();
    }
}


