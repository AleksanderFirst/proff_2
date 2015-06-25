package home_task_1.brackets_recursion;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Антон on 25.06.2015.
 */
public class BracketsRecursionTest {
    @Test
    public void testBracketBalance(){
        Brackets brackets = new Brackets("))((");
        Assert.assertEquals(BracketsRecursion.CheckBrackets(brackets),BracketsRecursion.RecursionCheckBrackets(brackets,0));
        Assert.assertFalse(BracketsRecursion.RecursionCheckBrackets(brackets,0));
    }
}
