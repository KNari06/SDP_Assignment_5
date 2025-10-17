package smart_home.decorators;

import smart_home.devices.Device;

public class VoiceControlDecorator extends DeviceDecorator {

    public VoiceControlDecorator(Device device) {
        super(device);
    }

    @Override
    public void operate() {
        super.operate();
        System.out.println("Voice control enabled for this device.");
    }

    public void voiceCommand(String command) {
        System.out.println("Executing voice command: " + command);
    }
}