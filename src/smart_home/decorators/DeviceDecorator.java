package smart_home.decorators;

import smart_home.devices.Device;

public abstract class DeviceDecorator implements Device {
    protected Device wrappedDevice;

    public DeviceDecorator(Device wrappedDevice) {
        this.wrappedDevice = wrappedDevice;
    }

    @Override
    public void operate() {
        wrappedDevice.operate();
    }
}
