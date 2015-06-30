import org.junit.Test;
import sumList.Sum;

public class SumArrayTest {
    @Test
    public void arrayRecursionSumTest(){
        double[] ts = {1,2,3,4,5,6,7.5};
        Sum tr = new Sum();
        assert tr.findSum(ts)==Summ(ts);
        System.out.println(tr.findSum(ts)==Summ(ts));
    }
    public double Summ (double[] ts){
        double sum=0.0;
        for (int i = 0; i <ts.length ; i++) {
            sum+=ts[i];
        }
        return sum;
    }
}