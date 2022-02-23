package divideandconquer.maximumsubarray;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSubArrayTest {

    private MaximumSubArray maximumSubArray;

    @Test
    public void testMaximumSubArrayCombinedValues() {
        Assert.assertEquals(maximumSubArray.maximumSubArray(new int[]{-2, -3, 4, -1, -2, 1, 5, -3},0,7),7);
    }

    @Test
    public void testMaximumSubArrayAllPositiveValues() {
        Assert.assertEquals(maximumSubArray.maximumSubArray(new int[]{ 2, 3, 4, 5, 7},0,4),21);
    }

    @Test
    public void testMaximumSubArrayAllNegativeValues() {
        Assert.assertEquals(maximumSubArray.maximumSubArray(new int[]{-2, -3, -4, -1, -2, -1, -5, -3},0,7),-1);

        Assert.assertEquals(maximumSubArray.maximumSubArray(new int[]{-2, -3, -4, -1,0, -2, -1, -5, -3},0,8),0);
    }

}
