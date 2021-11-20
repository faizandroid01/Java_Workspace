import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {

        float valN = 0 , valZ = 0 , valP  = 0;

        int count = 0;
        while(count < arr.size()){

            if(arr.get(count) > 0){
                valP++;
            }else if ( arr.get(count) <0 ){
                valN++;
            }else {
                valZ++;
            }
            count++;
        }

        System.out.printf("%.6f%n", valP/arr.size());
        System.out.printf("%.6f%n", valN/arr.size());
        System.out.printf("%.6f%n", valZ/arr.size());

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> arr = Stream.of(s.nextLine().replaceAll("//s+$", "").split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        PlusMinus.plusMinus(arr);
    }

}
