package pattern.state;

public class RunState implements StateProcess {


    @Override
    public void doAction() throws Exception {
           System.out.println("running");
    }
}
