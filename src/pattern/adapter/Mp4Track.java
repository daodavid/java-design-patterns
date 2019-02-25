package pattern.adapter;

public class Mp4Track implements MusicTrack {
    @Override
    public void play() {
        System.out.println("play mp4");
    }
}
