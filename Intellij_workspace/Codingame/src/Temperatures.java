import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Temperatures {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            tempList.add(t);
        }

        int diff = Integer.MAX_VALUE ; int index = Integer.MAX_VALUE ;

        for(int a=0; a < tempList.size(); a++){
            int tempDiff = Math.abs(-tempList.get(a));
            if(tempDiff < diff){
                index = a;
                diff = tempDiff;
            }
            if(tempDiff == diff && tempList.get(a)>0){
                index = a;
                diff = tempDiff;
            }

        }

        System.out.println(tempList.size()==0 ? "0": tempList.get(index));
    }

    }
