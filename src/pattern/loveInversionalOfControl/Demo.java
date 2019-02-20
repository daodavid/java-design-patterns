package pattern.loveInversionalOfControl;

import pattern.visitor.Human;

import java.io.File;

public class Demo {

    public static void main(String[] args) {
        File directory = new File("./");
        System.out.println(directory.getAbsolutePath());
        Inject.addObject(new Human(1,1));

        Human human = Inject.getInstance(Human.class);

        System.out.println(human);
    }


}
