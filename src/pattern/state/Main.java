package pattern.state;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Process process = new Process(new StartState());
        Thread thread = new Thread(process);

        thread.start();


        Thread.sleep(100);
        process.setState(new SleepState());

        Thread.sleep(100);

        process.setState(new RunState());

        process.setState(new StopState());

    }
}
