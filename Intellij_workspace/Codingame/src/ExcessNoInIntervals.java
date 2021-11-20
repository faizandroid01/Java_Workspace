import java.util.*;

public class ExcessNoInIntervals {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        if(s.hasNextLine()){
            s.nextLine();
        }

        List<String> inputList = new ArrayList<>(x);

        while (x-- > 0) {
            inputList.add(s.nextLine().replaceAll("\\s+$", ""));
        }

        Set<Integer> distinctHour = new HashSet<>();
        int sI, eI;
        for (String input : inputList){
            sI = Integer.parseInt(input.split(" ")[0]) +1;
            eI = Integer.parseInt(input.split(" ")[1]);
            for(int i = sI ; i<=eI ; i++) {
                distinctHour.add(i);
            }
        }
        System.out.println(distinctHour);
        System.out.println(distinctHour.size());

    }

}
