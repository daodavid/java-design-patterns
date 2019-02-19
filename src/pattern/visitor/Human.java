package pattern.visitor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Human {

    private static int lastID=0;

    public Human( int skill, int age) {
        this.skill = skill;
        this.age = age;
        this.id = createID();

    }

    private Visitor visitor = Visitor.getInstance();


    public void visit(){
        visitor.visit(this);
    }

    private static int createID(){
         return ++lastID;

    }
    private int skill;

    private int age;

    private int id;

    public int  getID() {
        return this.id ;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void increaseSkill(int skill) {
        this.skill += skill;
    }

    public void visit(Visitor visitor) {
        visitor.visit(this);
    }

    public void calculateSkill() {
        skill = this.skill * age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "visitor=" + visitor +
                ", skill=" + skill +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public static class Visitor {

        private static Map<Integer, Human> humans = new ConcurrentHashMap<>();
        private static Visitor visitor;

        public static synchronized Visitor getInstance() {
            if (visitor == null) visitor = new Visitor();
            return visitor;
        }

        public void visit(Human human) {
            human.calculateSkill();
            humans.put(human.id, human);
        }

        public void remove(Human human) {
            humans.remove(human.id);
        }

        public Map<Integer, Human> getHumans() {
            return humans;
        }

        public void print(){
            for(Integer id : humans.keySet()){
                System.out.println(humans.get(id).toString());
            }
        }
    }
}
