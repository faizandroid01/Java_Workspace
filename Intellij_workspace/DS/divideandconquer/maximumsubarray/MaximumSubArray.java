package divideandconquer.maximumsubarray;
import java.lang.Math;

/**
 * Time Complexity - O(nlogn)
 * Algorithmic paradigm - Divide and Conquer
 *
 * Practise Other approach later
 * 1. Kadane's Algo - O(n)
 * 2. DP
 * 3. Greedy Algo
 * **/

public class MaximumSubArray {

    public static int maximumSubArray(int[] arr, int l, int h) {
        if(l==h){
            return arr[l];
        }
        int mid = (l+h)/2;
        return Math.max(Math.max(maximumSubArray(arr,0,mid),maximumSubArray(arr,mid+1,h)),maximumCrossingSubArray(arr,l,mid,h));
    }

    private static int maximumCrossingSubArray(int[] arr, int l, int mid, int h) {
        //mid to left max
        int leftsum = Integer.MIN_VALUE;
        int sum=0;
        for (int i= mid; i>=l ; i-- ){
            sum +=arr[i];
            if(sum > leftsum){
                leftsum = sum;
            }else{
                break;
            }
        }

        //mid+1 to right max
        sum = 0;
        int rightSum = Integer.MIN_VALUE;
        for (int i= mid+1; i<=h ; i++ ){
            sum +=arr[i];
            if(sum > rightSum){
                rightSum = sum;
            }else{
                break;
            }
        }

        return Math.max(leftsum+rightSum,Math.max(leftsum, rightSum));
    }


    public static void main(String[] args) {
        int que[] = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
        if(que.length == 0){
            System.out.println("Empty Array");
            System.exit(0);
        }
        int sum = maximumSubArray(que,0,que.length-1);
        System.out.println(sum);
    }




}
