package sumList;

import java.util.Arrays;

public class Sum {

    public double findSum(double[] x){
        if (x.length==1) return x[0];
        double[] xfh= Arrays.copyOfRange(x,0,x.length/2);
        double[] xsh= Arrays.copyOfRange(x, x.length/2, x.length);
      return findSum(xfh)+findSum(xsh);
    }
}
