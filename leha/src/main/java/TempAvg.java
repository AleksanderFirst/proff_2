/**
 * Created by avasilenko on 26.06.2015.
 */
public class TempAvg {

    double closestToAvg(double[] ts){
        double dAvgTemp = 0;
        double dClosestTemp;

        //��� ������ ������� ��������
        if (ts.length == 0)
        {
            return 0;
        }

        //����������� avg �������
        for (int i=0; i<ts.length; i++)
        {
            dAvgTemp += ts[i];
        }

        dAvgTemp = dAvgTemp / ts.length;

        dClosestTemp = ts[0];

        //����������� ��������� � �������� ��������
        for (int i=0; i<ts.length; i++)
        {
            //���� ����������� ������� �� ����� ��������� - ������
            if(ts[i]<-273 && ts[i]>5526)
            {
                Exception e = new Exception("Error");
                e.getMessage();
            }

            //���� ����� ������� ������� ����� � �������� ��� �����������
            else if(Math.abs(ts[i]-dAvgTemp) < Math.abs(dClosestTemp-dAvgTemp))
            {
                dClosestTemp = ts[i];
            }

            //���� ��������������� ��������
            else if(Math.abs(ts[i]-dAvgTemp) == Math.abs(dClosestTemp-dAvgTemp))
            {
                dAvgTemp = Math.min(ts[i], dClosestTemp);
            }
        }
        return dAvgTemp;
    }
}
