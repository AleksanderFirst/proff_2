package tasks.tester;

import java.util.*;

/**
 * Created by artem on 01.07.15.
 */
public class ArrayListTester implements ICollectionTester{
    ArrayList list;
    public ArrayListTester(ArrayList list){
        this.list = list;
    }


    @Override
    public long addInStartTiming(Object obj) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            list.add(0, obj);}
        return System.currentTimeMillis() - time;
    }

    @Override
    public long addInMiddleTiming(Object obj) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            list.add(list.size() / 2, obj);
        }
        return System.currentTimeMillis() - time;
    }

    @Override
    public long addInEndTiming(Object obj) {
        list.trimToSize();
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            list.add(obj);
        }
        return System.currentTimeMillis() - time;
    }
}
