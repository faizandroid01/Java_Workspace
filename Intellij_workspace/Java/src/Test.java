import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {

   List<Integer> l = Arrays.asList(1,2,3,4,9,6,9,8,0);

        Collections.reverse(l);

        System.out.println(Collections.max(l));
        System.out.println(l);

        System.out.println(l.indexOf(3));
        System.out.println(l.indexOf(5));

    }

}
