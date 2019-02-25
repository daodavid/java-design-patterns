package pattern.TemplateMethod;

public class ExecutorProcess {
    private static ExecutorProcess excecutor;
    private ExecutorProcess(){

    }

    public static synchronized ExecutorProcess  getExecutor(){
        return (excecutor==null) ? excecutor =  new ExecutorProcess() : excecutor;
    }

    public void excecute(Process process){
        new Thread(process).start();
    }
}
