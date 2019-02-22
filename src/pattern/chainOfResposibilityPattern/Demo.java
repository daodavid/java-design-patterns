package pattern.chainOfResposibilityPattern;

public class Demo {

    private static AbstractDaoLog getChainOfLoggers(){

        AbstractDaoLog errorLogger = new ErrorLogger(AbstractDaoLog.ERROR);
        AbstractDaoLog fileLogger = new FileLogger(AbstractDaoLog.DEBUG);
        AbstractDaoLog consoleLogger = new ConsoleLogger(AbstractDaoLog.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractDaoLog log = getChainOfLoggers();

        log.logMessage(AbstractDaoLog.DEBUG,"ol");
        log.logMessage(AbstractDaoLog.ERROR,"ola");
    }
}
