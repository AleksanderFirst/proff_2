package home_task_2.collection_analyser;

import home_task_2.MyArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Антон on 01.07.2015.
 */
public class MyArrayListAnalyserImpl implements ICollectionAnalyser{
    private static final int CONST = 10;
    List<String> strings = new MyArrayList<String>();
    public long getAddTime() {
        long time = System.nanoTime();
        for (int i = 0; i < CONST; i++) {
            strings.add("A");
        }
        return System.nanoTime() - time;
    }

    public long getContainsTime() {
        long time = System.nanoTime();
        for (int i = 0; i < CONST; i++) {
            strings.contains("A");
        }
        return System.nanoTime() - time;
    }

    public long getRemoveIndexTime() {
        long time = System.nanoTime();
        for (int i = 0; i < CONST; i++) {
            strings.remove(0);
        }
        return System.nanoTime() - time;
    }

    public long getGetTime() {
        long time = System.nanoTime();
        for (int i = 0; i < CONST; i++) {
            strings.get(0);
        }
        return System.nanoTime() - time;
    }

    public long getSetTime() {
        long time = System.nanoTime();
        for (int i = 0; i < CONST; i++) {
            strings.set(0, "A");
        }
        return System.nanoTime() - time;
    }

    public long getAddIndexTime() {
        long time = System.nanoTime();
        for (int i = 0; i < CONST; i++) {
            strings.add(0,"A");
        }
        return System.nanoTime() - time;
    }

    public long getRemoveObjectTime() {
        long time = System.nanoTime();
        for (int i = 0; i < CONST; i++) {
            strings.remove("A");
        }
        return System.nanoTime() - time;
    }

    public long getIndexOfTime() {
        long time = System.nanoTime();
        for (int i = 0; i < CONST; i++) {
            strings.add("A");
        }
        return System.nanoTime() - time;
    }
}
