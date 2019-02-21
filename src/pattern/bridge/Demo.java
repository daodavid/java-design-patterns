package pattern.bridge;

public class Demo {

    public static void main(String[] args) {
        Human human =new Human();
        human.setName("Warry");

        Human human2 = new Human(new HumanAction() {
             @Override
               public void working() {

                 System.out.println("i am coding now" );
             }
        });

        human.startWork();
        human2.startWork();
    }
}
