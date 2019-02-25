package pattern.TemplateMethod;

public class MusicListeningProcess extends Process {

    private String songName;

    public void setNameSong(String name){
        this.songName=name;
    }


    @Override
    protected void innit() {
       System.out.println("innit media player");

    }

    @Override
    protected void execute()  {
     System.out.println("Start playing song "+this.songName);

     for(int i =0 ; i<100;i++){
         System.out.println("Listening music "+ this.songName);
         try {
             Thread.sleep(100);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
    }

    @Override
    protected void finish() {
       System.out.println("Song finish");
    }
}
