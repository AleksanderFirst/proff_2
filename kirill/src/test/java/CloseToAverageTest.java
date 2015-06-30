
import clstToAverage.ClosestAverage;
import clstToZero.TemperatureExeption;
import org.junit.Test;

public class CloseToAverageTest {
@Test
    public void CloseToAverageTest() throws TemperatureExeption {
    double[] ts = {5,-5};
    ClosestAverage temperature = new ClosestAverage();
    double result = temperature.closestToAverage(ts);
    System.out.println(result);
}
    @Test(expected = TemperatureExeption.class)
    public void TemperatureExeptionTest () throws TemperatureExeption {
        double[] ts = {-2,12,50,-7,-9000};
        ClosestAverage temperature = new ClosestAverage();
        double result = temperature.closestToAverage(ts);

    }
}

