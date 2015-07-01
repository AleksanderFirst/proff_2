package home_task_2.collection_analyser;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by Антон on 01.07.2015.
 */
public class ArrayListAnalyserImpl implements ICollectionAnalyser {
    private static final int CONST = 10;
    List<String> strings = new ArrayList<String>();
    public long getAddTime() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            strings.add("A");
        }
        return System.currentTimeMillis() - time;
    }

    public long getContainsTime() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            strings.contains("A");
        }
        return System.currentTimeMillis() - time;
    }

    public long getRemoveIndexTime() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            strings.remove(0);
        }
        return System.currentTimeMillis() - time;
    }

    public long getGetTime() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            strings.get(0);
        }
        return System.currentTimeMillis() - time;
    }

    public long getSetTime() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            strings.set(0, "A");
        }
        return System.currentTimeMillis() - time;
    }

    public long getAddIndexTime() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            strings.add(0,"A");
        }
        return System.currentTimeMillis() - time;
    }

    public long getRemoveObjectTime() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            strings.remove("A");
        }
        return System.currentTimeMillis() - time;
    }

    public long getIndexOfTime() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            strings.indexOf("A");
        }
        return System.currentTimeMillis() - time;
    }
}
