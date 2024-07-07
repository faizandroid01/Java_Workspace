package neatcode.array;

import java.util.Arrays;

public class MergeToPalindrome {

    // [1] , [1,4,1]
    private static  boolean isValidPalindrome(int[] nums){
        if(nums.length == 1){
            return true;
        }
        int i=0, j=nums.length-1;
        while(i<j){
            if(nums[i] != nums[j])
                return false;
            i++;  j--;
        }
        return true ;
    }

    //[1,4,1,5]   //[3,6,7]   // [7,67,45,22,7]
    private static int mergeToPalindrome(int[] nums, int count,int ans){

        if (isValidPalindrome(nums))
            return count;

        for(int i=0 ;i<nums.length-1; i++){
            int[] tempNums = Arrays.copyOfRange(nums,0,nums.length);
            tempNums[i] = nums[i] + nums[i+1];
            int[] updatedArr = leftShiftArrayFrom(tempNums,i+1, tempNums.length);
            count = mergeToPalindrome(updatedArr,count+1,ans);
            ans = Math.min(count,ans);
            count = 0;
        }

        return ans;
    }

    private static int[] leftShiftArrayFrom(int[] arr, int from, int to) {
        if(from != to){
            for(int k=from; k<to-1; k++){
                arr[k]=arr[k+1];
            }
        }
        return Arrays.copyOfRange(arr,0,to-1);
    }

    public static void main(String[] args) {
        //int[] que = new int[]{1,4,1,5}; // TC 1:1
        //int[] que = new int[]{7,67,45,22,7}; // TC 2:1
        int[] que = new int[]{3,6,7}; // TC 3:2
        int minMergeMoves = mergeToPalindrome(que,0,Integer.MAX_VALUE);
        System.out.println(minMergeMoves);
    }

}
