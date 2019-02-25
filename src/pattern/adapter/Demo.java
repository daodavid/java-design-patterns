package pattern.adapter;

public class Demo {

    public static void main(String[] args) {
        PlayList list = new PlayList();

        list.add(new Mp3Track());
        list.add(new Mp4Track());
        list.add(new AdpterMedia(new Em4Media()));

        list.playSongs();
    }
}
