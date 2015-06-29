package hw1.closestToZero;

import org.junit.Assert;
import org.junit.Test;

public class TemperaturesClosestToZeroTest {
    //current array from example
    private double[] ts = { 7.0, -10.0, 13.0, 8.0, 4.0, -7.2, -12.0, -3.7, 3.5, -9.6, 6.5, -1.7, -6.2, 7.0};
    //consider a positive number if two numbers (positive and negative) are closest to zero
    private double[] ts1 = { 7.0, -10.0, 13.0, 8.0, 4.0, -7.2, -12.0, -3.7, 3.5, -9.6, 6.5, -1.7, -6.2, 1.7};
    //if array is empty
    private double[] ts2 = {};
    //out of range exception(... < -273)
    private double[] ts3 = { 7.0, -10.0, 13.0, 8.0, 4.0, -7.2, -12.0, -3.7, 3.5, -9.6, 6.5, -1.7, -6.2, -293};
    //out of range exception(... > 5526)
    private double[] ts4 = { 7.0, -10.0, 13.0, 8.0, 4.0, -7.2, -12.0, -3.7, 3.5, -9.6, 6.5, -1.7, -6.2, 7777};

    private static final double DELTA = 0.0;

    @Test
     public void testClosestToZero() throws TemperatureException {
        TemperaturesClosestToZero temperaturesClosestToZero = new TemperaturesClosestToZero();
        double n  = temperaturesClosestToZero.closestToZero(ts2);

        Assert.assertEquals(0, n, DELTA);
    }

    @Test(expected = TemperatureException.class)
    public void testClosestToZeroE() throws TemperatureException {
        TemperaturesClosestToZero temperaturesClosestToZero = new TemperaturesClosestToZero();
        double n  = temperaturesClosestToZero.closestToZero(ts4);

        Assert.assertEquals(-1.7, n, 0.0);
    }
}
