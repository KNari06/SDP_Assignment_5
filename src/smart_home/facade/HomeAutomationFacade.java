package smart_home.facade;

import smart_home.devices.Device;
import smart_home.devices.Light;
import smart_home.devices.MusicSystem;
import smart_home.devices.SecurityCamera;
import smart_home.devices.Thermostat;

public class HomeAutomationFacade {
    private final Device[] lights;
    private final Device thermostat;
    private final Device[] cameras;
    private final Device musicSystem;

    public HomeAutomationFacade(Device[] lights, Device thermostat, Device[] cameras, Device musicSystem) {
        this.lights = lights;
        this.thermostat = thermostat;
        this.cameras = cameras;
        this.musicSystem = musicSystem;
    }

    public void startPartyMode() {
        System.out.println("\n[HomeAutomation] Starting Party Mode...");
        for (Device light : lights) {
            light.operate();
            if (light instanceof Light l) l.dim(70);
        }
        if (musicSystem instanceof MusicSystem m) m.playHighVolume();
        System.out.println("[Mode] Party Mode activated.\n");
    }

    public void activateNightMode() {
        System.out.println("\n[HomeAutomation] Activating Night Mode...");
        for (Device light : lights) light.operate();
        if (thermostat instanceof Thermostat t) t.setEcoMode();
        for (Device cam : cameras) {
            if (cam instanceof SecurityCamera c) c.enableSurveillance();
        }
        System.out.println("[Mode] Night Mode activated.\n");
    }

    public void leaveHome() {
        System.out.println("\n[HomeAutomation] Leaving Home...");
        for (Device light : lights) light.operate();
        musicSystem.operate();
        if (thermostat instanceof Thermostat t) t.setEcoMode();
        for (Device cam : cameras) {
            if (cam instanceof SecurityCamera c) c.enableSurveillance();
        }
        System.out.println("[Mode] Home left securely.\n");
    }
}