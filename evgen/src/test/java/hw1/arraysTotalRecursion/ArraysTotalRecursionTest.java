package hw1.arraysTotalRecursion;

import hw1.closestToAverage.TemperaturesClosestToAverage;
import hw1.closestToZero.TemperatureException;
import junit.framework.Assert;
import org.junit.Test;

public class ArraysTotalRecursionTest {
    private double[] arr1 = {2.0, 3.0, -4.0, 12.0, -7.0};
    private double[] arr2 = {2.0, 3.0, -4.0, 12.0, -7.0, 1.0};

    @Test
    public void arraysTotalRecursionTest() {
        ArraysTotalRecursion arraysTotalRecursion = new ArraysTotalRecursion();

        double n = arraysTotalRecursion.arraysTotalRecursion(arr2);
        Assert.assertEquals(7.0, n, 0.0);
    }
}
