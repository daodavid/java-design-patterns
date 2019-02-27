package pattern.state;

public class StartState implements StateProcess {
    @Override
    public void doAction() throws Exception {
        System.out.println("Starting State");
    }
}
