package dailyQue;

import java.util.Scanner;


class LongestCommonPrefix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            Solution obj = new Solution();
            int[] ans = obj.longestCommonPrefixGFG(s1, s2);
            if (ans[0] == -1)
                System.out.println(ans[0]);
            else
                System.out.println(ans[0] + " " + ans[1]);
        }
    }
}

class Solution {
    public int[] longestCommonPrefix(String s1, String s2) {

        int[] result = new int[]{-1,-1};
        int diff = Integer.MIN_VALUE;
        for (int i = 0; i < s1.length(); i++) {

            if (s2.contains("" + s1.charAt(i)) && diff < (s1.length()-i)) {

                for (int k = i; k < s1.length(); k++) {
                    if (s2.contains(s1.substring(i, k+1)) && ((k - i+1 ) > diff)) {
                        result[0] = i;
                        result[1] = k ;
                        diff = k-i + 1;

                    }
                }
            }
        }
        return result;

    }

    public int[] longestCommonPrefixGFG(String str1, String str2){

        int vec[] = new int[2];
        vec[0] = 0;
        StringBuffer temp = new StringBuffer("");
        for(int i = 0;i<str1.length();i++) {
            temp.append(str1.charAt(i));
            if(!str2.contains(temp)) {
                vec[1] = (i-1);
                if(i == 0) vec[0] = -1;
                return vec;
            }
        }

        vec[1] = str1.length()-1;
        return vec;
    }
}