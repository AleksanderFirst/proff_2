package hw1.closestToAverage;

import hw1.closestToZero.TemperatureException;
import junit.framework.Assert;
import org.junit.Test;

public class TemperaturesClosestToAverageTest {
    private double[] ts = {7.0, -10.0, 13.0, 8.0, 14.0, -7.2, -12.0, -3.7, 3.5, -9.6, 6.5, -1.7, -6.2, 7.2};
    private double[] ts1 = {6.0, -2.0, -8.0, 12.0,};
    private static final double DELTA = 0.0;

     @Test
    public void averageToZeroTest() throws TemperatureException {
         TemperaturesClosestToAverage temperaturesClosestToAverage = new TemperaturesClosestToAverage();

         double n = temperaturesClosestToAverage.closestToAverage(ts1);
         double avg = temperaturesClosestToAverage.calcAverage(ts1);
         Assert.assertEquals(-2.0, n, DELTA);
    }

    @Test
    public void calAverageTest() throws TemperatureException {
        TemperaturesClosestToAverage temperaturesClosestToAverage = new TemperaturesClosestToAverage();

        double n = temperaturesClosestToAverage.calcAverage(ts);
        Assert.assertEquals(0.7, n, DELTA);
    }
}
