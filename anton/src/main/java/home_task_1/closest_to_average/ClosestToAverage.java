package home_task_1.closest_to_average;

import home_task_1.closest_to_zero.TemperatureException;

/**
 * Created by Антон on 25.06.2015.
 */
public class ClosestToAverage implements TemperatureClosestToAverage{
    public double closestToAverage(double [] ts) throws TemperatureException {
        if (ts.length == 0) return 0;
        double avg = 0;
        for (int i = 0; i < ts.length; i++) {
            avg += ts[i];
        }
        avg /= ts.length;
        double absClosest = Double.MAX_VALUE;
        double closest = 0;
        for (int i = 0; i < ts.length; i++){
            if (ts[i] < -273 || ts[i] > 5526) throw new TemperatureException();
            if (Math.abs(ts[i] - avg) < absClosest) {
                closest = ts[i];
                absClosest = Math.abs(ts[i] - avg);
            }
            if (Math.abs(ts[i] - avg) == absClosest && ts[i] < closest) {
                closest = ts[i];
                absClosest = Math.abs(ts[i] - avg);
            }
        }
        return closest;
    }
}
