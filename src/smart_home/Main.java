package smart_home;

import smart_home.config.AppConfig;
import smart_home.facade.HomeAutomationFacade;

public class Main {
    public static void main(String[] args) {
        AppConfig config = new AppConfig();
        HomeAutomationFacade home = config.createFacade();

        home.startPartyMode();
        home.activateNightMode();
        home.leaveHome();
    }
}
