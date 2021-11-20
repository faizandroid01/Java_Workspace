public class StringComparisions {
    public static void main(String[] args) {


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
