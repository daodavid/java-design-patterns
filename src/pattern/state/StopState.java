package pattern.state;

public class StopState implements StateProcess {


    @Override
    public void doAction() throws Exception {
        System.out.println("stop process");
        throw new StopException();

    }



    public static class StopException extends Exception{
        @Override
        public void printStackTrace() {
            System.out.println("stop process");
        }

        @Override
        public synchronized Throwable getCause() {
            return null;
        }
    }
}
