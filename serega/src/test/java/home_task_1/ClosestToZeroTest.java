package home_task_1;

import home_task_1.ClosestToZero.ClosestToZero;
import home_task_1.ClosestToZero.TemperatureOutOfBoundsException;
import junit.framework.Assert;
import org.junit.Test;

public class ClosestToZeroTest {
    private double[] testDouble = {7, 13, 8, 4, 3.5, 6.5, 7, -10, -7.2, -12, -3.7, -9.6, -1.7, -6.2};
    private static final double VALUE_TO_CHECK = -1.7;

    ClosestToZero closestToZero = new ClosestToZero();

    @Test
    public void testClosestToZero() throws TemperatureOutOfBoundsException {
        Assert.assertEquals(VALUE_TO_CHECK, closestToZero.closestToZero(testDouble));
    }

    @Test(expected = TemperatureOutOfBoundsException.class)
    public void testClosestToZeroException() throws TemperatureOutOfBoundsException {
        closestToZero.closestToZero(new double[]{-288, 5});
    }

    @Test
    public void testClosestToZeroNull() throws TemperatureOutOfBoundsException {
        Assert.assertEquals(0.0, closestToZero.closestToZero(null));
    }
}
