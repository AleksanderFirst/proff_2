package hw1.closestToAverage;

import hw1.closestToZero.TemperatureException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TemperaturesClosestToAverage implements ClosestToAverage {
    private double[] ts = {7.0, -10.0, 13.0, 8.0, 4.0, -7.2, -12.0, -3.7, 3.5, -9.6, 6.5, -1.7, -6.2, 7.0};

    @Override
    public double closestToAverage(double[] ts) throws TemperatureException {
        double average = calcAverage(ts);
        double closestToAverage = 0;
        double buf = Double.MAX_VALUE;
        if (ts.length == 0){
            return 0;
        }
        for(double t : ts) {
            if (t < -273 | t > 5527) throw new TemperatureException();
            if (Math.abs(t - average) < buf) {
                closestToAverage = t;
                buf = Math.abs(t - average);
            }
            if (Math.abs(t - average) == buf && t < closestToAverage) {
                closestToAverage = t;
                buf = Math.abs(t - average);
            }
        }
        return closestToAverage;
    }

    @Override
    public double calcAverage(double[] ts) {
        double sum = 0;
        double average;
        for (double t : ts) {
            sum = sum + t;
        }
        average = sum / ts.length;
        double newAverage = new BigDecimal(average).setScale(1, RoundingMode.UP).doubleValue();
        return newAverage;
    }
}
