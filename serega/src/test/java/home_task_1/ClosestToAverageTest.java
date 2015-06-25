package home_task_1;

import home_task_1.CloserToAverage.ClosestToAverage;
import junit.framework.Assert;
import org.junit.Test;

public class ClosestToAverageTest {
    private double[] testDouble = {7, 13, 8, 4, 3.5, 6.5, 7, -10, -7.2, -12, -3.7, -9.6, -1.7, -6.2};
    private static final double VALUE_TO_CHECK = -1.7;

    ClosestToAverage closestToAverage = new ClosestToAverage();

    @Test
    public void testClosestToAverage() throws home_task_1.CloserToAverage.TemperatureOutOfBoundsException {
        Assert.assertEquals(VALUE_TO_CHECK, closestToAverage.closestToAverage(testDouble));
    }

    @Test(expected = home_task_1.CloserToAverage.TemperatureOutOfBoundsException.class)
    public void testClosestToAwerageException() throws home_task_1.CloserToAverage.TemperatureOutOfBoundsException {
        closestToAverage.closestToAverage(new double[]{-288, 5});
    }

    @Test
    public void testClosestToAverageNull() throws home_task_1.CloserToAverage.TemperatureOutOfBoundsException {
        Assert.assertEquals(0.0, closestToAverage.closestToAverage(null));
    }
}
