package home_task_1.closest_to_zero;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Антон on 24.06.2015.
 */
public class ClosestToZeroTest {
    private double[] ts = {1, -1, 2, -2, -200};
    private double[] ts1 = {8000, -1, 2, -2, -200}; //exception
    private double[] ts2 = {1, -1, 2, -290};  //exception
    private double[] ts3 = {-0.1, 2.2, -2, -200};
    private double[] ts4 = {};  //empty

    private double CHECK_TS = 1.0;
    private double CHECK_TS3 = -0.1;

    private ClosestToZero closestToZero = new ClosestToZero();
    @Test
    public void testClosetToZero() throws TemperatureException{
        double i = 0;
            i = closestToZero.closestToZero(ts3);

        Assert.assertEquals(CHECK_TS3,i,0.0);
    }

    @Test(expected = TemperatureException.class)
    public void testTemperatureException()throws TemperatureException{
        double i = 0;
            i = closestToZero.closestToZero(ts1);

        Assert.assertEquals(CHECK_TS,i,0.0);
    }
}
