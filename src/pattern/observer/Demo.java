package pattern.observer;

public class Demo {
    public static void main(String[] args) {
        EmailSender sender = new EmailSender();

        Human human1 = new Human("Elena");
        human1.setSender(sender);

        Human human2 = new Human("Mariya");
        human2.setSender(sender);

        sender.sendMassage("what up bitches");
        sender.sendMassage("take your work");

        human1.printMassage();
        human2.printMassage();
    }

}
