import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {

        final Long[] sum = {0L};

        ar.forEach((x) -> sum[0] += x);

        return sum[0];
    }

}

public class VeryBigSum {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int noOfValues = s.nextInt();
        List<Long> ar = new ArrayList<>();
        while (noOfValues-- > 0) {
            ar.add(s.nextLong());
        }

        System.out.println(Result1.aVeryBigSum(ar));

    }
}

