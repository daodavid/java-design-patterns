package pattern.observer;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Human {

    private Queue<String> massages = new ArrayBlockingQueue<String>(20);
    private String name;

    public Human(String name){
        this.name = name;
    }

   public void addMassage(String massage){
       massages.add(massage);
   }

   public void setSender(EmailSender sender){
       sender.attachReceiver(this);
   }


   public void printMassage(){
       int i=0;
       for(String massage : massages ){
           System.out.println(" "+name +" receive massage number "+i + massage);
           i++;
       }
   }
}
