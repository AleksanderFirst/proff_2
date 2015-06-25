package home_task_1.ClosestToZero;

public class ClosestToZero implements ComparableToZero {
    public double closestToZero(double[] ts) throws TemperatureOutOfBoundsException {
        if (ts == null) return 0;
        double closest = ts[0];
        if (closest < -273.0 | closest > 5526.0) {
            throw new TemperatureOutOfBoundsException();
        }
        for (int i = 1; i < ts.length; i++) {
            if (ts[i] < -273.0 | ts[i] > 5526.0) {
                throw new TemperatureOutOfBoundsException();
            }
            if (Math.abs(ts[i]) < Math.abs(closest)) {
                closest = ts[i];
            } else if (Math.abs(ts[i]) == Math.abs(closest)) {
                closest = ts[i] > closest ? ts[i] : closest;
            }
        }
        return closest;
    }
}
