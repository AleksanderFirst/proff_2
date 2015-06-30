package tasks.epam.temperature;

/**
 * Created by sigen on 6/24/2015.
 */
public class Implementor implements Temperature {

    public double closesToZero(double[] ts) throws TemperatureOutOfBoundException {
        if (ts.length == 0) {
            return 0;
        }
        double temp = ts[0];
        for (int i = 0; i < ts.length; i++) {
            if (ts[i] < -273 || ts[i] > 5526) {
                throw new TemperatureOutOfBoundException();
            }
            if (Math.abs(ts[i]) < Math.abs(temp)) {
                temp = ts[i];
            }
            if (Math.abs(ts[i]) == Math.abs(temp)) {
                if (ts[i] > temp) {
                    temp = ts[i];
                }
            }
        }
        return temp;
    }
}
