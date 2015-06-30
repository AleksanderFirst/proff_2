import org.junit.Assert;
import org.junit.Test;
import tasks.epam.temperature.Implementor;
import tasks.epam.temperature.TemperatureOutOfBoundException;

/**
 * Created by user on 6/23/2015.
 */
public class TestTemperature {
    double[] arr = {1.2, 5.3, 2, 4, 6, 3.2, -5, -1.2};
    double[] arr2 = {};
    double[] arr3 = {-1, -2, -3, -4, 1};
    double[] arr4 = {4, 6, 5, -276};
    double[] arr5 = {4, 6, 5, 5527};
    double TRUE_VALUE = 1.2;
    double TRUE_VALUE2 = 0;
    double TRUE_VALUE3 = 1;
    Implementor temperature = new Implementor();

    @Test
    public void testTemperature() throws TemperatureOutOfBoundException {
        double temp = temperature.closesToZero(arr);
        Assert.assertEquals(temp, TRUE_VALUE, 0);
        temp = temperature.closesToZero(arr2);
        Assert.assertEquals(temp, TRUE_VALUE2, 0);
        temp = temperature.closesToZero(arr3);
        Assert.assertEquals(temp, TRUE_VALUE3, 0);
    }

    @Test(expected = TemperatureOutOfBoundException.class)
    public void outOfLowBorder() throws Exception {
        double temp = temperature.closesToZero(arr4);
    }

    @Test(expected = TemperatureOutOfBoundException.class)
    public void outOfHighBorder() throws Exception {
        double temp = temperature.closesToZero(arr5);
    }
}
