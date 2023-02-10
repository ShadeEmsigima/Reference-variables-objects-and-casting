import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(IGreeter.a);

        ArrayList<StringBuilder> al = new ArrayList<>();
        al.add(new StringBuilder("I "));
        al.add(new StringBuilder(" love "));
        al.add(new StringBuilder(" cookies!"));
        
        System.out.println(al);
        Object[] sb = al.toArray();
        for(Object thing : sb)
        System.out.println(thing);

        System.out.println("Now we make changes to an element");
        
        al.get(1).reverse();
        System.out.println(al);
        for(Object thing : sb)
        System.out.println(thing);

        


    }
}




