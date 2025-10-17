package smart_home;

import smart_home.devices.*;
import smart_home.decorators.*;

public final class AppConfig {
    private AppConfig() {}

    public static Device createLight() {
        Device base = new Light();
        base = new EnergySavingDecorator(base);
        base = new VoiceControlDecorator(base);
        return base;
    }

    public static Device createMusic() {
        Device base = new MusicSystem();
        base = new RemoteAccessDecorator(base);
        base = new EnergySavingDecorator(base);
        return base;
    }

    public static Device createThermostat() {
        Device base = new Thermostat();
        base = new RemoteAccessDecorator(base);
        return base;
    }

    public static Device createCamera() {
        Device base = new SecurityCamera();
        base = new RemoteAccessDecorator(base);
        return base;
    }
}