package smart_home.decorators;

import smart_home.devices.Device;

public abstract class DeviceDecorator implements Device {
    protected Device decoratedDevice;

    public DeviceDecorator(Device device) {
        this.decoratedDevice = device;
    }

    @Override
    public void operate() {
        decoratedDevice.operate();
    }
}