package smart_home;

import smart_home.devices.*;
import smart_home.facade.HomeAutomationFacade;

public class Main {
    public static void main(String[] args) {
        AppConfig config = new AppConfig();

        Light light = config.getLight();
        MusicSystem music = config.getMusicSystem();
        Thermostat thermostat = config.getThermostat();
        SecurityCamera camera = config.getCamera();

        HomeAutomationFacade home = new HomeAutomationFacade(light, music, thermostat, camera);

        System.out.println("=== SMART HOME AUTOMATION SYSTEM ===");

        home.startPartyMode();
        home.activateNightMode();
        home.leaveHome();
    }
}
