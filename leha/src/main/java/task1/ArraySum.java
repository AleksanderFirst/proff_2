package task1;

/**
 * Created by oleksii on 27.06.2015.
 */
public class ArraySum {

    double getSumByDiv(double[] ar)
    {
        double dSum = 0;

        if (ar.length == 1)
        {
            dSum = ar[0];
            return dSum;
        }

        int iArrSize1;
        int iArrSize2;

        iArrSize1 = ar.length/2;
        iArrSize2 = ar.length - iArrSize1;

        double [] ar1 = new double [iArrSize1];
        double [] ar2 = new double [iArrSize2];

        for (int i=0; i<iArrSize1; i++)
        {
            ar1[i] = ar[i];
        }

        for (int i=0; i<iArrSize2; i++)
        {
            ar2[i] = ar[i+iArrSize1];
        }

        return dSum+getSumByDiv(ar1)+getSumByDiv(ar2);
    }
}
