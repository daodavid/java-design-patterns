package pattern.iterator;

public class DEmo {

    public static void main(String[] args) {
        NameRepository con2 = new NameRepository() ;

        NameRepository con = new NameRepository();
        con.setName(new String[]{"a","b"});

        Iterator itr = con.new NameIterator();

        while (itr.hasNext()){
            Object o = itr.next();
            System.out.println(o.toString());
        }


    }

}
