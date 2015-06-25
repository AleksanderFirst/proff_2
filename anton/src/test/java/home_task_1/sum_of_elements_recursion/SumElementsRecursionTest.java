package home_task_1.sum_of_elements_recursion;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Антон on 25.06.2015.
 */
public class SumElementsRecursionTest {

    @Test
    public void testSumElements(){
        int [] array = {1,2,3,4};
        Assert.assertEquals(SumElements(array),SumElementRecursion.summarize(array,0,array.length - 1));
    }

    public int SumElements(int [] array){

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
