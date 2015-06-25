package home_task_1;

import home_task_1.BracketValidator.BracketValidator;
import junit.framework.Assert;
import org.junit.Test;

public class BracketValidatorTest {
    @Test
    public void testBracets() {
        Assert.assertEquals(true, BracketValidator.isBracketsCorrect("()"));
        Assert.assertEquals(false, BracketValidator.isBracketsCorrect(")"));
        Assert.assertEquals(false, BracketValidator.isBracketsCorrect("("));
        Assert.assertEquals(false, BracketValidator.isBracketsCorrect(")("));
        Assert.assertEquals(false, BracketValidator.isBracketsCorrect("())(()"));
        Assert.assertEquals(true, BracketValidator.isBracketsCorrect("(a+b)+(a+b)"));
        Assert.assertEquals(false, BracketValidator.isBracketsCorrect("(a+b)+(a+b("));
    }

}
