package pattern.builder;

public class Demo {
    public static void main(String[] args) {
        Human human = new Human.HumanBuilder().setName("Loli").setAge(10).build();

        System.out.println(human.toString());
    }
}
