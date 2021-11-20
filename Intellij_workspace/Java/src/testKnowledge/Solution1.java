package testKnowledge;

public class Solution1 {

    private static String name = "Sara";

    public Solution1() {
        name = "Faiz";
    }

    public static String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(Solution1.name);
        System.out.println(Solution1.getName());
        Solution1 s = new Solution1();

    }

}
