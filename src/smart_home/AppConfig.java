package smart_home.config;

import smart_home.devices.*;
import smart_home.decorators.*;

public class AppConfig {
    public Light getLight() {
        return new Light();
    }

    public MusicSystem getMusicSystem() {
        Device system = new MusicSystem();
        system = new RemoteAccessDecorator(new EnergySavingDecorator(system));
        return (MusicSystem) ((DeviceDecorator) system).device;
    }

    public Thermostat getThermostat() {
        return new Thermostat();
    }

    public SecurityCamera getCamera() {
        return new SecurityCamera();
    }
}
