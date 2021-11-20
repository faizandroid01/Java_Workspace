import java.util.Arrays;
import java.util.List;

public class Consumer {

    public static void main(String[] args) {

        List<String> cities = Arrays.asList("bombay","delhi","agra","jamshedpur","jabalpur","agartala","assam");

        //Stream way of filtering and printing
        //cities.stream().filter(p -> p.contains("pur")).limit(1).map(String::toUpperCase).forEach(System.out::println);

        // consumer way of writing
        java.util.function.Consumer<List<String>> upperConsumer = list -> {
            for(int i = 0; i< list.size(); i++){
            list.set(i, list.get(i).toUpperCase());
            }
        } ;

        java.util.function.Consumer<List<String>> printConsumer = list -> list.stream().filter(p -> p.contains("PUR")).forEach(System.out::println);

        upperConsumer.andThen(printConsumer).accept(cities);


    }

}
