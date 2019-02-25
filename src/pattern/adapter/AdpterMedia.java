package pattern.adapter;

public class AdpterMedia implements MusicTrack {

    MediaTrack track ;

    public AdpterMedia(MediaTrack track){
        this.track=track;
    }
    @Override
    public void play() {
        track.play();
    }
}
