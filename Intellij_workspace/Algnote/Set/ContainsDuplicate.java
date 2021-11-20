package Set;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] arr) {
		Set<Integer> distictNoSet = new HashSet<Integer>();
		for (int num : arr) {
			if (!distictNoSet.add(num))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		int arr[] = new int[] { 5, 6, 7, 8, 9 };
		System.out.println("Arr contains duplicate :" + containsDuplicate(arr));

	}

}
