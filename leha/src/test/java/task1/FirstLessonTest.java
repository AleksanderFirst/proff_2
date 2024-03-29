package task1;

import org.junit.*;

/**
 * Created by avasilenko on 26.06.2015.
 */

import org.junit.Test;
import task1.ArraySum;
import task1.Brackets;
import task1.TempAnalyze;
import task1.TempAvg;

public class FirstLessonTest {

    @Test
    public void testBrackets()
    {
        Brackets b = new Brackets();
        final boolean isCorrect = true;
        Assert.assertEquals(isCorrect, b.isCorrectBrackets("(())"));
    }

    @Test
    public void testTempAnalyze()
    {
        final double dCorrrect = -1;
        double [] ts = {-1,-15,-17,-3,+5,+17, 17};

        TempAnalyze t = new TempAnalyze();
        Assert.assertEquals(dCorrrect, t.closestToZero(ts), 0);
    }

    @Test
    public void testTempAvg()
    {
        final double dCorrrect = -1;
        double [] ts = {-1,-15,-17,-3,+5,+17, 1};

        TempAvg t = new TempAvg();
        Assert.assertEquals(dCorrrect, t.closestToAvg(ts), 0);
    }

    @Test
    public void testArraySum()
    {
        final double dCorrrect = -13;
        double [] ts = {-1,-15,-17,-3,+5,+17, 1};

        ArraySum t = new ArraySum();
        Assert.assertEquals(dCorrrect, t.getSumByDiv(ts), 0);
    }
}