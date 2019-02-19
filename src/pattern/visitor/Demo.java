package pattern.visitor;

public class Demo {

    public static void main(String[] args) {
        Human human1 = new Human(43,18);
        human1.visit();

        Human human2 = new Human(43,20);
        human2.visit();

        Human.Visitor visitor = Human.Visitor.getInstance();

        visitor.print();


    }
}
