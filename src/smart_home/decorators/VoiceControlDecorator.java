package smart_home.decorators;

import smart_home.devices.Device;

public class VoiceControlDecorator extends DeviceDecorator {
    public VoiceControlDecorator(Device wrappedDevice) {
        super(wrappedDevice);
    }

    @Override
    public void operate() {
        super.operate();
        System.out.println("Voice control enabled for this device.");
    }
}
