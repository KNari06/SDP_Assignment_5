package smart_home.facade;

import smart_home.devices.*;

public class HomeAutomationFacade {
    private Light light;
    private MusicSystem music;
    private Thermostat thermostat;
    private SecurityCamera camera;

    public HomeAutomationFacade(Light light, MusicSystem music, Thermostat thermostat, SecurityCamera camera) {
        this.light = light;
        this.music = music;
        this.thermostat = thermostat;
        this.camera = camera;
    }

    public void startPartyMode() {
        System.out.println("\n--- Party Mode ---");
        light.operate();
        light.dimLight();
        music.operate();
        music.setVolume(90);
    }

    public void activateNightMode() {
        System.out.println("\n--- Night Mode ---");
        light.dimLight();
        thermostat.operate();
        camera.operate();
    }

    public void leaveHome() {
        System.out.println("\n--- Leaving Home ---");
        light.operate();
        music.operate();
        camera.operate();
        thermostat.setTemperature(18.0);
    }
}
