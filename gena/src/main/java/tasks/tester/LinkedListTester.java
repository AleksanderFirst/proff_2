package tasks.tester;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTester implements ICollectionTester {
    List list;
    public LinkedListTester(LinkedList list){
        this.list = list;
    }

    public long getFromTheMiddle() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            Object object = list.get(list.size() / 2);}
        return System.currentTimeMillis() - time;
    }

    public long getFromTheStart() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            Object object = list.get(0);}
        return System.currentTimeMillis() - time;
    }

    public long getFromTheEnd() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            Object object = list.get(list.size()-1);}
        return System.currentTimeMillis() - time;
    }

    public long removeFromTheStart() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            list.remove(0);}
        return System.currentTimeMillis() - time;
    }

    public long removeFromTheMiddle() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            Object object = list.remove(list.size()/2);}
        return System.currentTimeMillis() - time;
    }

    public long removeFromTheEnd() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            Object object = list.get(list.size() -1);}
        return System.currentTimeMillis() - time;
    }

    public long addInStartTiming(Object obj) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
        list.add(0, obj);}
        return System.currentTimeMillis() - time;
    }

    public long addInMiddleTiming(Object obj) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            list.add(list.size() / 2, obj);
        }
        return System.currentTimeMillis() - time;
    }

    public long addInEndTiming(Object obj) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            list.add(obj);
        }
        return System.currentTimeMillis() - time;
    }
}
