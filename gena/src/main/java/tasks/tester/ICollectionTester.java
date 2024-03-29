package tasks.tester;

import java.util.Collection;

/**
 * Created by artem on 01.07.15.
 */
public interface ICollectionTester {
    public long addInStartTiming(Object obj);
    public long addInMiddleTiming(Object obj);
    public long addInEndTiming(Object obj);
    public long getFromTheMiddle();
    public long getFromTheStart();
    public long getFromTheEnd();
    public long removeFromTheStart();
    public long removeFromTheMiddle();
    public long removeFromTheEnd();


}
