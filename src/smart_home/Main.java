package smart_home;

import smart_home.devices.*;
import smart_home.facade.HomeAutomationFacade;
import smart_home.decorators.*;

public class Main {
    public static void main(String[] args) {
        Device light1 = AppConfig.createLight();
        Device light2 = AppConfig.createLight();
        Device music = AppConfig.createMusic();
        Device thermostat = AppConfig.createThermostat();
        Device camera1 = AppConfig.createCamera();
        Device camera2 = AppConfig.createCamera();

        HomeAutomationFacade facade = new HomeAutomationFacade(
                new Device[]{light1, light2},
                thermostat,
                new Device[]{camera1, camera2},
                music
        );

        facade.startPartyMode();
        facade.activateNightMode();
        facade.leaveHome();

        System.out.println("\n[Demo] Extra features demonstration:");
        if (light1 instanceof VoiceControlDecorator vLight) {
            vLight.voiceCommand("turn off");
            vLight.voiceCommand("dim 50");
        }
        if (music instanceof RemoteAccessDecorator rMusic) {
            rMusic.remoteInvoke("play=chill_playlist;volume=40");
        }
    }
}