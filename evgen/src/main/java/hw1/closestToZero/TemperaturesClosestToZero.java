package hw1.closestToZero;

import hw1.closestToZero.ClosestToZero;
import hw1.closestToZero.TemperatureException;

public class TemperaturesClosestToZero implements ClosestToZero {

    private double[] ts = {7.0, -10.0, 13.0, 8.0, 4.0, -7.2, -12.0, -3.7, 3.5, -9.6, 6.5, -1.7, -6.2, 7.0};

    @Override
    public double closestToZero(double[] ts) throws TemperatureException {
        double closestToZero = Double.MAX_VALUE;
        //if ts is empty return 0;
        if (ts.length == 0){
            return 0;
        }
        for (double t : ts) {
            //out of array temperature range exception
            if (t < -273 | t > 5527) throw new TemperatureException();
            //search closest to zero
            if (Math.abs(closestToZero) > Math.abs(t)) closestToZero = t;
            //if two numbers are close to zero
            if (Math.abs(closestToZero) == t & closestToZero < 0 &  t > 0) closestToZero = t;
        }
        return closestToZero;
        }
    }

