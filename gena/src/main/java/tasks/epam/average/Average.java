package tasks.epam.average;

/**
 * Created by sigen on 6/29/2015.
 */
public interface Average {
    double closestToAverage(double[] ts) throws ValueOutOfBoundException;
    double calculateAverage(double[] ts);

}
