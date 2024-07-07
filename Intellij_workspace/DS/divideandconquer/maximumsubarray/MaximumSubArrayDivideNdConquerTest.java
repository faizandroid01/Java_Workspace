package divideandconquer.maximumsubarray;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaximumSubArrayDivideNdConquerTest {


    @Test
    public void testMaximumSubArrayAllPositiveValues() {
        Assert.assertEquals(MaximumSubArrayDivideNdConquer.maximumSubArray(new int[]{ 2, 3, 4, 5, 7},0,4),21);
        Assert.assertEquals(MaximumSubArrayDP.maximumSubArray(new int[]{ 2, 3, 4, 5, 7}),21);

    }
    @Test
    public void testMaximumSubArrayAllNegativeValues() {
        Assert.assertEquals(MaximumSubArrayDivideNdConquer.maximumSubArray(new int[]{-2, -3, -4, -1, -2, -1, -5, -3},0,7),-1);
        Assert.assertEquals(MaximumSubArrayDP.maximumSubArray(new int[]{-2, -3, -4, -1, -2, -1, -5, -3}),-1);

        Assert.assertEquals(MaximumSubArrayDivideNdConquer.maximumSubArray(new int[]{-2, -3, -4, -1,0, -2, -1, -5, -3},0,8),0);
        Assert.assertEquals(MaximumSubArrayDP.maximumSubArray(new int[]{-2, -3, -4, -1,0, -2, -1, -5, -3}),0);

    }


    @Test
    public void testMaximumSubArrayCombinedValues() {
        Assert.assertEquals(MaximumSubArrayDivideNdConquer.maximumSubArray(new int[]{-2, -3, 4, -1, -2, 1, 5, -3},0,7),7);
        Assert.assertEquals(MaximumSubArrayDP.maximumSubArray(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}),7);

    }



}
