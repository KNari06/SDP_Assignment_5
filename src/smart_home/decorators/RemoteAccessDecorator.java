package smart_home.decorators;

import smart_home.devices.Device;

public class RemoteAccessDecorator extends DeviceDecorator {
    public RemoteAccessDecorator(Device device) {
        super(device);
    }

    @Override
    public void operate() {
        System.out.println("Remote access active.");
        device.operate();
    }
}


