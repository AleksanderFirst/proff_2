import org.junit.Assert;
import org.junit.Test;
import tasks.epam.average.ClosestToAverage;
import tasks.epam.average.ValueOutOfBoundException;


/**
 * Created by sigen on 6/29/2015.
 */
public class TestAverage {
    double[] arr = {1.2, 5.3, 2, 4, 6, 3.2, -5, -1.2, 1.875};
    double[] arr2 = {};
    double[] arr3 = {-1, -2, -3, -4, 1};
    double[] arr4 = {4, 6, 5, -276};
    double[] arr5 = {4, 6, 5, 5527};
    double TRUE_VALUE = 1.875;
    double TRUE_VALUE2 = 0;
    double TRUE_VALUE3 = -2;
    ClosestToAverage average = new ClosestToAverage();

    @Test
    public void testAvrage() throws ValueOutOfBoundException {
        double temp = average.closestToAverage(arr);
        Assert.assertEquals(temp, TRUE_VALUE, 0);
        temp = average.closestToAverage(arr2);
        Assert.assertEquals(temp, TRUE_VALUE2, 0);
        temp = average.closestToAverage(arr3);
        Assert.assertEquals(temp, TRUE_VALUE3, 0);
    }

    @Test(expected = ValueOutOfBoundException.class)
    public void outOfLowBorder() throws Exception {
        double temp = average.closestToAverage(arr4);
    }

    @Test(expected = ValueOutOfBoundException.class)
    public void outOfHighBorder() throws Exception {
        double temp = average.closestToAverage(arr5);
    }
}
