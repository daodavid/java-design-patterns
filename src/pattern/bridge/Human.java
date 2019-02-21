package pattern.bridge;

public class Human {

    private String name;


    HumanAction action;

    public Human(){
        super();
    }

    public Human(HumanAction action){
        this.action=action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public HumanAction getAction() {
        return action;
    }

    public void setAction(HumanAction action) {
        this.action = action;
    }

    public void working(){
           System.out.println(this.name + ":Default Working  -- sleeping , eating ,getting sex");
    }


    public void startWork(){
        if(action!=null)
           action.working();
        else
           working();
    };

}
