import org.junit.Assert;
import org.junit.Test;
import tasks.epam.arrays.ArrayRecursion;

/**
 * Created by sigen on 6/29/2015.
 */
public class ArraysSumTest {
    double arr1[] = {5,10,1.1,3,1,2};
    double ARR1_SUM = 22.1;
    double arr2[] = {1,3,-5,4,2};
    double ARR2_SUM = 5;
    ArrayRecursion test = new ArrayRecursion();

    @Test
    public void testArraysSum(){
        double temp = test.findArraySum(arr1);
        Assert.assertEquals(temp,ARR1_SUM,0);
        temp = test.findArraySum(arr2);
        Assert.assertEquals(temp, ARR2_SUM, 0);

    }
}
