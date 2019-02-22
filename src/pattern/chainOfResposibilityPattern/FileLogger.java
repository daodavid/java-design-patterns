package pattern.chainOfResposibilityPattern;

public class FileLogger extends AbstractDaoLog {

    public FileLogger(int level){
        super(level);
    }

    @Override
    protected void write(String message) {
          System.out.println("i am file Logger");
    }
}
