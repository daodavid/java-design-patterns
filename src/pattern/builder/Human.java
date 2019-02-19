package pattern.builder;

public class Human {
    private String name;
    private int age;

    public Human(HumanBuilder builder){
     this.age=builder.age;
     this.name=builder.name;
    }

    public void setName(String name){
        this.name=name;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name+" age " + this.age;
    }

    public static class HumanBuilder {

        private String name;
        private int age;

        public HumanBuilder setName(String name){
            this.name=name;
            return  this;
        }
        public HumanBuilder setAge(int  age){
            this.age=age;
            return  this;
        }

        public Human build(){
            return  new Human(this);
        }

    }
}
