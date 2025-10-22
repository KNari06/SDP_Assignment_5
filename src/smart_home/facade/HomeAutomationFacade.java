package smart_home.facade;

import smart_home.devices.Light;
import smart_home.devices.MusicSystem;
import smart_home.devices.SecurityCamera;
import smart_home.devices.Thermostat;

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
        light.dim(70);
        music.operate();
        music.playLoud();
    }

    public void activateNightMode() {
        System.out.println("\n--- Night Mode ---");
        light.dim(20);
        thermostat.ecoMode();
        camera.enableSecurity();
    }

    public void leaveHome() {
        System.out.println("\n--- Leaving Home ---");
        light.operate();
        music.operate();
        camera.enableSecurity();
    }
}
