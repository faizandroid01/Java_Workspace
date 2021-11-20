package queue;

import java.util.*;

public class QwertyMessage2 {

    private static List<String> findTheCrossProductForGroup(String[] noArr, String[] input) {

        List<String> list = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("");

        while (!queue.isEmpty()) {
            String val = queue.remove();

            if (val.length() == input.length)
                list.add(val);
            else {

                String s = noArr[Integer.parseInt(input[val.length()])];
                for (int i=0 ; i< s.length() ; i++){
                    queue.add(val + s.charAt(i));
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String[] input = s.nextLine().replaceAll("\\s+$", "").split(" ");

        String[] noArr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        List<String> result = QwertyMessage2.findTheCrossProductForGroup(noArr, input);

        result.forEach(x -> System.out.print(x + " "));
    }


}
