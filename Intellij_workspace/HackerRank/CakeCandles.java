import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {

       return (int) candles.stream().filter((x) -> x.equals(Collections.max(candles))).count();
    }

    public static void main(String[] args) {
        System.out.println(CakeCandles.birthdayCakeCandles(Arrays.asList(3,2,1,3)));
    }

}
