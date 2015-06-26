/**
 * Created by avasilenko on 26.06.2015.
 */
public class TempAvg {

    double closestToAvg(double[] ts){
        double dAvgTemp = 0;
        double dClosestTemp;

        //При пустом массиве выбиваем
        if (ts.length == 0)
        {
            return 0;
        }

        //Расчитываем avg массива
        for (int i=0; i<ts.length; i++)
        {
            dAvgTemp += ts[i];
        }

        dAvgTemp = dAvgTemp / ts.length;

        dClosestTemp = ts[0];

        //Расчитываем ближайшее к среднему значений
        for (int i=0; i<ts.length; i++)
        {
            //Если температура выходит за рамки возможной - ошибка
            if(ts[i]<-273 && ts[i]>5526)
            {
                Exception e = new Exception("Error");
                e.getMessage();
            }

            //Если новый элемент массива ближе к среднему чем предведущий
            else if(Math.abs(ts[i]-dAvgTemp) < Math.abs(dClosestTemp-dAvgTemp))
            {
                dClosestTemp = ts[i];
            }

            //Если равноотдаленные значения
            else if(Math.abs(ts[i]-dAvgTemp) == Math.abs(dClosestTemp-dAvgTemp))
            {
                dAvgTemp = Math.min(ts[i], dClosestTemp);
            }
        }
        return dAvgTemp;
    }
}
