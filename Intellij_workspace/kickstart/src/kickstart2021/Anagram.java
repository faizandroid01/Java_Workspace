package kickstart2021;

import java.util.*;

public class Anagram {

    static boolean matchTwoStringForDifference(String actual, String shuffled) {

        for (int i = 0; i < actual.length(); i++) {

            if(actual.charAt(i)==shuffled.charAt(i))
                return false;

        }
        return true;
    }

    public static void main(String[] args) {

        List<String> result = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        int tc = s.nextInt();
        int i = 0;
        while (i++ < tc) {
            String input = s.next();

            if (input.isEmpty()) {
                result.add("Case #" + i + ": IMPOSSIBLE");
            }
            List<String> list = (Arrays.asList(input.split("")));

            boolean ifResult =false;
            for (int k = 0; k < 10; k++) {
                Collections.shuffle(list);
                final String[] shuffledString = {""};
                list.forEach(m -> {
                    shuffledString[0] = shuffledString[0] + m;
                });

                if (matchTwoStringForDifference(input, shuffledString[0])) {
                    ifResult = true;
                    result.add("Case #" + i + ": " + shuffledString[0]);
                    break;
                }
            }

            if(!ifResult){
                result.add("Case #" + i + ": IMPOSSIBLE");
            }

        }

        result.forEach(System.out::println);

    }

}
