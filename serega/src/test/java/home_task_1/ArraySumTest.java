package home_task_1;

import home_task_1.ArraySum.ArraySum;
import home_task_1.ArraySum.ArraySumException;
import junit.framework.Assert;
import org.junit.Test;

public class ArraySumTest {
    @Test
    public void testArraySum() throws ArraySumException {
        Assert.assertEquals(5, ArraySum.arraySum(new int[]{1, 2, 2}));
        Assert.assertEquals(10, ArraySum.arraySum(new int[]{10}));
        Assert.assertEquals(10, ArraySum.arraySum(new int[]{5, 5}));
        Assert.assertEquals(10, ArraySum.arraySum(new int[]{5, 1, 1, 2, 1}));
    }

    @Test(expected = ArraySumException.class)
    public void testArraySumNull() throws ArraySumException {
        ArraySum.arraySum(null);
    }
}
