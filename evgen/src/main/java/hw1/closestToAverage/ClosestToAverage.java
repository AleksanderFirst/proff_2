package hw1.closestToAverage;

import hw1.closestToZero.TemperatureException;

/**
 * Created by Евгений on 29.06.2015.
 */
public interface ClosestToAverage {
    double closestToAverage(double[] ts) throws TemperatureException;
    double calcAverage(double[] ts);
}
