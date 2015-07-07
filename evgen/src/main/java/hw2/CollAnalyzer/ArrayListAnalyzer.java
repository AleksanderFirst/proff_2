package hw2.CollAnalyzer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Евгений on 07.07.2015.
 */
public class ArrayListAnalyzer implements ICollectionAnalyzer{
    ArrayList<String> arrayList = new ArrayList<String>();
    @Override
    public long addInStart() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0, "Something");}
        return System.currentTimeMillis() - time;
    }

    @Override
    public long addInMiddle() {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(arrayList.size() / 2, "Something");
        }
        return System.currentTimeMillis() - time;
    }

    @Override
    public long addInEnd() {
        arrayList.trimToSize();
        long time = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.add("Something");
        }
        return System.currentTimeMillis() - time;
    }
}
