import java.util.*;

public class TripletCompare {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        String s1 = s.nextLine();
        String[] a = s1.split(" ");
        String s2 = s.nextLine();
        String[] b = s2.split(" ");

        int resultAlice=0 , resultBob=0 ;

        int count = 0;
        while(count < a.length){

            if(Integer.parseInt(a[count]) > Integer.parseInt(b[count])){
                resultAlice++;
            }else if(Integer.parseInt(a[count]) < Integer.parseInt(b[count])) {
                resultBob++;
            }

            count ++;
        }

        System.out.println(resultAlice+ " "+ resultBob);

        s.close();
    }
}
