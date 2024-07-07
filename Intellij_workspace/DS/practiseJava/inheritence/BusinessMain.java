package practiseJava.inheritence;

import practiseJava.Cricketer;

import java.util.List;
import java.util.Map;

public class BusinessMain {

    static void display(Object obj){

        if(obj instanceof String)
            System.out.println(obj);
        if(obj instanceof List)
            ((List<?>) obj).forEach(System.out::println);
        if(obj instanceof Long)
            System.out.println(obj);
        if(obj instanceof Integer)
            System.out.println(obj);

    }

    public static void main(String args[]){

        BusinessLogicForCricketer obj = new BusinessLogicForCricketer();
        display(obj.getAllCricketersFrom("Delhi"));
        display("Highest Hundred By :"+obj.getHighestHundred());
        System.out.println("===convertEntireListToMapOfCityAndPlayer=============================");
        for (Map.Entry<String, List<Cricketer>> entry : obj.convertEntireListToMapOfCityAndPlayer().entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }
        System.out.println("===countCricketersByACity=============================");
        display("No of Players from delhi :"+obj.countCricketersByCity("Delhi"));
        display("Total Hundreds of Pack :"+ obj.getTheTotalHundredOfTheList());
        System.out.println("===getMapOfCityAndPlayerCount=============================");
        for (Map.Entry<String, Long> entry : obj.getMapOfCityAndPlayerCount().entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }
        System.out.println("===getTheMapTheTotalOfHunderdForThePlayersInCityWise=============================");
        for (Map.Entry<String, Long> entry : obj.getTheMapTheTotalOfHunderdForThePlayersInCityWise().entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }
        System.out.println("===getTheMapTheAvgOfHunderdForThePlayersInCityWise=============================");
        for (Map.Entry<String, Double> entry : obj.getTheMapTheAvgOfHunderdForThePlayersInCityWise().entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }


    }

}
