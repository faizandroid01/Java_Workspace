package divideandconquer.maximumsubarray;

public class MaximumSubArrayDP {

    public static int maximumSubArray(int arr[]){
        int ans ;
        int dp [] = arr;
        dp[0]=arr[0];
        ans = dp[0];

        for(int  i =1; i <arr.length ; i++){
            dp[i] = Math.max(arr[i],arr[i]+ dp[i-1]);
            ans = Math.max(ans,dp[i]);
        }


        return ans;
    }

    public static void main(String[] args) {
        int que[] = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
        if(que.length == 0){
            System.out.println("Empty Array");
            System.exit(0);
        }
        int sum = maximumSubArray(que);
        System.out.println(sum);
    }

}
