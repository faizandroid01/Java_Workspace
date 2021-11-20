package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {

    private static List<TestModel> initList() {

        return Arrays.asList(new TestModel(1,"Cricket",true,45),
                new TestModel(1,"Football",false,5),
                new TestModel(10,"TT",true,20),
                new TestModel(20,"Badminton",true,20),
                new TestModel(25,"Volleyball",true,10)
                );

    }
    public static void main(String[] args) {
        List<TestModel> list = initList();
        list.forEach(x -> System.out.println(x.toString()));
        System.out.println("----------------------------------------------------------------------------------------------");

        list.stream().map(TestModel::getName).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------------------------");

        list.stream().filter(x -> x.price > 10).map(TestModel::getValue).forEach(System.out::println);

    }


}
