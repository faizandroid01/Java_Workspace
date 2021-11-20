package testKnowledge;

import java.util.ArrayList;
import java.util.List;

public class ByteUsage {
    public static void main(String[] args) {

        int a = -252;
        double b =  -2;
        byte a1 = (byte) a;
        byte b1 = (byte) b;
        System.out.println(a1 + ":" + b1);

        byte ans = (byte) (a1 - b1) ;
        System.out.println(ans);

    }
}
