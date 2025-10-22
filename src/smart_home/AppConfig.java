package smart_home.config;

import smart_home.devices.*;
import smart_home.decorators.*;
import smart_home.facade.HomeAutomationFacade;

public class AppConfig {
    public Device createLight() {
        return new VoiceControlDecorator(new EnergySavingDecorator(new Light()));
    }

    public Device createMusicSystem() {
        return new RemoteAccessDecorator(new EnergySavingDecorator(new MusicSystem()));
    }

    public Device createThermostat() {
        return new EnergySavingDecorator(new Thermostat());
    }

    public Device createCamera() {
        return new RemoteAccessDecorator(new SecurityCamera());
    }

    public HomeAutomationFacade createFacade() {
        return new HomeAutomationFacade(createLight(), createMusicSystem(), createThermostat(), createCamera());
    }
}
