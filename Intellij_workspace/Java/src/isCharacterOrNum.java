import java.util.Scanner;

public class isCharacterOrNum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine().replaceAll("\\s+$","");

        long count = input.chars().filter(Character::isAlphabetic).count();

        System.out.println(count);
    }

}
