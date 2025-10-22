package smart_home.devices;

public class MusicSystem implements Device {
    private boolean playing = false;

    @Override
    public void operate() {
        if (playing) {
            System.out.println("Music stopped");
            playing = false;
        } else {
            System.out.println("Music playing");
            playing = true;
        }
    }

    public void playLoud() {
        System.out.println("Music volume set to high");
    }
}
