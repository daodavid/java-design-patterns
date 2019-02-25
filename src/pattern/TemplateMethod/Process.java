package pattern.TemplateMethod;

public abstract class Process implements Runnable{

    private String name;

    private static long id=0;

    private static long getID(){
        return ++id;
    }
    private long idProcess;

    public long getId(){
        return this.idProcess;
    }


    protected final void runProcess() {
         this.idProcess=getID();
         System.out.println(String.format("Start process %d name  %s ",idProcess,this.name));
         innit();
         execute();
         finish();
         System.out.println(String.format("Stop process %d name  %s ",idProcess,this.name));
    }

    protected abstract void innit();

    protected abstract void execute();

    protected abstract void finish();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void run(){
        runProcess();
    }
}
