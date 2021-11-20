import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenerateSqNo {

    public static void main(String[] args) {

        List<Integer> generatedNo = Stream.iterate(11 , i -> i+2).limit(10).collect(Collectors.toList());
        System.out.println(generatedNo);

        Stream<Integer> stream = Stream.generate( () -> (new Random()).nextInt(100)  );
        stream.limit(20).map( x -> x + " new").forEach(x -> {System.out.print(x+" ");});
    }
}
