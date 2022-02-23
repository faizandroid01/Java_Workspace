import java.util.Collections;

public class SubString {

    public static void main(String[] args) {

        String str = "faiz";
        System.out.println(str.substring(0));
        System.out.println(str.substring(0,0));
        System.out.println(str.substring(0,str.length()));
        //System.out.println(str.substring(0,str.length()+1));//StringIndexOutOfBoundsException
        System.out.println("5"+str.substring(str.length()));
        //System.out.println(str.substring(-2)); //java.lang.StringIndexOutOfBoundsException

    }
}
