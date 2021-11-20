package sorting;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {

        long t1 = System.currentTimeMillis();

        int[] arr = new int[]{92, 4, 1, 66, 2, 9, 8, 0,-1};
        SelectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(System.currentTimeMillis() - t1);
    }

    private static void sort(int[] a) {
        int temp;
        for (int i = 1; i < a.length; i++) {

            temp = a[i];
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > temp) {
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }

        }

    }


}
