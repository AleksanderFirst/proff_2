package home_task_1.closest_to_zero;

/**
 * Created by Антон on 24.06.2015.
 */
public class ClosestToZero implements TemperatureClosestToZero {
    public double closestToZero(double [] ts) throws TemperatureException{
        if (ts.length == 0) return 0;
        double absClosest = Double.MAX_VALUE;
        double closest = 0;
        for (int i = 0; i < ts.length; i++){
            if (ts[i] < -273 || ts[i] > 5526) throw new TemperatureException();
            if (Math.abs(ts[i]) < absClosest) {
                closest = ts[i];
                absClosest = Math.abs(closest);
            }
            if (Math.abs(ts[i]) == absClosest && ts[i] > 0) {
                closest = ts[i];
                absClosest = Math.abs(closest);
            }
        }
        return closest;
    }

}
