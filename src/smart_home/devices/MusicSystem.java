package smart_home.devices;

public class MusicSystem implements Device {
    private boolean isPlaying = false;

    @Override
    public void operate() {
        if (isPlaying) {
            System.out.println("Music system stopped playing.");
            isPlaying = false;
        } else {
            System.out.println("Music system is playing music.");
            isPlaying = true;
        }
    }

    public void playHighVolume() {
        System.out.println("Playing music at high volume.");
    }
}