import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Result {

	/*
	 * Complete the 'sockMerchant' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER n 2. INTEGER_ARRAY ar
	 */

	public static int sockMerchant(int n, List<Integer> ar) {
		Set<Integer> s = new HashSet<>();
		int sum = 0, i = 0;
		while (i < ar.size()) {
			if (!s.add(ar.get(i))) {
				sum = sum + 1;
				System.out.println(s.remove(ar.get(i)) + " ++ " + ar.get(i) +" sum " + sum);
				System.out.println(s);
			}
			i++;
		}
		return sum;
	}

}

public class SocksMerchant {
	public static void main(String[] args) {

		List<Integer> ar = Arrays.asList(10, 20, 30, 10, 20, 25, 10, 20, 10);
		int size = 9;

		System.out.println(Result.sockMerchant(size, ar));

	}
}
