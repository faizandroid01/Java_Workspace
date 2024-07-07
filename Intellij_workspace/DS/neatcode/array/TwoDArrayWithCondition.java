package neatcode.array;

/*You are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:

        The 2D array should contain only the elements of the array nums.
        Each row in the 2D array contains distinct integers.
        The number of rows in the 2D array should be minimal.
        Return the resulting array. If there are multiple answers, return any of them.

        Note that the 2D array can have a different number of elements on each row.



        Example 1:

        Input: nums = [1,3,4,1,2,3,1]
        Output: [[1,3,4,2],[1,3],[1]]
        Explanation: We can create a 2D array that contains the following rows:
        - 1,3,4,2
        - 1,3
        - 1
        All elements of nums were used, and each row of the 2D array contains distinct integers, so it is a valid answer.
        It can be shown that we cannot have less than 3 rows in a valid array.
        Example 2:

        Input: nums = [1,2,3,4]
        Output: [[4,3,2,1]]
        Explanation: All elements of the array are distinct, so we can keep all of them in the first row of the 2D array.


        Constraints:

        1 <= nums.length <= 200
        1 <= nums[i] <= nums.length*/

import java.util.Arrays;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class TwoDArrayWithCondition {

    public static List<List<Integer>> findMatrix(int[] nums) {


        Map<Integer, Integer> occurenceMap= new HashMap<>();
        AtomicInteger maxCount = new AtomicInteger(Integer.MIN_VALUE);
        Arrays.stream(nums).forEach(x -> {
            if (occurenceMap.containsKey(x)) {
                int occurrenceVal = occurenceMap.get(x) + 1;
                occurenceMap.put(x, occurrenceVal);
                maxCount.set(Integer.max(maxCount.get(), occurrenceVal));
            } else {
                occurenceMap.put(x, 1);
                maxCount.set(Integer.max(maxCount.get(), 1));

            }
        });
        int maxCountInt = maxCount.get();

        List<List<Integer>> list = new ArrayList<>(maxCountInt);

        for (int k=0; k< maxCountInt; k++){
            list.add(new ArrayList<>());
        }

        for (Map.Entry<Integer,Integer> k : occurenceMap.entrySet() ){

            int occurred = k.getValue();
            for(int j =0; j<occurred; j++){

                list.get(j).add(k.getKey());

            }

        }
        return list;
}

    public static void main(String args[]){
       System.out.println(findMatrix(new int[]{1,3,4,1,2,3,1}));
    }

}
