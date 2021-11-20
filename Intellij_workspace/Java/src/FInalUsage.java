import java.util.ArrayList;
import java.util.List;

public class FInalUsage {
    public static void main(String[] args) {
//1
        final String a = "Faiz";
        System.out.println(a);
       // a = "Test";  Not Allowed

//2
       String b = "Faiz";
       final String c = b;

        if(b==c)
            System.out.println(c);

        if(b.equals(c))
            System.out.println(c);

//3  we can add and remvove from final list , as reference is just blocked, it cant be referenced to some other list
        final List<String> s = new ArrayList<>();
        System.out.println(s);

        s.add("add1");
        s.add("add2");

        s.forEach(System.out::println);


    }

}
