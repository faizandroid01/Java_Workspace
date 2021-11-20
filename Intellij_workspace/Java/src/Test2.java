import java.util.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Test2 {

    public static void main(String args[]) {

        String a = "Geeks";
        String b = "Geeks";
        String c = new String("Geeks");
        String d = "GeeksForGeeks";

// object value comparision
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
//  reference comparision
        System.out.println(a == b);
        System.out.println(a==c);
        System.out.println(a==d);

//  compareTo comparision -
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(a.compareTo(d));
    }
}