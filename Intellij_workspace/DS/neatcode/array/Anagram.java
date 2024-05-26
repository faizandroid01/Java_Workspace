package neatcode.array;

import java.util.HashMap;
import java.util.Map;

public class Anagram {


    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;

        Map<Character, Integer> charCount = new HashMap<>();

        for (int i=0; i<s.length();i++){
            char key = s.charAt(i);
            int count = charCount.containsKey(key) ?  charCount.get(key) : 0;
            charCount.put(key, count+1 );

            char key2 = t.charAt(i);
            int count2 = charCount.containsKey(key2) ?  charCount.get(key2) : 0;

            charCount.put(key2, count2-1 );

        }

        final boolean[] isAnagram = {true};
        charCount.forEach( (k,v) -> {
            if (v != 0) {
                isAnagram[0] = false;
            }
        } );

     return isAnagram[0];
    }



    public static void main(String[] args) {

        System.out.println(isAnagram("rat","cat"));
        System.out.println(isAnagram("anagram","naagmar"));
        System.out.println(isAnagram("a","ab"));


    }

}
