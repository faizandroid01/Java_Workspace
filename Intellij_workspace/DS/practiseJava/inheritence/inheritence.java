package practiseJava.inheritence;
import practiseJava.Cricketer;

import java.util.*;

public interface inheritence {

    String getHighestHundred();

    List<Cricketer> getAllCricketersFrom(String city);

    Map<String, List<Cricketer>> convertEntireListToMapOfCityAndPlayer();

    Long countCricketersByCity(String city);

    Long getTheTotalHundredOfTheList();

    Map<String, Long> getMapOfCityAndPlayerCount();

    Map<String, Long> getTheMapTheTotalOfHunderdForThePlayersInCityWise();

    Map<String, Double> getTheMapTheAvgOfHunderdForThePlayersInCityWise();

    String getTheSecondBestCityWithTheHundredsAvg();
}
