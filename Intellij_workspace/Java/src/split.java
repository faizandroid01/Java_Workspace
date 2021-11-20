import java.util.Arrays;

public class split {
    public static void main(String[] args) {

        String s = "abc";

        Arrays.stream(s.split("")).forEach(System.out::println);

    }
}
