package pattern.state;



public class SleepState implements StateProcess {


    @Override
    public void doAction() throws Exception {
        System.out.println("sleep");
        Thread.sleep(100);
    }
}
