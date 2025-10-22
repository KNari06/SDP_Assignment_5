package smart_home.facade;

import smart_home.devices.*;

public class HomeAutomationFacade {
    private final Device light;
    private final Device musicSystem;
    private final Device thermostat;
    private final Device camera;

    public HomeAutomationFacade(Device light, Device musicSystem, Device thermostat, Device camera) {
        this.light = light;
        this.musicSystem = musicSystem;
        this.thermostat = thermostat;
        this.camera = camera;
    }

    public void activateNightMode() {
        System.out.println("\n--- Activating Night Mode ---");
        if (light instanceof Light) ((Light) light).turnOff();
        if (thermostat instanceof Thermostat) ((Thermostat) thermostat).ecoMode();
        if (camera instanceof SecurityCamera) ((SecurityCamera) camera).enableRecording();
    }

    public void startPartyMode() {
        System.out.println("\n--- Starting Party Mode ---");
        light.operate();
        musicSystem.operate();
    }

    public void leaveHome() {
        System.out.println("\n--- Leaving Home ---");
        if (light instanceof Light) ((Light) light).turnOff();
        if (musicSystem instanceof MusicSystem) ((MusicSystem) musicSystem).stopMusic();
        if (camera instanceof SecurityCamera) ((SecurityCamera) camera).enableRecording();
        System.out.println("All systems are set for away mode.");
    }
}
