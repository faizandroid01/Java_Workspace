package testKnowledge;

public class DivisionTest {

    public static int divide(int a, int b) {
        int k;
        try {
            k = a / b;
        } finally {
            System.out.println("Finally in Divide");
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(method());
    }

    private static Object method() {
        try {
            return divide(10, 0);
        }catch(RuntimeException e){
            System.out.println("RT : "+e.getMessage() + " " + e);
            return "runtimeException";
        }
        catch (Exception e) {
            System.out.println("E : "+e.getMessage() + " " + e);
            return "catch";
        } finally {
            return "finally";
        }
    }

}
