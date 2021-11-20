package queue;


import java.util.*;
import java.util.stream.Collectors;

public class QwertyMessage {

    private static String[] findTheCrossProductForGroup(String[] noArr, String[] inputDigits){


       List<Integer> reqInputs = Arrays.stream(inputDigits).map(Integer::parseInt).collect(Collectors.toList());

        Queue<String> queue = new LinkedList<>(Arrays.asList(noArr[reqInputs.get(0)].split("")));
        if(reqInputs.size() == 1 ){
            return queue.toArray(new String[]{});
        }

        while(!queue.isEmpty() && queue.peek().length()==1){
             String val = queue.remove();
            queue.addAll(Arrays.stream(noArr[reqInputs.get(1)].split("")).map(x -> val+x).collect(Collectors.toList()));
        }

        return queue.toArray(new String[]{});

    }

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        String[] input = s.nextLine().replaceAll("\\s+$","").split(" ");

        String [] noArr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        String [] result = QwertyMessage.findTheCrossProductForGroup(noArr,input);

        Arrays.stream(result).forEach(x -> System.out.print(x + " "));
    }
}
