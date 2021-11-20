import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Collections {
    public static void main(String[] args) {

        System.out.println("--LIST--");
        List l =new ArrayList<>();
        l.add("I");
        l.add("AM");
        l.add("FAIZ");
        l.add(1);
        l.stream().forEach(System.out::println);

        System.out.println("--VECTOR--");
        Vector v = new Vector();
        v.add("I");
        v.add("AM");
        v.add("FAIZ");
        v.add(1);

        v.stream().forEach(System.out::println);


        System.out.println("--MANIPULATING LIST--");
        l.add(0,100);
        l.set(1,"Set Value In list");

        System.out.println("--MANIPULATING VECTOR--");
        v.add(0,100);
        v.set(1,"Set Value In list");

        l.stream().forEach(System.out::println);
        v.stream().forEach(System.out::println);

    }
}
