package home_task_1.closest_to_average;

import home_task_1.closest_to_zero.TemperatureException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Антон on 25.06.2015.
 */
public class ClosestToAverageTest {
    private double[] ts = {1, -1, 2, -2};
    private double[] ts1 = {8000, -1, 2, -2, -200}; //exception
    private double[] ts2 = {1, -1, 2, -290};  //exception
    private double[] ts3 = {4, 5, 6};
    private double[] ts4 = {};  //empty

    private double CHECK_TS = -1;
    private double CHECK_TS3 = 5;

    private ClosestToAverage closestToAverage = new ClosestToAverage();


    @Test
    public void testClosetToZero() throws TemperatureException {
        double i = 0;
        i = closestToAverage.closestToAverage(ts3);

        Assert.assertEquals(CHECK_TS3, i, 0.0);
    }

    @Test(expected = TemperatureException.class)
    public void testTemperatureException()throws TemperatureException{
        double i = 0;
        i = closestToAverage.closestToAverage(ts1);

        Assert.assertEquals(CHECK_TS,i,0.0);
    }
}
