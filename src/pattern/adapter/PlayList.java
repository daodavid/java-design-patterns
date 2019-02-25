package pattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

    private List<MusicTrack> playList =new  ArrayList<MusicTrack>();

    public void add(MusicTrack media){
        playList.add(media);
    }

    public void playSongs(){
        int size = playList.size();
        for(int i =0 ; i<size ; i++){
            playList.get(i).play();
        }
    }
}
