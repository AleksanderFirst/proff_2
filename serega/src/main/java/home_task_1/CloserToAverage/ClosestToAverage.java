package home_task_1.CloserToAverage;

public class ClosestToAverage implements ComparableToAverage {
    public double closestToAverage(double[] ts) throws TemperatureOutOfBoundsException {
        if (ts == null) return 0;
        double average = 0;
        for (double d : ts) {
            if (d < -273.0 | d > 5526.0) {
                throw new TemperatureOutOfBoundsException();
            }
            average += d;
        }
        average /= ts.length;
        double closest = ts[0];
        for (int i = 1; i < ts.length; i++) {
            if (Math.abs(average - ts[i]) < Math.abs(average - closest)) {
                closest = ts[i];
            } else if (Math.abs(average - ts[i]) == Math.abs(average - closest)) {
                closest = ts[i] < closest ? ts[i] : closest;
            }
        }
        return closest;
    }
}
