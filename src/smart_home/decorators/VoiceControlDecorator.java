package smart_home.decorators;

import smart_home.devices.Device;

public class VoiceControlDecorator extends DeviceDecorator {
    public VoiceControlDecorator(Device device) {
        super(device);
    }

    @Override
    public void operate() {
        System.out.println("Voice control active");
        super.operate();
    }
}
