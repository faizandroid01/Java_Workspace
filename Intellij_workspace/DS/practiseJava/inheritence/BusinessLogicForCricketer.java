package practiseJava.inheritence;

import practiseJava.Cricketer;

import java.util.*;
import java.util.stream.Collectors;

public class BusinessLogicForCricketer implements inheritence{
    List<Cricketer> cricketers;

    BusinessLogicForCricketer(){
        cricketers = new ArrayList();
        cricketers.add(new Cricketer(74,"Virat Kohli","Delhi"));
        cricketers.add(new Cricketer(100,"Sachin Tendulkar","Mumbai"));
        cricketers.add(new Cricketer(5,"Shreyas Iyer","Delhi"));
        cricketers.add(new Cricketer(5,"Hardik Pandya","Gujrat"));
    }


    @Override
    public String getHighestHundred() {
        Optional<Cricketer> player =cricketers.stream().max(Comparator.comparing(Cricketer::getHundreds));
        //return player.isPresent() ? player.get().getName() : null;
        return player.map(Cricketer::getName).orElse(null);
    }

    @Override
    public List<Cricketer> getAllCricketersFrom(String city) {
       return cricketers.stream().filter(x -> x.getCity().equals(city)).sorted(Comparator.comparing(Cricketer::getName)).toList();
    }

    @Override
    public Map<String, List<Cricketer>> convertEntireListToMapOfCityAndPlayer() {
        return cricketers.stream().collect(Collectors.groupingBy(Cricketer::getCity));
    }

    @Override
    public Long countCricketersByCity(String city) {
        return cricketers.stream().filter(x -> x.getCity().equals(city)).collect(Collectors.counting());
    }

    @Override
    public Long getTheTotalHundredOfTheList() {
        return  cricketers.stream().map(Cricketer::getHundreds).collect(Collectors.summingLong(e -> e));
//        return cricketers.stream().map(Cricketer::getHundreds).mapToLong(e -> e).sum();

    }

    @Override
    public Map<String, Long> getMapOfCityAndPlayerCount() {
        return cricketers.stream().collect(Collectors.groupingBy(Cricketer::getCity,Collectors.counting()));
    }

    @Override
    public Map<String, Long> getTheMapTheTotalOfHunderdForThePlayersInCityWise() {
        return cricketers.stream().collect(Collectors.groupingBy(Cricketer::getCity, Collectors.summingLong(Cricketer::getHundreds)));
    }

    @Override
    public Map<String, Double> getTheMapTheAvgOfHunderdForThePlayersInCityWise() {
        return cricketers.stream().collect(Collectors.groupingBy(Cricketer::getCity,Collectors.averagingLong(Cricketer::getHundreds)));
    }

    @Override
    public String getTheSecondBestCityWithTheHundredsAvg() {
        return null;
    }
}
