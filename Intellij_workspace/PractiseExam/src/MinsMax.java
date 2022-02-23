import java.util.Arrays;
import java.util.List;

public class MinsMax {

    public static void main(String[] args) {
        //List<Integer> list = Arrays.asList(4,7,3,1,4,5,11,99,22);
        List<Integer> list = Arrays.asList(-4,-7,-3,-1,-4,-5,-11,-99,-22);
        System.out.println(computeMinsMax(list,3));
    }

    private static int  computeMinsMax(List<Integer> list, int k) {
        int previousIntervalMinVal= Integer.MIN_VALUE , minVal = Integer.MAX_VALUE, maxVal = 0;
        for(int i =0 ; i< list.size(); i++){
            if(list.get(i) < minVal) {minVal = list.get(i);}
            if((i+1) % k==0){
                previousIntervalMinVal = Math.max(minVal, previousIntervalMinVal);
                maxVal = previousIntervalMinVal ;
                minVal = Integer.MAX_VALUE; }
        }

      return maxVal ;
    }
}
