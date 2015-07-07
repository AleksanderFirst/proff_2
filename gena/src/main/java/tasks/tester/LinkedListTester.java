package tasks.tester;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTester implements ICollectionTester {
    List list;
    public LinkedListTester(LinkedList list){
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
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            list.add(obj);
        }
        return System.currentTimeMillis() - time;
    }
}
