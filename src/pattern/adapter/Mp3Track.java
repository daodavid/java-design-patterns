package pattern.adapter;

public class Mp3Track implements MusicTrack {
    @Override
    public void play() {
        System.out.println("play mp3");
    }
}
