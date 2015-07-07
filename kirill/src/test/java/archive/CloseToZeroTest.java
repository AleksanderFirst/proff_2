package archive;

import clstToZero.ClosestTemperature;
import clstToZero.TemperatureExeption;
import org.junit.Test;

public class CloseToZeroTest {
    @Test
    public void CloseToZeroTest() throws TemperatureExeption {
        double[] ts = {-2,12,50,-7,-200};
        double result;
        ClosestTemperature temperature = new ClosestTemperature();
        result = temperature.closestToZero(ts);
        System.out.println(result);
    }
    @Test(expected = TemperatureExeption.class)
    public void TemperatureExeptionTest () throws TemperatureExeption {
        double[] ts = {-2,12,50,-7,-9000};
        double result;
        ClosestTemperature temperature = new ClosestTemperature();
        result = temperature.closestToZero(ts);

    }
}
