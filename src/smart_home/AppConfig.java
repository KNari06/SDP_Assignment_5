package smart_home;

import smart_home.devices.*;
import smart_home.decorators.*;

public class AppConfig {

    public Light getLight() {
        Device light = new Light();
        light = new VoiceControlDecorator(new EnergySavingDecorator(light));
        return (Light) ((DeviceDecorator) ((DeviceDecorator) light).getDevice()).getDevice();
    }

    public MusicSystem getMusicSystem() {
        Device music = new MusicSystem();
        music = new RemoteAccessDecorator(new EnergySavingDecorator(music));
        return (MusicSystem) ((DeviceDecorator) ((DeviceDecorator) music).getDevice()).getDevice();
    }

    public Thermostat getThermostat() {
        Device thermostat = new Thermostat();
        thermostat = new EnergySavingDecorator(thermostat);
        return (Thermostat) ((DeviceDecorator) thermostat).getDevice();
    }

    public SecurityCamera getCamera() {
        Device camera = new SecurityCamera();
        camera = new RemoteAccessDecorator(camera);
        return (SecurityCamera) ((DeviceDecorator) camera).getDevice();
    }
}
