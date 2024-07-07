package neatcode.array;

import java.util.Arrays;

public class IndexedArray {

    public static int linearSearch(int [] numbers, int start , int searchValue){


     return 0;
    }

    public static int[] twoSum(int[] numbers, int target) {
        int sum = 0;
        StringBuilder indexString = new StringBuilder();
        // [2,3,6,7,9]  - 9
        for (int i = 0; i < numbers.length; i++) {

            int value = linearSearch(numbers, i + 1, target - numbers[i]);
            if (value != -1) {
                return new int[]{i + 1, value + 1};
            }


        }

    return Arrays.stream(indexString.toString().split(""))
            .mapToInt(Integer::parseInt)
            .toArray();
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 9}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{2,3,6, 7, 9}, 9)));

    }

}
