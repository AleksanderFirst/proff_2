import examples.recursion.TemperatureException;
import org.junit.Test;

/**
 * Created by user on 6/23/2015.
 */
public class TemperatureTest {
    private double[] testDouble = {1, -3, 2, 4, 5, 3};
    private double VALUE_TO_CHECK = 3.0;

    @Test(expected = RuntimeException.class)
    public void testTemperature() throws Exception {
        if(true) {
            throw new TemperatureException();
        }
    }


}
