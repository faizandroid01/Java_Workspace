package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static int[] ascSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] descSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
   
    public static void main(String[] args) {
        Arrays.stream(ascSort(new int[]{8, 2, 6, 5, 4, 32, 0, 99, 1})).forEach(x -> System.out.print(x + ","));
        System.out.println();
        Arrays.stream(descSort(new int[]{8, 2, 6, 5, 4, 32, 0, 99, 1})).forEach(x -> System.out.print(x + ","));

    }
}
