package tasks.epam.temperature;

/**
 * Created by sigen on 6/24/2015.
 */
public interface Temperature {
    public double closesToZero(double[] ts) throws TemperatureOutOfBoundException;
}
