package closestToZero;

public class ClosestTemperature implements TemperatureRange {
    @Override
    public double closestToZero(double[] ts) throws TemperatureExeption {
        double soClose = Double.MAX_VALUE;
        if (ts.length == 0) return 0;
        for (int i = 0; i < ts.length; i++) {
            if (ts[i] < -273 || ts[i] > 5526) throw new TemperatureExeption();
            if (Math.abs(ts[i]) < soClose) {
                soClose = Math.abs(ts[i]);
            }
        }
        return soClose;
    }
}
