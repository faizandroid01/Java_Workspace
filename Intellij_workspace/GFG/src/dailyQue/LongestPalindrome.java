package dailyQue;

import com.sun.xml.internal.ws.util.StringUtils;

import java.io.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {

            String S = read.readLine().trim();
            LongestPalindrome ob = new LongestPalindrome();
            System.out.println(ob.longestPalindrome(S));
        }
    }
}

class LongestPalindrome{
    String longestPalindrome(String S){
        // aaaabbaa //rfkqyuqfjkxy

        if(S.isEmpty())
            return "";

        StringBuilder str = new StringBuilder(S);

        String result = "";
        for (int i=0; i<str.length();i++){
            String a = str.substring(i);
            for(int j=i; j<=i+a.length()/2 ; j++){
                if(str.substring(i, j).equals(new StringBuilder(str.substring(j, j + (j-i))).reverse().toString())){
                    if(result.length() < str.substring(i,j).length()*2){
                        result = str.substring(i,j)+str.substring(j, j + (j-i));
                    }
                }
            }
        }

        return result.equals("")? ""+S.charAt(0) : result;
    }
}