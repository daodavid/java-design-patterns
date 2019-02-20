package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class EmailSender {

    /*
         Todo the idea is one sender to send its one same massage to many people in one time
          one to many
          The main idea is the change of one object ot reflect others(observers)
     */

    List<Human> humans = new ArrayList<>();

    public void attachReceiver(Human human){
        humans.add(human);
    }

    public void detachReceiver(Human human){
        humans.add(human);
    }

    public void sendMassage(String massage){
        for(Human human : humans){
            human.addMassage(massage);
        }
    }

}
