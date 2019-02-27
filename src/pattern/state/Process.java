package pattern.state;

public class Process implements Runnable {

     private StateProcess state;

     public void  setState(StateProcess processState){
         this.state=processState;
     }

     public Process(StateProcess state){
         this.state=state;
     }


    @Override
    public void run() {
     while(true){
         try {
             state.doAction();
         } catch (StopState.StopException e){
             break;
         } catch (Exception e) {
             e.printStackTrace();
         }
     }
    }
}
