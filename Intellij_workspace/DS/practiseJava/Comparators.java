package practiseJava;
import java.util.*;


public class Comparators {
    public static void main(String args[]) {
        List<Cricketer> cricketers = new ArrayList();
        cricketers.add(new Cricketer(74,"Virat Kohli","Delhi"));
        cricketers.add(new Cricketer(100,"Sachin Tendulkar","Mumbai"));
        cricketers.add(new Cricketer(5,"Shreyas Iyer","Delhi"));
        cricketers.add(new Cricketer(5,"Hardik Pandya","Gujrat"));


        Comparator<Cricketer> nameCom = Comparator.comparing(Cricketer::getName).reversed();
        Comparator<Cricketer> cityCom = Comparator.comparing(Cricketer::getCity);
        Comparator<Cricketer> hundCom = Comparator.comparing(Cricketer::getHundreds).reversed();

        /*// sort on the basis of comparator and one field
        //Collections.sort(cricketers,hundCom);
        //cricketers.stream().forEach(x -> System.out.println(x.getHundreds()));
            //OR
        cricketers.stream().sorted(hundCom).forEach(System.out::println);*/


        /*
        //getting the min/max from stream
        Optional<Cricketer> x = cricketers.stream().min(Comparator.comparing(Cricketer::getHundreds));
        x.ifPresent(k -> System.out.print(k));*/


        cricketers.stream().sorted(hundCom.thenComparing(nameCom)).forEach(System.out::println);

    }


}

