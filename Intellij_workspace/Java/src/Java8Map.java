import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Java8Map {

    public static void main(String[] args) {

        Map<Integer,Double> map = new HashMap<>();
        map.put(1,200d);
        map.put(2,400d);
        map.put(3,600d);

        int id = 1;
        map.computeIfPresent(id,(k,v) -> v = v+500d);

        System.out.println(map);

    }
}
