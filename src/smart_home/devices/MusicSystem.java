package smart_home.devices;

public class MusicSystem implements Device {
    private boolean playing = false;
    private int volume = 0;

    @Override
    public void operate() {
        if (playing) {
            System.out.println("Music stopped.");
            playing = false;
        } else {
            playing = true;
            volume = 70;
            System.out.println("Playing music. Volume: " + volume + "%");
        }
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Music volume set to " + volume + "%.");
    }
}
