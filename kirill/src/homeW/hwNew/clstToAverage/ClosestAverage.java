package clstToAverage;

import clstToZero.TemperatureExeption;

public class ClosestAverage implements TemperatureRangee {
    @Override
    public double closestToAverage(double[] ts) throws TemperatureExeption {
        double sum=0.0;
            if (ts.length == 0) return 0;
        for (int j = 0; j < ts.length; j++) {
            sum+=ts[j];
        }
        double avr=sum/(ts.length);
            double soClose=ts[0];
            double min=ts[0];
            for (int i = 0; i < ts.length; i++) {
                if (ts[i] < -273 || ts[i] > 5526) throw new TemperatureExeption();
                if (Math.abs(ts[i])-avr<min){
                    min=ts[i];
                    soClose=ts[i];
                }
                if (Math.abs(soClose)==Math.abs(ts[i])) {
                    if (soClose > ts[i])
                        soClose = ts[i];
                }
            }
        System.out.println(avr+"-Average");
            return soClose;
    }
}
