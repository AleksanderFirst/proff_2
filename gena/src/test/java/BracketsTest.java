import org.junit.Assert;
import org.junit.Test;
import tasks.epam.brackets.BracketsValidator;

/**
 * Created by sigen on 6/29/2015.
 */
public class BracketsTest {
    String str1 = "(())";
    String str2 = "()))";
    String str3 = "()()()";
    String str4 = ")()()(";
    String str5 = "(()())";
    boolean value;
    BracketsValidator validator = new BracketsValidator();

    @Test
    public void testBracketsTrue(){
        value = validator.validate(str1,0,0);
        Assert.assertEquals(value, true);
        value = validator.validate(str3,0,0);
        Assert.assertEquals(value, true);
        value = validator.validate(str5,0,0);
        Assert.assertEquals(value, true);
    }
    @Test
    public void testBracketsFalse(){
        value = validator.validate(str4,0,0);
        Assert.assertEquals(value, false);
        value = validator.validate(str2,0,0);
        Assert.assertEquals(value, false);
    }
}
