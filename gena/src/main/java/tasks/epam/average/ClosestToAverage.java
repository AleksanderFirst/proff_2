package tasks.epam.average;



/**
 * Created by sigen on 6/29/2015.
 */
public class ClosestToAverage implements Average {
    public double closestToAverage(double[] ts) throws ValueOutOfBoundException {
        if (ts.length == 0) {
            return 0;
        }
        double average = calculateAverage(ts);
        double temp = ts[0];
        for (int i = 0; i < ts.length; i++) {
            if (ts[i] < -273 || ts[i] > 5526) {
                throw new ValueOutOfBoundException();
            }
            if (Math.abs(ts[i] - average) < Math.abs(temp - average)) {
                temp = ts[i];
            }
            if (Math.abs(ts[i] - average) == Math.abs(temp) - average) {
                if (ts[i] < temp) {
                    temp = ts[i];
                }
            }
        }
        return temp;
    }

    public double calculateAverage(double[] ts) {
        double sum = 0;
        for (int i = 0; i < ts.length; i++) {
            sum += ts[i];
        }
        double average = sum / ts.length;
        return average;
    }
}
