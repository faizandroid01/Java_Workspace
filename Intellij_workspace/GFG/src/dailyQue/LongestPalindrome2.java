package dailyQue;

import com.sun.xml.internal.ws.util.StringUtils;

import java.io.*;

class GFG2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {

            String S = read.readLine().trim();
            LongestPalindrome2 ob = new LongestPalindrome2();
            System.out.println(ob.longestPalindrome(S));
        }
    }
}

class LongestPalindrome2{
    String longestPalindrome(String S){
        // aaaabbaa //rfkqyuqfjkxy

        if(S.isEmpty())
            return "";

        StringBuilder str = new StringBuilder(S);

        String result = "";
        for (int i=0; i<str.length();i++){
            for(int j=i; j<=str.length() ; j++){
                if(str.substring(i,j).equals(new StringBuilder(str.substring(i,j)).reverse().toString())){
                    if(result.length() < str.substring(i,j).length()){
                    result = str.substring(i,j);}
                }
            }
        }

        return result.equals("")? ""+S.charAt(0) : result;
    }
}