package smart_home.devices;

public class MusicSystem implements Device {
    @Override
    public void operate() {
        System.out.println("Music system is playing music.");
    }

    public void stopMusic() {
        System.out.println("Music stopped.");
    }
}
