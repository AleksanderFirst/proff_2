package examples.collection;

import java.util.ArrayList;

/**
 * Created by randriyanov on 30.06.15.
 */
public class ArrayListAnalyzerImpl implements ICollectionAnalyzer {
    private ArrayList<String> testArrayList = new ArrayList<String>();

    public long getAddTime() {
        long timeBefore = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++) {
            testArrayList.add("collection.Company");
        }
        return System.currentTimeMillis() - timeBefore;
    }

    public long getSetTime() {
        return 0;
    }

    public long timeForGet() {
        return 0;
    }

    public long timeAddInBegin() {
        long timeBefore = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++) {
            testArrayList.add(0, "collection.Company");
        }
        return System.currentTimeMillis() - timeBefore;
    }
}
