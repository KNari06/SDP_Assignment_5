package smart_home.decorators;

import smart_home.devices.Device;

public class RemoteAccessDecorator extends DeviceDecorator {
    public RemoteAccessDecorator(Device wrappedDevice) {
        super(wrappedDevice);
    }

    @Override
    public void operate() {
        super.operate();
        System.out.println("Remote access enabled for this device.");
    }
}
