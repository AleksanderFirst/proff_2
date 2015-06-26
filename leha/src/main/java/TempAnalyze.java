/**
 * Created by avasilenko on 26.06.2015.
 */
public class TempAnalyze {

    double closestToZero(double[] ts){

        if (ts.length == 0)
        {
            return 0;
        }
        double minValue=ts[0];

        for (int i=1; i<ts.length; i++)
        {
            if(ts[i]<-273 && ts[i]>5526)
            {
                Exception e = new Exception("Error");
                e.getMessage();
            }
            else if(Math.abs(minValue)>Math.abs(ts[i]))
            {
                minValue = ts[i];
            }
            else if (Math.abs(minValue) == Math.abs(ts[i]) && minValue != ts[i]){
                minValue = Math.abs(ts[i]);
            }

        }
        return minValue;
    }

}

