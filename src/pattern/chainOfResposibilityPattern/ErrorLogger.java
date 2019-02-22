package pattern.chainOfResposibilityPattern;

public class ErrorLogger extends AbstractDaoLog {



    public ErrorLogger(int level) {
        super(level);
        super.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }


}
