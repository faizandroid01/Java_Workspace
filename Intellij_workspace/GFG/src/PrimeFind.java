import java.util.Scanner;

public class PrimeFind {

    private static int findPrime(int X, boolean left) {
        int val = 0;
        if (left) {
            for (int k = X - 1; k >= 2; k--) {
                if (isPrime(k)) {
                    val = k;
                    break;
                }
            }
        } else {
            for (int k = X + 1; k < Integer.MAX_VALUE; k++) {
                if (isPrime(k)) {
                    val = k;
                    break;
                }
            }
        }
        return val;
    }

    private static boolean isPrime(int k) {

        for (int i = 2; i < k; i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] inputLine = s.nextLine().replaceAll("\\s+$", "").split(" ");
        for (String s1 : inputLine) {
            System.out.println(findPrime(Integer.parseInt(s1), true) + " " + findPrime(Integer.parseInt(s1), false)); // left Prime + rightPrime
        }
    }
}
