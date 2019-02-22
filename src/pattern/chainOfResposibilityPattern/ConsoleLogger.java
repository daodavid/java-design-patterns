package pattern.chainOfResposibilityPattern;

public class ConsoleLogger extends AbstractDaoLog {



    public ConsoleLogger(int level ){
        super(level);
        this.level=level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
