package pattern.TemplateMethod;

public class Demo {

    public static void main(String[] args) {
        GameProcess game = new GameProcess();
        game.setGameName("CS");
        game.setName("process game");

        MusicListeningProcess listening = new MusicListeningProcess();
        listening.setNameSong("Black Sabbat - Iron Man");
        listening.setName("process play music");

         ExecutorProcess.getExecutor().excecute(game);
         ExecutorProcess.getExecutor().excecute(listening);
    }

}
