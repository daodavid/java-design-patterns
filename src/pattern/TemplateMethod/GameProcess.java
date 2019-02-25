package pattern.TemplateMethod;

public class GameProcess extends Process  {

    private String gameName;

    public void setGameName(String name){
        this.gameName=name;
    }

    @Override
    public void innit() {

      System.out.println("innit game "+this.gameName);
    }

    @Override
    protected void execute() {
        System.out.println("Start game "+this.gameName);

        for(int i = 0 ;i <100 ;i++){
            System.out.println("gaming "+ this.gameName);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void finish() {
        System.out.println("Finish game " +gameName);

    }


}
