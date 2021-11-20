import java.util.Scanner;

public class OnesGroup {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String input = s.nextLine().replaceAll("\\s+$","");

        input = input.replaceAll("\\D+","A");
        System.out.println(input);

        long c = input.chars().filter(x -> x=='A').count();
        long d = input.chars().filter(Character::isAlphabetic).count();
        System.out.println(c + " "+ d);
    }


}
