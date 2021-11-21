import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubArraySort {
    //[[2,1],[3,2],[1,2]]
    // -> after sort based in frequency desc -> [[3,2],[1,2],[2,1]]
    // -> sort asc wrt key for same frequencies -> [[1,2],[3,2],[2,1]]

    public static List<List<Integer>> bubbleSort(List<List<Integer>> unsortedList) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < unsortedList.size() - 1; i++) {
            for (int j = 0; j < unsortedList.size() - (i + 1); j++) {

                if (unsortedList.get(j).get(1) > unsortedList.get(j + 1).get(1)) {
                    temp = unsortedList.get(j);
                    unsortedList.add(j, unsortedList.get(j + 1));
                    unsortedList.add(j + 1, temp);
                }

            }
        }
         Collections.reverse(unsortedList);

        return  unsortedList;
    }

    public static List<List<Integer>> sort(List<List<Integer>> unsortedList) {
        List<List<Integer>> resultList = new ArrayList<>();

        resultList = bubbleSort(unsortedList);


        return resultList;
    }

    public static void main(String[] args) {

        List<List<Integer>> unsortedList = new ArrayList<>();
        unsortedList.add(Arrays.asList(2, 1));
        unsortedList.add(Arrays.asList(3, 2));
        unsortedList.add(Arrays.asList(1, 2));

        System.out.println(sort(unsortedList));
    }
}
