package dailyQue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class MinimumNoOfJumps {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String) br.readLine()).split("\\s+");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution1().minJumpsBetterApproach(arr));
        }
    }

}


class Solution1 {
    static int minJumps(int[] arr) {
        int inProcess;
        int k;
        int step = 0;
        if (arr.length <= 1) return 0;
        if (arr[0] == 0) {
            return -1;
        } else {
            k = arr[0];
            inProcess = k;
            step = 1;
            if (inProcess >= arr.length - 1) return step;
            if (inProcess + 1 == arr.length) return step;
            inProcess = inProcess + arr[k];
            if (inProcess >= arr.length - 1) return step + 1;
        }

        for (int i = inProcess; i < arr.length; i++) {
            if (arr[i] == 0)
                return step;
            if (i == inProcess) {
                step++;
                if (inProcess + 1 == arr.length) return step;
                if (arr[inProcess] >= arr.length - (inProcess + 1)) return step + 1;
                inProcess = i + arr[i];
            }

        }

        return step;
    }
// 1 3 5 8 9 2 6 7 6 8 9
// 2 3 1 1 2 4 2 0 1 1
// 2 3 1 1 2 4 1 0
// 2 3 1 1 5 4 1 0

    static int minJumpsBetterApproach(int[] arr) {

        int count=0 ,i = 0;
        List<Integer> l = Arrays.stream(arr).boxed().collect(java.util.stream.Collectors.toList());

        int pos = l.indexOf(0);
        if(pos ==0)
            return -1;


        int n = pos!=-1 ? pos+1 : arr.length;

        while(i< n){
            if(arr[i]==0)
                return count;
            if(arr[i]>= n-(i+1)) {

                //if(Arrays.stream(Arrays.copyOfRange(arr,i,n)).boxed().collect(Collectors.toList()).contains(0))
                if(pos != -1)
                    return count;

                return count + 1;
            }
            i += arr[i];
            count++;
        }

        return count;
    }

}