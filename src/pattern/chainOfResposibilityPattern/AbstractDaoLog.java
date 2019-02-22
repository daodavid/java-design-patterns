package pattern.chainOfResposibilityPattern;

public abstract class AbstractDaoLog {

    public final static int INFO = 1  ;
    public final static int DEBUG = 2;
    public final static int ERROR = 3;


    protected int level;
    protected AbstractDaoLog nextLogger;


    public AbstractDaoLog(int level) {
      this.level=level;
    }

    public void logMessage(int level,String message){
        if(this.level <= level ){
            write(message);
        }
        if(nextLogger!=null){
            nextLogger.logMessage(level, message);
        }
    }


    abstract protected void write(String message);

    public void setNextLogger(AbstractDaoLog logger){
        this.nextLogger=logger;
    }

}
