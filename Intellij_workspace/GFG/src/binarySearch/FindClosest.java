package binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindClosest {

    public static int findClosest(int a[], int target) {
        System.out.println("target -->"+target);

        int i = 0, j = a.length - 1, mid;

        if (a.length == 0) {
            return 0;
        }

        if (target <= a[0]) {
            return a[0];
        }
        if (target >= a[a.length - 1]) {
            return a[a.length - 1];
        }

        //binary serarch
        while (i < j) {
            mid = (i + j) / 2;
            if (target == a[mid]) {
                return target;
            }
            if (target < a[mid]) {
                //check for corner case
                if (target >= a[mid - 1]) {
                    return getClosest(a, mid - 1, mid, target);
                }
                j = mid - 1;
            } else {
                //check for corner case
                if (target <= a[mid + 1]) {
                    return getClosest(a, mid, mid + 1, target);
                }
                i = mid + 1;
            }
        }

        return 1000;
    }

    private static int getClosest(int[] a, int left, int right, int target) {
        return ((target - a[left]) < (a[right] - target)) ? a[left] : a[right];
    }


    public static void main(String[] args) {

        //Tcs//
        int[] cornerCase1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] cornerCase2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] BiggerDynamics = new int[]{1, 25, 36, 47, 58, 68, 79, 81, 99};
        int[] midiocre = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<int[]> list = new ArrayList<>((Arrays.asList(cornerCase1, cornerCase2, BiggerDynamics, midiocre)));

        list.forEach(item -> System.out.println(FindClosest.findClosest(item, 15)));

//        System.out.println((int)Math.random());

    }
}
