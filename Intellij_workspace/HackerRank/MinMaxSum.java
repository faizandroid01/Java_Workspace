import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {

    public static void miniMaxSum(List<Integer> arr) {

        Collections.sort(arr);
        long minSum = arr.stream().limit(4).mapToLong(p -> p).sum();
        Collections.reverse(arr);
        long maxSum = arr.stream().limit(4).mapToLong(p -> p).sum();

        System.out.print(minSum + " "+ maxSum);

    }

    public static void main(String[] args) {

       MinMaxSum.miniMaxSum(Arrays.asList(1,3,5,7,9));

    }

}
