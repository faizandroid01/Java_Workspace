import java.sql.Time;

public class TimeConversion {

    public static String timeConversion(String s) {

        if(s.contains("P")){
            String hour = s.charAt(0) +String.valueOf(s.charAt(1));

            int hourVal = Integer.parseInt(hour);

            if(hourVal == 12){
                s = "00"+s.substring(2,s.length()-2);
                return s;
            }

            s = (hourVal+12)+s.substring(2);
        }
        if(s.contains("A")){
            String hour = s.charAt(0) +String.valueOf(s.charAt(1));

            int hourVal = Integer.parseInt(hour);

            if(hourVal == 12){
                s = "00"+s.substring(2,s.length()-2);
                return s;
            }

            s = (hourVal)+s.substring(2);
        }

        return s.substring(0,s.length()-2);
    }

    public static void main(String[] args) {

        System.out.println(TimeConversion.timeConversion("07:05:45AM"));
        System.out.println(TimeConversion.timeConversion("07:05:45PM"));
        System.out.println(TimeConversion.timeConversion("12:05:45PM"));
        System.out.println(TimeConversion.timeConversion("12:05:45AM"));

    }
}
