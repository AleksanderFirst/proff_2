package tasks.epam.average;

/**
 * Created by sigen on 6/29/2015.
 */
public interface Average {
    public double closestToAverage(double[] ts) throws ValueOutOfBoundException;
    public double calculateAverage(double[] ts);

}
